
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annel
 */

// RMI é muito parecido com o RPC, só que o RPC está direcionado para a manipulação de funções, já o RMI chama metódos 
// mas o contexto é o mesmo

// é preciso definir as funções que serão fornecidas pelo servidor, para isso é preciso definir uma interface que extends
// remote, e essa chamada de metodos pode gerar exceções, por ser web, etc. então é necessário usar o throws RemoteException
public interface ICalculadora extends Remote {
    public int add(int n1, int n2) throws RemoteException;
    public int sub(int n1, int n2) throws RemoteException;
    public int mult(int n1, int n2) throws RemoteException;
    public double div(int n1, int n2) throws RemoteException;
}
