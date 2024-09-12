package org.example;


import java.util.Scanner;

public class CuentaTerminal {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int numeroCuenta=0;
        String agencia="";
        String nombreCliente="";
        double saldo=0;

        System.out.println("Ingrese su nombre:");
        nombreCliente=datos.nextLine();
        System.out.println("Ingrese su agencia:");
        agencia=datos.nextLine();
        System.out.println("Ingrese su numero de cuenta:");
        numeroCuenta=datos.nextInt();
        System.out.println("Ingrese su saldo:");
        saldo=datos.nextDouble();

        System.out.println("Bienvenido/a "+nombreCliente+",gracias por crear una cuenta en nuestro banco, su agencia es "+agencia+",cuenta "+numeroCuenta+",y su saldo es "+saldo);


    }
}