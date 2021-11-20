package studentDatabase;
import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses ="";
	private int balance=0;
	private int cost = 6000; // cost per course is 6000
	private static int id = 1001;
	
	// constructor prompt user to  enter student name
	public student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter Student Last Name: ");
		this.lastName = sc.nextLine();
		
		System.out.print("1- Frehser\n2- Second Year\n3- Third Year\n4- Final Year\nEnter Student year : ");
		this.gradeYear = sc.nextInt();
		
		setID();
		
		
		
	}
	//generate id
	private void setID() {
		id++;
		this.studentId = gradeYear+ "" +id;
	}
	// enroll in course
	public void enroll() {
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		if(!course.equals("Q")) {
			courses = courses+"\n"+course;
			balance = balance+cost;
		} 
		else {
			break;
		} 
	} while(1 != 0);
		
		
	}
	// view balance
	public void viewBalance() {
		System.out.println("Your Balance: $"+balance);
	}
	// pay tuition
	public void pay() {
		System.out.println("Enter your Payment: ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		balance = balance-payment;
		System.out.println("Thank you for paying $"+payment);
		System.out.println("Your current balance is: "+balance);
	}
	// show status
	public String show() {
		return "Name: " + firstName + " " + lastName +
				"\nCurrent Year: "+gradeYear+
				"\nStudent ID: "+studentId+
				"\nCourses Enrolled: " + courses + "\nBalance: $ " + balance;
	}


}
