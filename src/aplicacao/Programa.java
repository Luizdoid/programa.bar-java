package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				int cerva,espeto, refri;
				char sexo;
				double ccerva, eespeto, rrefri, ingresso, consumo, pagar, couvert;
				System.out.println("Sexo: ");
		        sexo = sc.next().charAt(0);

		        System.out.println("Quantidade de cervejas: ");
		        cerva = sc.nextInt();

		        System.out.println("Quantidade de refrigerantes: ");
		        refri = sc.nextInt();

		        System.out.println("quantidade de espetinhos");
		        espeto = sc.nextInt();
		        
		        // 2 Calculos
		        
		        couvert = 0.00;
		        ingresso = 0.00;
		        ccerva = cerva * 5;
		        eespeto = espeto * 7;
		        rrefri = refri * 3;
		        if (sexo == 'f' || sexo == 'F') {
		            ingresso = ingresso + 8.00;
		        } else {
		            if (sexo == 'm' || sexo == 'M') {
		                ingresso = ingresso + 10.00;
		            }
		        }
		        consumo = ccerva + eespeto + rrefri;
		        if (consumo < 30) {
		            couvert = couvert + 4.00;
		        }
		        	
		        
		        // 3 RELATORIO
		        
		        pagar = consumo + ingresso + couvert;
		        System.out.println("RELATÓRIO:");
		        System.out.println();
		        System.out.printf("Consumo = R$ %.2f%n", consumo);
		        if (consumo > 30.00) {
		            System.out.println("Isento de Couvert");
		        } else {
		            System.out.printf("Couvert = R$ %.2f%n", couvert);
		        }
		        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
		        System.out.println();
		        System.out.printf("TOTAL A PAGAR = R$ %.2f", pagar);


		
		sc.close();
	}

}
