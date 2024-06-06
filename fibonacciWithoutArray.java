package com.example.dsa.dynamixProgramming;

import java.util.Scanner;

public class fibonacciWithoutArray {
	//TC-O(N)
	// SC--O(N)-------------------because array isnt used.
	static int fib(int n) {
		if(n<=0) return n;
		int prev2=0;
		int prev =1;
		int curr=0;
		for(int i=2;i<=n;i++) {
			curr=prev +prev2;
			prev2=prev;
			prev=curr;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci series Nth number using Recursion");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("fibonacci nth number ="+fib(n));
	}
}
