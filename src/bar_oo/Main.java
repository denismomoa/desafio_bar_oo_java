package bar_oo;
import java.util.Locale;
import java.util.Scanner;

import entities.Bill;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill x;	
		x = new Bill();
		
		System.out.print("Sexo: ");
		x.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		x.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		x.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		x.barbecue = sc.nextInt();
		
		double consumo = x.feeding();
		double couvert = x.cover();
		double ingresso = x.ticket();
		double total = x.total();
		
		System.out.println();
		
		System.out.println("RELATÓRIO");
		System.out.printf("Consumo: R$ %.2f%n", consumo);
		
		if(couvert == 4) {
			System.out.printf("Couvert: R$ %.2f%n", couvert);
		}
		else {
			System.out.println("Isento de Couvert");
		}
		
		System.out.printf("Ingresso: R$ %.2f%n", ingresso);
		
		System.out.println();	
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		sc.close();

	}

}
