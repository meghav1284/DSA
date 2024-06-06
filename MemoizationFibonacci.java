package com.example.dsa.dynamixProgramming;

import java.util.Scanner;

public class MemoizationFibonacci {

		// TC=O(N);
		// SC= O(2N);
		static int fib(int n) {
			int[] dp=new int[n+1];
			if(n<=1) return n;
			if(dp[n]!=0) return dp[n];
			return dp[n]=fib(n-1)+fib(n-2);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Fibonacci series Nth number using Recursion");
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("fibonacci nth number ="+fib(n));
		}

}
