//Projeto desafio DIO Claro Java Spring Boot
package br.edu.dio.main;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número da conta: ");
		numero = scan.nextInt();
		System.out.println("Digite a agência da conta: ");
		agencia = scan.next();
		System.out.println("Digite o nome do proprietário da conta: ");
		nomeCliente = scan.next();
		System.out.println("Insira o saldo da conta: ");
		saldo = scan.nextDouble();
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
		scan.close();
	}

}
