package com.practice;

public class ExamResult {
	public boolean examResult(int result) {
		if (result < 50) {
			System.out.println("failed");
			return false;
		} else {
			System.out.println("marks are greter than 50");
			return result > 50;
		}


	}
}
