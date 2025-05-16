package com.practice;

import java.util.Scanner;

public class mainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Multiplication multi = new Multiplication();
		System.out.println("Enter the number to perform table");

		int table=sc.nextInt();
		//multi.print(table);
		multi.print(table, 1, 4);

		TimeConverter timec = new TimeConverter();
		System.out.println("Enter hours to convert into minutes: ");
		int hr = sc.nextInt();
		timec.hoursToMinutes(hr);
		System.out.println("Enter days to convert into minutes: ");
		int dy = sc.nextInt();
		timec.daysToMinutes(dy);

		ExamResult result = new ExamResult();
		System.out.println("Enter marks obtained: ");
		int marks = sc.nextInt();
		result.examResult(marks);

		SquareSum sqrsum = new SquareSum();
		sqrsum.squaresum(5);

	}

}
