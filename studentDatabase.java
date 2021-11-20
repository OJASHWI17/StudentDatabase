package studentDatabase;
import java.util.Iterator;
import java.util.Scanner;
public class studentDatabase {
	public static void main(String[] args) {
		System.out.println("Enter Number of students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		student[] students = new student[num];
		
		// create n number of new
		for(int n=0; n<num; n++) {
			students[n] = new student();
			students[n].enroll();
			students[n].pay();
			System.out.println(students[n].toString());
		}
		
	}

}
