package com.technologies.transition.scrabler;

import java.util.Random;
import java.util.Scanner;

public class Scrabble {

	Random r = new Random(System.currentTimeMillis());
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String j = in.nextLine();
		Scrabble j1 = new Scrabble();
		j1.dothemagic(j);
	}

	void dothemagic(String j) {

		String tot = "";
		String tot1 = "";
		if (j != null) {
			
			String[] k_1 = j.split(" ");
			
			for (int i = 0; i< k_1.length; i ++) {
				
				tot1 = k_1[i];
				
				if (tot1.length() > 3) {
					int l1 = r.nextInt(tot1.length()-1) +1;
					int l2 = r.nextInt(tot1.length()-1) +1;
					while (l2 == l1) {
						l2 = r.nextInt(tot1.length()-1) +1;						
					}
					
					char c1 = tot1.charAt(l1);
					char c2 = tot1.charAt(l2);
					
					String u = "";
					for (int o = 0; o < tot1.length(); o++) {
		if (o != l1 && o != l2) {
								u += tot1.charAt(o);
			} else if (o == l1) {
							u += tot1.charAt(l2); 
						} else if (o == l2) {
							u += tot1.charAt(l1);
						}
					}
					tot += u + " ";
					
														} else {
															tot += tot1 + " ";
																				}
				
				
			}
						
		}
		
		
		System.out.println(tot);
	}

}