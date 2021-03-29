package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero....:");
		int n = sc.nextInt();
		
		System.out.println("\nTabla del "+n);
		System.out.println("============");
		
		for (int i = 1; i<= 15 ; i++)
			System.out.println(n + "x" + i + "=" + (n*i));
		
		System.out.println("\n");
		// Multiplicar solo por los pares 
				
		for (int i = 2; i<= 16 ; i+=2)
			System.out.println(n + "x" + i + "=" + (n*i));
		
		System.out.println("\n");
		
		//Para saber multiplos de 3
		
		for (int i = 2; i<= 16 ; i++) {
			if (i%3==0)
			System.out.println(n + "x" + i + "=" + (n*i));
		
		}
		
		

	}

}
