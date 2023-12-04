package somenteADorColetiva;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("Informe um valor");
			int numero = leia.nextInt();
			if(numero == 0) {
				break;
			}else {
				System.out.println("O valor informado é: " + numero);
			}		
		}while(i<1);
		leia.close();
	}
}
