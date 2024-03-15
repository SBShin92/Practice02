package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double money = sc.nextDouble();
	
		double tax = 0;
		
		if (money >= 8000) {
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(money-8000);
			
		} else if (money > 4000) {
			tax = 1000*0.09 + 3000*0.18 + 0.27*(money-4000);
		} else if (money > 1000) {
			tax = 1000*0.09 + 0.18*(money-1000);
		} else if (money >= 0) {
			tax = 0.09 * money;
		} else {
			tax = -1;
		}
			
		if (tax == -1) {
			System.out.println("잘못 입력했습니다.");
		} else {
			System.out.println("소득세는 " + tax + " 입니다.");
		}
		
		sc.close();
	}

}
