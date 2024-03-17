package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String alp = sc.nextLine();
		
		switch (alp) {
		case "a": // intentional fallthrough
		case "e":
		case "i":
		case "o":
		case "u":	{
			System.out.println("모음입니다.");
			break ;
		}
		default:
			System.out.println("자음입니다.");
			break ;
		}
		
		sc.close();
	}

}
