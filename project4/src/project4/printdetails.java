package project4;

public class printdetails {

	

		public static void main(String[] args) {
		
		Employee employee1=new Employee("Vaish","N",21,"WIPRO","2.0");
		Employee employee2=new Employee("Soukhya","	D",25,"INFOSYS","2.3");
		System.out.println("employee1 object with firstname & age set");
		System.out.println("=========================================================");
		System.out.println(employee1.getFirstname());
		System.out.println(employee1.getAge());
		
		
		System.out.println("employee2 object with firstname,company & experience set");
		System.out.println("=========================================================");
		System.out.println(employee2.getFirstname());
		System.out.println(employee2.getCompany());
		System.out.println(employee2.getExperience());
		
		
		System.out.println("All values");
		System.out.println("==========");

		System.out.println("Employee1 :");
		System.out.println(employee1.getFirstname());
		System.out.println(employee1.getLastname());
		System.out.println(employee1.getAge());
		System.out.println(employee1.getCompany());
		System.out.println(employee1.getExperience());
		
		System.out.println("Employee2 :");
		System.out.println(employee2.getFirstname());
		System.out.println(employee2.getLastname());
		System.out.println(employee2.getAge());
		System.out.println(employee2.getCompany());
		System.out.println(employee2.getExperience());
		


		}

		}
