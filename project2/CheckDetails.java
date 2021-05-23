package project2;

import java.util.Scanner;

public class CheckDetails {
	


		public Shape getcheck(String checkType){

		Scanner sc=new Scanner(System.in);
		System.out.println("shape Name:");
		String input=sc.nextLine();

		if(checkType == null){
		        return null;
		     }
		     if("Circle".equalsIgnoreCase(input)){
		        return new Circle();
		       
		     } else if("Rectangle".equalsIgnoreCase(input)){
		        return new Rectangle();
		       
		     } else if("Square".equalsIgnoreCase(input)){
		        return new Square();
		      }
		     
		     return null;
		  }

		

}
