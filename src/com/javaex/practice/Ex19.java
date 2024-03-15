package com.javaex.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int num = sc.nextInt();
		
		LocalDate now = LocalDate.now();
		int nowYear = now.getYear();
		int inputYear = nowYear - num;
		
		if (inputYear >= 15 && inputYear < 65)
			System.out.println(inputYear + "살 무료예방접종 대상자가 아닙니다");
		else
			System.out.println(inputYear + "살 무료예방접종 대상자 입니다");
		
		
		sc.close();
	}
	
	
}
