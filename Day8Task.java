package sample1;

import java.util.Scanner;

public class Day8Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Q1) Greater value:
		
		
		int a = 20, b = 15, c = 10, d = 5;
		if ((a+b)>(c+d)) {
			System.out.println("Sum of a and b is greater than sum of c and d");
		}
		
// Q2) Odd or Even:
		
		int a = 11;
		if((a%2)==0) {
			System.out.println(a+" is an even number");
		}
		else {
			System.out.println(a+" is an odd number");
		}
		
		
// Q3 Print A-Z:
		
		char c;
		for(c='A'; c<='Z'; c++) {
			System.out.print(c+" ");
	}
		
		
// Q4) Swap values:
		
		Scanner swap = new Scanner(System.in);
		int x,y,t;
		System.out.println("Enter X value : ");
		x = swap.nextInt();
		System.out.println("Enter Y value : ");
		y = swap.nextInt();
		System.out.println("Before swap X = "+x+" Y = "+y);
		t = x;
		x = y;
		y = t;
		System.out.println("After swap X = "+x+" Y = "+y);
		
		
// Q5) To check Prime or not:
		
		int i,n,m,a = 0;
		Scanner prime = new Scanner(System.in);
		System.out.println("Enter number to check : ");
		n = prime.nextInt();
		m = n/2;
		if(n == 0 || n == 1) {
			System.out.println(n+" is not a prime number");
		}
		else {
			for(i=2; i<=m; i++) {
				if((n%i)==0) {
					System.out.println(n+" is not a prime number");
					a = 1;
					break;
				}
			}
			if(a==0) {
				System.out.println(n+" is a prime number");
			}
		}
		
		
// Q6) Factorial:
		
		int a = 5,i,b = 1;
		for(i = 1; i<=a; i++) {
			b=i*b;
		}
		System.out.println(b);
		
		
// Q7) Length of the String:
		
		String a = "Guvi Geek";
		System.out.println(a.length());
		
// Q8) To repeat String 10 times:
		
		String a = "Welcome to Guvi";
		int i;
		for (i=1; i <=10; i++) {
			System.out.println(a);
		}
		
		
// Q9) Senior Citizen:
		
		int age;
		Scanner Age = new Scanner(System.in);
		System.out.println("Enter your age : ");
		age = Age.nextInt();
		if(age>=60 && age<=80) {
			System.out.println("Senior Citizen");
		}
		else if (age>=80) {
			System.out.println("Super snior Citizen");
		}
		else {
			System.out.println("Not senior citizen");
		}
		
		
// Q10) Number of digits in an integer
		
		int a = String.valueOf(546568).length();
		System.out.println(a);
	
		
		}
}