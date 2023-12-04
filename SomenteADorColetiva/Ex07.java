package somenteADorColetiva;

public class Exercicio07 {
	public static void main(String[]args) {
		for(int i = 1; i < 6; i++) {
			if(i ==3) {
				break;
			}else {
			
			switch (i) {
			case 1:
				System.out.println("Número um");
				break;

			case 2:
				System.out.println("Número dois");
				break;

			case 4:
				System.out.println("Número quatro");
				break;

			case 5:
				System.out.println("Número cinco");
				break;

			default:
				System.out.println("Valor inválido");
				break;
			}
			}
		}
	}
}
