package com.javaex.practice;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.println("잘못된 사번입니다.");
			return ;
		}
		int teamNum = num % 3;
		
		switch (teamNum) {
		case 0: {
			System.out.println("A팀입니다.");
			break ;
		}
		case 1: {
			System.out.println("B팀입니다.");
			break ;
		}
		case 2: {
			System.out.println("C팀입니다.");
			break ;
		}
		default:
			System.out.println("잘못된 입력값입니다.");
			break ;
		}
		
		sc.close();
	}
}
