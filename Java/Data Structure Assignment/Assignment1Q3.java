import java.util.*;
import java.io.*;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	return((principalAmount*time*interestRate)/100);
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double x=Math.pow((1+interestRate), time);
    	return((principalAmount*x)-principalAmount);
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	Scanner sc=new Scanner(System.in);
    	double P,R;int t;
    	System.out.println("Enter Principal ");
    	P=sc.nextDouble();
    	System.out.println("Enter rate");
    	R=sc.nextDouble();
    	System.out.println("Enter time");
    	t=sc.nextInt();
    	SiCi ss=new SiCi();
    	double si=ss.simpleInterest(P,t,R);
    	double ci=ss.compoundInterest(P,t,R);
    	System.out.println("Simple Interest = "+si+" Compound Interest = "+ci);
    	
    }
}

