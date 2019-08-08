package projects;

import java.util.Scanner;

public class Many_Class_Basic_Calculator_Part_2 {

	//Declares all the variables we are gonna need.
	
	private int num1;
	private String oper;
	private int num2;
	private int ans;
	private String cont;
	
	//The user Inputs his/her first number here
	public void first() {
		
		Scanner one = new Scanner(System.in);
		
		System.out.print("Please insert a number: ");
		num1 = one.nextInt();
		
	}
	
	//The user inputs the operator which they are gonna use here.
	public void operators() {
		
		Scanner op = new Scanner(System.in);
		
		System.out.print("Please insert an operator(i.e. +, -): ");
		oper = op.nextLine();
		
		
		
	}
	
	//The user inputs his/her second number here
	public void second() {
		
		Scanner two = new Scanner(System.in);
		
		System.out.print("Please insert a second number: ");
		num2 = two.nextInt();		
	}
	
	//This gives the answer based on what operator they used.
	public void answer() {
		
		if(oper.equals("+")) {
			ans = num1 + num2;
			System.out.println(ans);
		}else if(oper.equals("-")) {
			ans = num1 - num2;
			System.out.println(ans);
		}else if(oper.equals("*")) {
			ans = num1 * num2;
			System.out.println(ans);
		}else if(oper.equals("/")) {
			ans = num1 / num2;
			System.out.println(ans);
		}else if (oper.equals("%")) {
			ans = num1 % num2;
			System.out.println(ans);
		}else {
			System.out.println("ERROR");
			System.out.println("That is not an operator");
		}
		
		
	}
	
	//This asks if the user wants to re-run the program.
	//if:Yes then:re-run
	//else if:No then:stop
	public void cont1() {
		
		Scanner yon = new Scanner(System.in);
		
		System.out.println("Do you want to re-run the program?");
		cont = yon.nextLine();
		
		if(cont.equals("Yes") || cont.equals("yes")) {
			
			while(0 == 0) {
				
				first();
				operators();
				second();
				answer();
				cont1();
				break;
				
			}
			
		}else if(cont.equals("No") || cont.equals("no")) {
			
			System.out.println("END");
			
		}
		
	}
	
	}
	

