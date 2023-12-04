package somenteADorColetiva;

public class Exercicio03 {
	public static void main(String[]args) {
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 5; j++) {
				if(j == 4) {
					break;
				}
				System.out.println(j);
			}
			
			System.out.println(i);
		}
	}
}
