package somenteADorColetiva;

public class Exercicio06 {
	public static void main(String[]args) {
		int i = 1;
		while(i < 11) {
			if(i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
