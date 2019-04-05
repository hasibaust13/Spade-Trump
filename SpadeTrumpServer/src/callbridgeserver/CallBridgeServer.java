/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package callbridgeserver;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Sanim
 */
public class CallBridgeServer {

    /**
     * @param args the command line arguments
     */
    static int Max_client = 4;
    static String name[] = new String[4];
    static boolean flag[] = new boolean[4];
    static int ids[] = new int[4];
    static DataInputStream inputS[] = new DataInputStream[4];
    static DataOutputStream outputS[] = new DataOutputStream[4];
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket sc = new ServerSocket(420);
        while(true){
            Socket sock = sc.accept();
            int cnt = -1;
            for(int i = 0;i<4;i++){
                if(!flag[i]){
                    cnt = i;
                    break;
                }
            }
            DataInputStream DI = new DataInputStream(sock.getInputStream());
            DataOutputStream DO = new DataOutputStream(sock.getOutputStream());
            if(cnt == -1) {
                DO.writeUTF("Player Full");
                continue;
            }
            
            String st = DI.readUTF();
            name[cnt] = st;
            inputS[cnt] = DI;
            outputS[cnt] = DO;
            flag[cnt] = true;
            DO.writeUTF("ok");
       
            
            System.out.println(cnt);
            cnt = -1;
            for(int i = 0;i<4;i++){
                if(!flag[i]){
                    cnt = i;
                    break;
                }
            }
            if(cnt == -1){
                startGame();
            }
        }
    }
    static void startGame(){
        System.out.println(":)");
       Thread tt = new Thread(new GameThread());
        tt.start();
    }
}
