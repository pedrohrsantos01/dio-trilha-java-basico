package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agencia!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o Saldo da conta!");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
