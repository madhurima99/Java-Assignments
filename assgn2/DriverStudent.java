package assgn2;

import java.util.Scanner;

public class DriverStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter marks of 5 subjects: ");
		double scores[] = new double[5];
		for(int i=0;i<5;i++)
		{
			scores[i]=sc.nextDouble();
		}
		
		Student stu = new Student();
		stu.setName(name);
		stu.setMarks(scores);
		System.out.println("Current object: " + stu.toString());
		
		System.out.println("\n************Grade Card************");
		System.out.println("\nName: " + stu.getName());
		System.out.println("Marks obtained:");
		char grades[] = stu.grade(scores);
		for(int i=0;i<5;i++)
		{
			System.out.println("Subject" + (i+1) + ": " + grades[i]);
		}
		
		double avg = stu.average();
		System.out.printf("Average Marks: %5.2f  ", avg);
		System.out.println("\nOverall grade: "+stu.grade(avg));
		System.out.println("\n************Thank You************");
				
		sc.close();

	}

}

class Student{
	
	private String name;
	private double marks[] = new double[5];
	
	//Constructors
	public Student() {
		name="";
		marks= new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
	}
	public Student(String name, double marks[]) {
		this.name = name;
		this.marks = marks;		
	}
	public Student(Student other) {
		name = other.name;
		marks = other.marks;
	}
	
	//Setter method
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMarks(double marks[]) {
		this.marks = marks;
	}
	
	//Getter method
	public String getName() {
		return name;
	}
	public double[] getMarks() {
		return marks;
	}
	
	//average marks
	public double average() {
		double sum = 0;
		for(int i=0;i<5;i++) {
			sum += marks[i];
		}
		return sum/5;
	}
	
	//Grade Marks 
	public char[] grade(double marks[]) {
		char gr[] = new char[5];
		for(int i=0;i<5;i++)
		{ 
			gr[i]=graderCal(marks[i]);
		}
		
		return gr;
	}
	
	//Grade Average
	public char grade(double avg) {
		return graderCal(avg);
	}
	
	//Letter Grader calculation
	private static char graderCal(double score) {
		
		if(score>90)
		  return 'O';
		else if (score>80)
			return'E';
		else if (score>70)
			return'A';
		else if (score>60) 
			return'B';
		else if (score>50)
			return 'C';
		else if(score>40)
			return 'D';
		else
			return 'F';
		
	}
	
	//return object
	@Override
	public String toString(){ 
		   String s = name;
		    for(int i=0;i<5; i++)
		    	s += ", " + marks[i];
		    return s;
		 }  
}
	
	
	

