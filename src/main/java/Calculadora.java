
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annel
 */

// a implementação da calculadora dever ser aqui no servidor 
// todas as classes fornecidads via rede de computadores deve extender o UnicastRemoteObject e implementar a interface que é um remote
public class Calculadora extends UnicastRemoteObject implements ICalculadora {
    
    public Calculadora() throws RemoteException {
        super();
    }
    
    @Override
    public int add(int n1, int n2) throws RemoteException {
        return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) throws RemoteException {
        return n1 - n2;
    }

    @Override
    public int mult(int n1, int n2) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return n1 * n2;
    }

    @Override
    public double div(int n1, int n2) throws RemoteException {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return n1 / n2;
    }
}