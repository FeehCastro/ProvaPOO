/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

/**
 *
 * @author felip
 */
public class ProvaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(101010);
        p1.setDono("Matheus");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(202020);
        p2.setDono("Joaquim");
        p2.abrirConta("CP");
        
        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(303030);
        p3.setDono("Maiara");
        p3.abrirConta("CC");
        
        p1.depositar(100);
        p2.depositar(500);
        p3.depositar(800);
        
        p2.sacar(500);
        p2.sacar(150);
        
        
        
        
        p1.sacar(150);
        p1.fecharConta();
        
        p3.pagarMensal();
        p2.pagarMensal();
        
      
        p1.estadoAtual();
        p2.estadoAtual();
        p3.estadoAtual();
    }
    
}
