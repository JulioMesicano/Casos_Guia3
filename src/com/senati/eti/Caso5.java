package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numero = new int[5];
		
		int num_menor = 0;
		
		for (int x = 0 ; x < numero.length; x++) {
		     System.out.print("Numero "+ (x+1)+ ":");
		     numero[x] = sc.nextInt();  
		     if (x==0) {
	    	 
	    	 num_menor = numero[0];
	         }
	    	
	    
	         if (numero[x] < num_menor) num_menor = numero[x];
		}
		System.out.println("Numero menor........ :" + num_menor);
	}

}
