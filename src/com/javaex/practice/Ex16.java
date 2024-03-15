package com.javaex.practice;

import java.util.Scanner;

/* [Ex16.java]
다음과 같이 정의되는 함수의 함수 값을 계산해보자
𝒇(𝒙) = {
𝒙
𝟑 − 𝟗𝒙 + 𝟐 , 𝒙 ≤ 𝟎 (𝒙가 𝟎보다 작거나 같으면 이식을 사용)
𝟕𝒙 + 𝟐 , 𝒙 > 𝟎 (𝒙가 𝟎보다 크면 이식을 사용
*/

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		double x = sc.nextDouble();
	
		double result = 0;
		
		if (x <= 0) {
			result = (x * x * x) - (9 * x) + 2;
		} else {
			result = (7 * x) + 2;
		}
		System.out.println("계산결과는 " + result + " 입니다.");
		
		sc.close();
		
	}
}
