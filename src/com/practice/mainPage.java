package com.practice;

import java.util.Scanner;

public class mainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Multiplication multi = new Multiplication();
		System.out.println("Enter the number to perform table");
		int table=sc.nextInt();
		multi.print(table);
		

	}

}
