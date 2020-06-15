import java.util.*;

public class Employee
{
	public static void main(String args[])
	{
		int wagePerHour=20, workHours=8;
		System.out.println("Welcome to Employee Wage calculation");
		int isPresent=((int)(Math.random()*2 + 1)); 
		if(isPresent==1)
		{
			System.out.println("Employee is Present");
			int salary = wagePerHour * workHours;
			System.out.println("Salary of Employee per day is : " + salary);
		}
		else
		{
			System.out.println("Employee is absent");
			System.out.println("Salary cannot be calculated because employee is absent");
		}
	}
}
