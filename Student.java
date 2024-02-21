package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompts user to enter new students name and year
	public Student() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("\n\nEnter student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter number: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
	}
	
	
	
	// Generate an ID
	private void setStudentID() {
		
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	
	
	
	// Enroll in courses
	public void enroll() {
		
		// Get inside a loop, user hits 0
		do {
			System.out.print("\nEnter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break; 
			}
			
		}
		while (1 !=  0);
		
		
	}
	
	
	
	// View balance 
	public void viewBalance() {
		System.out.println("\nYour balance is: $" + tuitionBalance);
	}
	
	
	
	// Pay tuition 
	public void payTuition() {
		viewBalance();
		System.out.print("\nEnter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		
		tuitionBalance = tuitionBalance - payment;
		System.out.println("\n\nThank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Show status
	public String toString() {
		return "\n\n\nName: " + firstName + " " + lastName +
				"\nYear: " + gradeYear +
				"\nStudentID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
	
	
}
