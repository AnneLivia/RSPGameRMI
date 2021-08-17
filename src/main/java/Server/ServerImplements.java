/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import RMI.RemoteInterface;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

/**
 *
 * @author annel
 */
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface {
    
    public ServerImplements() throws RemoteException {
        super();
    }
    
    @Override
    public String escolhaDoServidor() throws RemoteException {
        String [] escolhas = {"rock", "scissors", "paper"};
        
        // gerar indidice aleatorio de 0 a 2, para pegar alguma escolha do server
        Random random = new Random();
        int index  = random.nextInt(3);
        
        return escolhas[index];
    }
    
    @Override
    public String vencedor(String usuario, String servidor) {
        // pedra quebra tesoura, tesoura corta papel e papel amassa a pedra
        if (usuario.equals("rock") && servidor.equals("scissors") ||
            usuario.equals("scissors") && servidor.equals("paper") ||
            usuario.equals("paper") && servidor.equals("rock"))
            return "usuario";
        else if (servidor.equals("rock") && usuario.equals("scissors") ||
                servidor.equals("scissors") && usuario.equals("paper") ||
                servidor.equals("paper") && usuario.equals("rock"))
            return "servidor";
        
        // draw é empate
        return "draw";
    }
    
}