package projects;

import java.util.*;
import java.lang.*;

//COMPLETED

public class One_Class_Basic_Calculator {

	public static void main(String[] args) {
		
		while(0==0) {
		
		
			//Calls the Scanner Class and then creates an var for it(insert)
			Scanner insert = new Scanner(System.in);
			//Creates a few int variables.
			int num1, num2, ans;
			
			//See above.
			Scanner operator = new Scanner(System.in);
			//Creates 2 String variables.
			String oper, cont;
			
			
			System.out.println("Enter a number: ");
			
			//Let's the user input their first number.
			num1 = insert.nextInt();
			
			System.out.println("Now, enter the operator you want to use(i.e. +, /)");
			
			//Lets the user input an operator.
			oper = operator.nextLine();
			
			System.out.println("Great. Now, enter your final number: ");
			
			//Let's the user input his/her second number.
			num2 = insert.nextInt();
			
			//Checks what operator you chose and then runs the program.
				if(oper.equals("+") || oper.equals("Plus") || oper.equals("plus")) {
					ans = num1 + num2;
					System.out.println(ans);
				}else if(oper.equals("-") || oper.equals("Minus") || oper.equals("minus")) {
					ans = num1 - num2;
					System.out.println(ans);
				}else if(oper.equals("*") || oper.equals("Multiply") || oper.equals("multiply")) {
					ans = num1 * num2;
					System.out.println(ans);
				}else if(oper.equals("/") || oper.equals("Divide") || oper.equals("divide")) {
					ans = num1 / num2;
					System.out.println(ans);
				}else if(oper.equals("%") || oper.equals("Module") || oper.equals("module")) {
					ans = num1 % num2;
					System.out.println(ans);
				}else {System.out.println("ERROR");
						System.out.println("That was not an operator!");
						break;}
				
				    //Asks if the user wants to re-run the loop.
					System.out.println("Do you want to continue? Y/N");
					
					//User types in what he wants to do.
					cont = operator.nextLine();
					
					//Runs one of these options depending on the users input.
					if(cont.equals("Y") || cont.equals("y")) {
						continue;
					}else if(cont.equals("N") || cont.equals("n")) {
						break;
					}else {
						System.out.println("Error");
						break;
					}
		}
		    //END
	
			
		
	

	}
	 
}


