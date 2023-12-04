package somenteADorColetiva;

public class Exercicio04 {
	public static void main(String[]args) {
		int i = 1;
		int j = 1;
		while(i < 6) {
			j=1;
			while(j < 6) {
				if(j == 3) {
					
					j++;
					continue;
				}
				System.out.println(j);
				j++;
			}
			System.out.println(i);
			i++;
		}
	}
}
