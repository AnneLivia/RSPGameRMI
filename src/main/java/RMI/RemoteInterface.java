/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author annel
 */
public interface RemoteInterface extends Remote {
    public String escolhaDoServidor() throws RemoteException;
    public String vencedor(String usuario, String servidor) throws RemoteException;
}
