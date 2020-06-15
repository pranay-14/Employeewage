import java.util.*;

public class Employee
{
        public static void main(String args[])
        {
                int wagePerHour=20, workHours=8;
                int isFullTime=1;
                System.out.println("Welcome to Employee Wage calculation");
                int status=((int)(Math.random()*2 + 1));
                if(status==1)
                {
                        System.out.println("Employee is Present");
                        int jobType=((int)(Math.random()*2 + 1));
                        if(jobType==isFullTime)
                        {
                                System.out.println("Employee is Full time Employee");
                                int salary = wagePerHour * workHours;
                                System.out.println("Salary of Employee per day is : " + salary);
                        }
                        else
                        {
                                System.out.println("Employee is not full time");
                        }

                }
                else
                {
                        System.out.println("Employee is absent");
                        System.out.println("Salary cannot be calculated because employee is absent");
                }

        }
}
