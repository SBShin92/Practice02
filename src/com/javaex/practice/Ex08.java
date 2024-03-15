package com.javaex.practice;

import java.util.Scanner;

/* [Ex08.java]
사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
*/

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해 주십시오");
		System.out.print("키:");
		double height = sc.nextDouble();
		System.out.print("몸무게:");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height / 10000);
		
		if (weight <= 0 || height <= 0)
			System.out.println("키와 몸무게의 값이 정상적인지 확인하세요.");			
		else if (bmi >= 18.5 && bmi <=24.9)
			System.out.println("정상체중입니다.\nBMI:" + bmi);
		else if (bmi > 24.9)
			System.out.println("과체중입니다.\nBMI:" + bmi);
		else if (bmi < 18.5)
			System.out.println("저체중입니다.\nBMI:" + bmi);
		
		sc.close();
		
	}
	
}
