package com.example.dsa.dynamixProgramming;

import java.util.Scanner;

public class TabulizationFibonacci {

			// TC=O(N);
			// SC= O(N);----------better solution but not the best.
			static int fib(int n) {
				int[] dp=new int[n+1];
				dp[0]=0;
				dp[1]=1;
				for(int i=2;i<=n;i++) {
					dp[i]=dp[i-1]+dp[i-2];
				}
				return dp[n];
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("Fibonacci series Nth number using Recursion");
				Scanner sc= new Scanner(System.in);
				int n=sc.nextInt();
				System.out.println("fibonacci nth number ="+fib(n));
			}

}
