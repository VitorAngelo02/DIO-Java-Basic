package edu.vitor.primeirasaulas;

public class MinhaClasse {
    
public static void main (String [] args) {
    boolean condicao1 = true;
    boolean condicao2 = false;
    
    if(condicao1 && condicao2) {
        System.out.print("Ambas as condições são verdadeiras");
    }
    
    if(condicao1 || condicao2) {
        System.out.print("Uma das condições é verdadeira");
    }
}

}