
package callbridgeclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientThread extends Thread {

    DataInputStream DI = null;
    DataOutputStream DO = null;

    ClientThread(DataInputStream _DI, DataOutputStream _DO) {
        DI = _DI;
        DO = _DO;
    }

    public void run() {
        while (true) {
            try {
                String st = DI.readUTF();
                System.out.println(st);
                if (st.equals("ready")) {
                    ClientPage.cg.startGame();
                    
                } else if (st.equals("set")) {
                    int id = DI.readInt();
                    PreGameMode.cc.set(id);
                } else if (st.equals("card")) {
                    int a = DI.readInt();
                    int b = DI.readInt();
                    PreGameMode.cc.add(new Card(a, b));
                } else if (st.equals("finish")) {
                    PreGameMode.cc.Sort();
                    PreGameMode.cc.initButton();
                }
                else if(st.equals("call")){
                     PreGameMode.cc.setVis();
                }else if(st.equals("move")){
                    int a = DI.readInt();
                    int b = DI.readInt();
                    PreGameMode.cc.LL.add(new Card(a,b));
                    String ss = String.valueOf(a) + "_" + String.valueOf(b)+".png";
                    PreGameMode.cc.setMove(ss);
                }else if(st.equals("oneGameFinish")){
                    PreGameMode.cc.LL.clear();
                    int num = DI.readInt();
                    PreGameMode.cc.tot += num;
                    PreGameMode.cc.setTot();
                }else if(st.equals("pointGain")){
                    PreGameMode.cc.pointGain++;
                    PreGameMode.cc.setPg();
                }
                else {
                    int id = DI.readInt();
                }
            } catch (IOException ex) {
                Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
