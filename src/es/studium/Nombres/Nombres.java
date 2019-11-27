package es.studium.Nombres;

import java.util.Scanner;

public class Nombres {
public static void main(String[] args){

				Scanner teclado = new Scanner(System.in);

				String n1,n2,n3,n4,n5;

				

				

				System.out.println("Escriba un nombre:");

				n1 = teclado.next();
				System.out.println("Escriba otro nombre:");

				n2 = teclado.next();
				System.out.println("Escriba otro nombre:");

				n3 = teclado.next();
				System.out.println("Escriba otro nombre:");

				n4 = teclado.next();
				System.out.println("Escriba otro nombre:");

				n5 = teclado.next();

				

				System.out.println(n1+ " " +n2+ " "+n3+" "+n4+" "+n5);
				teclado.close();

}}