package project2;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		String s1="circle";
		String s2="rectangle";
	    System.out.print("Enter a shape: ");
		Scanner input= new Scanner(System.in);
		String answer = input.nextLine();
		
		if(s1.equals(answer))
		{
			Circle ci=new Circle();
			ci.print_c();
	
		}
		else if(s2.equals(answer))
		{
			Rectangle re=new Rectangle();
			re.print_r();
			
		}
		else
		{
			System.out.print("Enter valid shape!!!!");
		}
		}

		}