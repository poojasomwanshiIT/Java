package com.practice;

public class SquareSum {
	int sum = 0;
	public void squaresum(int n) {
		for (int i = 1; i <= n; i++) {
			int sqr = i * i;
			System.out.println(sqr);
			sum = sum + sqr;


		}
		System.out.println(sum);
	}

}
