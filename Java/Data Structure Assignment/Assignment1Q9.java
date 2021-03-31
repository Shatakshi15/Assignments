import java.util.*;
import java.io.*;
class Student {
    private int subjectA,subjectB,subjectC;

    public int studentsTotalMarksInAllSubjects(Student[] students) {
    	int sum=0;
    	for(int i=0;i<3;i++)
    	{
    		sum=sum+students[i].subjectA+students[i].subjectB+students[i].subjectC;
    	}
    	return(sum);
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
    	return(studentsTotalMarksInAllSubjects(students)/3);
    }
   
    public int subjectATotalByStudents(int[] marks) {
    	return(marks[0]+marks[1]+marks[2]);
    }
    public int subjectBTotalByStudents(int[] marks) {
    	return(marks[0]+marks[1]+marks[2]);
    	
    }
    public int subjectCTotalByStudents(int[] marks) {
    	return(marks[0]+marks[1]+marks[2]);
    }

  
    public double subjectAAverageByStudents(int[] marks) {
    	return(subjectATotalByStudents(marks)/3);
    }
    public double subjectBAverageByStudents(int[] marks) {
    	return(subjectBTotalByStudents(marks)/3);
    }
    public double subjectCAverageByStudents(int[] marks) {
    	return(subjectCTotalByStudents(marks)/3);
    }


	public void setSubjectA(int subjectA) {
		this.subjectA = subjectA;
	}
	

	public void setSubjectB(int subjectB) {
		this.subjectB = subjectB;
	}
	
	public void setSubjectC(int subjectC) {
		this.subjectC = subjectC;
	}
	public int getSubjectA() {
		return(this.subjectA);
	}
	public int getSubjectB() {
		return(this.subjectB);
	}
	public int getSubjectC() {
		return(this.subjectC);
	}
	

}

public class Assignment1Q9 {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	Student s[]=new Student[3];
    	for(int i=0;i<3;i++)
    	{
    	 s[i]=new Student();
    	}
    	Student t=new Student();
    	int sub1,sub2,sub3;
    	System.out.println("Enter Subject A marks of student 1");
    	sub1=sc.nextInt();
    	s[0].setSubjectA(sub1);
    	System.out.println("Enter Subject B marks of student 1");
    	sub2=sc.nextInt();
    	s[0].setSubjectB(sub2);
    	System.out.println("Enter Subject C marks of student 1");
    	sub3=sc.nextInt();
    	s[0].setSubjectC(sub3);
    	System.out.println("Enter Subject A marks of student 2");
    	sub1=sc.nextInt();
    	s[1].setSubjectA(sub1);
    	System.out.println("Enter Subject B marks of student 2");
    	sub2=sc.nextInt();
    	s[1].setSubjectB(sub2);
    	System.out.println("Enter Subject C marks of student 2");
    	sub3=sc.nextInt();
    	s[1].setSubjectC(sub3);
    	System.out.println("Enter Subject A marks of student 3");
    	sub1=sc.nextInt();
    	s[2].setSubjectA(sub1);
    	System.out.println("Enter Subject B marks of student 3");
    	sub2=sc.nextInt();
    	s[2].setSubjectB(sub2);
    	System.out.println("Enter Subject C marks of student 3");
    	sub3=sc.nextInt();
    	s[2].setSubjectC(sub3);
    	int A[]= {s[0].getSubjectA(),s[1].getSubjectA(),s[2].getSubjectA()};
    	int B[]= {s[0].getSubjectB(),s[1].getSubjectB(),s[2].getSubjectB()};
    	int C[]= {s[0].getSubjectC(),s[1].getSubjectC(),s[2].getSubjectC()};
    	
    	System.out.println("Total = "+t.studentsTotalMarksInAllSubjects(s));
    	System.out.println("Average marks of all students in all subject = "+t.studentsAverageMarksInAllSubjects(s));
    	System.out.println("Total marks scored by students in subjectA= "+t.subjectATotalByStudents(A));
    	System.out.println("Total marks scored by students in subjectB= "+t.subjectBTotalByStudents(B));
    	System.out.println("Total marks scored by students in subjectC= "+t.subjectCTotalByStudents(C));
    	System.out.println("Average marks scored by students in subjectA= "+t.subjectAAverageByStudents(A));
    	System.out.println("Average marks scored by students in subjectB= "+t.subjectBAverageByStudents(B));
    	System.out.println("Average marks scored by students in subjectC= "+t.subjectCAverageByStudents(C));
    	
    	
    	
    	

    	
    }
}