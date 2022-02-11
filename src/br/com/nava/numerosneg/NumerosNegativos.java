package br.com.nava.numerosneg;

import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in); 
		
        System.out.print("Quantos números você vai digitar? ");   
        int n = sc.nextInt();   
        int[] valor = new int[n];   
          
        int nmr;
		for(nmr = 0; nmr < n; nmr++) {   
           System.out.print("Digite um número: ");
           valor[nmr] = sc.nextInt();   
        }   
		System.out.println();
		
		for(nmr = 0; nmr < n; nmr++){
			if (valor[nmr] < 0) {
				System.out.println("Números Negativos: " + valor[nmr]);
			}
		}
		System.out.println();
		System.out.println("FIM");
	}
}	
