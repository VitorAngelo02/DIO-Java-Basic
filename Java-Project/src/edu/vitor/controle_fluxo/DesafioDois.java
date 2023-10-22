package edu.vitor.controle_fluxo;

// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class DesafioDois {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++)
			nomes[i] = sc.nextLine();
    
	sc.close();
    System.out.println(nomes[2]);
    System.out.println(nomes[7]);
    System.out.println(nomes[8]);
	}
}