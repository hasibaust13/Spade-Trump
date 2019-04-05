package callbridgeserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameThread extends Thread {

    static int ids[] = new int[4];
    static int count = 0;
    static boolean f;
    List<Card> L;

    GameThread() throws IOException {
        for (int i = 0; i < 4; i++) {
            ids[i] = i;
        }
        L = new ArrayList();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                L.add(new Card(i, j));
            }
        }
        for (int i = 0; i < 4; i++) {
            CallBridgeServer.outputS[ids[i]].writeUTF("ready");
        }

    }

    void cycle() {
        int tmp = ids[0];
        for (int i = 0; i < 3; i++) {
            ids[i] = ids[i + 1];
        }
        ids[3] = tmp;

    }

    public void run() {
        while (true) {
            try {
                System.out.println(":)");

                long seed = System.nanoTime();
                Collections.shuffle(L, new Random(seed));
                for (int i = 0; i < 52; i++) {
                    Card c = L.get(i);
                    CallBridgeServer.outputS[ids[i % 4]].writeUTF("card");
                    CallBridgeServer.outputS[ids[i % 4]].writeInt(c.a);
                    CallBridgeServer.outputS[ids[i % 4]].writeInt(c.b);
                }
                for (int i = 0; i < 4; i++) {
                    CallBridgeServer.outputS[ids[i]].writeUTF("finish");
                }
                int cc[] = new int[4];
                int ccc[] = {0, 0, 0, 0};
                for (int i = 0; i < 4; i++) {
                    CallBridgeServer.outputS[ids[i]].writeUTF("call");
                    cc[i] = CallBridgeServer.inputS[ids[i]].readInt();
                }

                int cnt = 0;
                for (int j = 0; j < 13; j++) {
                    CallBridgeServer.outputS[ids[cnt]].writeUTF("set");
                    CallBridgeServer.outputS[ids[cnt]].writeInt(1);
                    List<CardMove> move = new ArrayList();
                    count = 0;
                    int colour;
                    for (int i = 0; i < 4; i++) {
                        int a = CallBridgeServer.inputS[ids[(i + cnt) % 4]].readInt();
                        int b = CallBridgeServer.inputS[ids[(i + cnt) % 4]].readInt();
                        CallBridgeServer.outputS[ids[(i + cnt) % 4]].writeUTF("set");
                        CallBridgeServer.outputS[ids[(i + cnt) % 4]].writeInt(0);
                        if (i < 3) {
                            CallBridgeServer.outputS[ids[(i + 1 + cnt) % 4]].writeUTF("set");
                            CallBridgeServer.outputS[ids[(i + 1 + cnt) % 4]].writeInt(1);
                        }
                        move.add(new CardMove(a, b, (i + cnt) % 4));
                        if (i == 0) {
                            colour = a;
                        }
                        for (int k = 0; k < 4; k++) {
                            CallBridgeServer.outputS[ids[k]].writeUTF("move");
                            CallBridgeServer.outputS[ids[k]].writeInt(a);
                            CallBridgeServer.outputS[ids[k]].writeInt(b);
                        }
                    }
                    CardMove ans = move.get(0);
                    for (int i = 1; i < 4; i++) {
                        CardMove tmp = move.get(i);
                        if (tmp.a == ans.a) {
                            if (tmp.b > ans.b) {
                                ans = tmp;
                            }
                        } else if (tmp.a == 0) {
                            ans = tmp;
                        }
                    }
                    ccc[ans.c]++;
                    cnt = ans.c;
                    CallBridgeServer.outputS[ids[ans.c]].writeUTF("pointGain");
                }

                for (int i = 0; i < 4; i++) {
                    if (ccc[i] < cc[i] || ccc[i] - cc[i] >= 2) {
                        CallBridgeServer.outputS[ids[i]].writeUTF("oneGameFinish");
                        CallBridgeServer.outputS[ids[i]].writeInt(-cc[i]);
                    } else {
                        CallBridgeServer.outputS[ids[i]].writeUTF("oneGameFinish");
                        CallBridgeServer.outputS[ids[i]].writeInt(cc[i]);
                    }
                }

                cycle();
            } catch (IOException ex) {
                Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
