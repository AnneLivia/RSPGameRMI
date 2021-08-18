
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annel
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            ICalculadora calculadora = (ICalculadora) Naming.lookup("rmi://localhost/calc");
            System.out.println("Adição 10 + 15: " + calculadora.add(10, 15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
