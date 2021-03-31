import java.util.*;
import java.io.*;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	if((subject1Marks>=60)&&(subject2Marks>=60)&&(subject3Marks>=60))
    		return("Passed \n Promoted");
    	else if(((subject1Marks>=60)&&(subject2Marks>=60))||((subject2Marks>=60)&&(subject3Marks>=60))||((subject3Marks>=60)&&(subject1Marks>=60)))
    		return("Promoted");
    	else if((subject1Marks>=60)||(subject2Marks>=60)||(subject3Marks>=60)||((subject1Marks<60)&&(subject2Marks<60)&&(subject3Marks<60)))
    			return("Failed");
    	else
    	{
    		return("Failed");
    	}
    }
    
}
public class Assigment1Q4 {
    public static void main(String[] args) {
    	double s1,s2,s3;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Subject 1 marks");
    	s1=sc.nextDouble();
    	System.out.println("Enter Subject 2 marks");
    	s2=sc.nextDouble();
    	System.out.println("Enter Subject 3 marks");
    	s3=sc.nextDouble();
    	ResultDeclaration rd=new ResultDeclaration();
    	String s;
    	s=rd.declareResults(s1, s2, s3);
    	System.out.println(s);
    	
    }
}