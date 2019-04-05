/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package callbridgeclient;

import java.io.IOException;

/**
 *
 * @author Sanim
 */
public class CallBridgeClient {

    /**
     * @param args the command line arguments
     */
    static ClientPage c;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        c = new ClientPage();
        c.setVisible(true);
    }
}
