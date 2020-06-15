import java.util.*;

public class Employee
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage calculation");
		int status=((int)(Math.random()*2 + 1)); 
		if(status==1)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
