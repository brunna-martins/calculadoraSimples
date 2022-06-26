package aula5calculadora;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		// referenciacao
		Calculadora c1;
		
		// outros
		Scanner sc = new Scanner(System.in);
		
		// comeco
		System.out.print("Digite o primeiro operando: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo operando: ");
		int n2 = sc.nextInt();
		
		c1 = new Calculadora(n1, n2);
		
		System.out.print("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n");
		System.out.print("Digite o número da operação desejada: ");
		int escolha = sc.nextInt();
		
		switch (escolha) {
			case 1:
				c1.somar();
				System.out.print("A soma de "+n1+" e "+n2+ " é "+c1.somar()+".");
				break;
			case 2:
				c1.subtrair();
				System.out.print("A subtração de "+n1+" e "+n2+ " é "+c1.subtrair()+".");
				break;
			case 3:
				c1.multiplicar();
				System.out.print("A multiplicação de "+n1+" e "+n2+ " é "+c1.multiplicar()+".");
				break;
			case 4:
				c1.dividir();
				System.out.print("A divisão de "+n1+" e "+n2+ " é "+c1.dividir()+".");
				break;
			default: 
				System.out.print("Opção não reconhecida!");
		}
		
	}

}