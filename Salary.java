import java.util.*;
class Salary{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Salary : ");
		int salary = scanner.nextInt();
		
		if(salary < 50000){ 
			salary = (salary+5000);
			
		}
		System.out.println("Salary : "+salary);
		

	}
}
