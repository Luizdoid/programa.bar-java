package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				int cerva,espeto, refri;
				char sexo;
				
				System.out.println("Sexo: ");
		        sexo = sc.next().charAt(0);

		        System.out.println("Quantidade de cervejas: ");
		        cerva = sc.nextInt();

		        System.out.println("Quantidade de refrigerantes: ");
		        refri = sc.nextInt();

		        System.out.println("quantidade de espetinhos");
		        espeto = sc.nextInt();

		
		sc.close();
	}

}
