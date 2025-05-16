package com.practice;

public class Multiplication {
int multi;
	public void print(int num) {
		for(int i=1;i<=10;i++) {
			multi = num * i;
			System.out.println(multi);
		}
	}
	
	public void print(int num,int from, int to) {
		for(int i=from;i<=to;i++) {
			multi=num*i;
			System.out.println(multi);
		}
	}
	}
