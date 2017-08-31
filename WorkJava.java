package projectJava;

import java.util.Scanner;

public class WorkJava {
	private static Scanner in;

	public static void main(String[]args){
		in = new Scanner(System.in);
		String yourName;
		String productName;
		double valueProduct;
		int provision = 10;
		double finalValue;
		double interest = 5;
		double presc;
		System.out.print("Digite seu nome ou empresa: ");
		yourName = in.next();
		System.out.print("Digite o nome do produto: ");
		productName = in.next();
		System.out.print("Digite o valor do produto:");
		valueProduct = in.nextDouble();
		presc = provision*interest;
		finalValue = valueProduct+presc;
		
		System.out.print("A empresa ou pessoa "+yourName);
		System.out.print(" está comprando um "+productName);
		System.out.print(" no valor de "+valueProduct);
		System.out.print(" R$.");
		System.out.println(" O valor final será " +finalValue);
		System.out.print(" R$, em 10x.");
		System.out.println(" O valor final do "+productName);
		System.out.print(" a prazo será "+finalValue);
		System.out.println(" R$.");
		}
	}
