/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author annel
 */
public class ServerRMI {
    public static void main(String[] args) {
        try {
             // 1099 porta padrão RMI
            final int PORTA = 1099;
            // String dirIp = (InetAddress.getLocalHost()).toString();
            // System.out.println("Escutando em " + dirIp + " na porta: " + PORTA);
            // obtem o registro de RMI
            Registry registry = LocateRegistry.createRegistry(PORTA);
            // ppt de pedra papel e tesoura 
            registry.rebind("ppt", new ServerImplements());
            
            System.out.println("Servidor iniciado!");
            
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
