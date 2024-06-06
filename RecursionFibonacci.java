package com.example.dsa.recurssion;
import java.util.Scanner;

public class RecursionFibonacci {
	//TC= O(N^2)
	static int fib(int n) {
		if(n<=1) return n;
		return fib(n-1)+ fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci series Nth number using Recursion");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("fibonacci nth number ="+fib(n));
	}

}
