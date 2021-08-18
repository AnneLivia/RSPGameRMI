
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annel
 */


public class Server  {
    public static void main(String[] args) {
        try {
            // cria objeto para se tornar acessivel via rede
            ICalculadora calc = new Calculadora();
            // criar o nome que o usuário ira utilizar para chamar esse objeto, o nome será calc;
            String objName = "rmi://localhost/calc";
            System.out.println("Registrando o objeto no RMIRegistry");
            // é preciso registrar, permite executar o servidor de nomes diretamente no servidor
            LocateRegistry.createRegistry(1099); // porta 1099 - porta padrão do rmi
            Naming.rebind(objName, calc); // associa o nome calc ao objeto
            
            System.out.println("Aguardando os clientes");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
