import java.util.*;
interface calculate
{
	public double calculation(int n,int m);
}
public class Assignment4Q1 {
    public double addition(int num1,int num2){
    
    	calculate add=(int n,int m)->n+m;
    	return(add.calculation(num1, num2));
    }
    public double subtraction(int num1,int num2){
    	calculate subtract=(int n,int m)->(n-m );
    	return(subtract.calculation(num1, num2));
    }
    public double multiplication(int num1,int num2){
    	calculate multiply=(int n,int m)->(n*m );
    	return(multiply.calculation(num1, num2));
    }
    public double division(int num1,int num2){
    	calculate division=(int n,int m)->{if(m==0)return 0;else return(n/m );};
    	return(division.calculation(num1, num2));
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	Assignment4Q1 a=new Assignment4Q1();
    	int n,m;
    	System.out.println("Enter value of n and m");
    	n=sc.nextInt();
    	m=sc.nextInt();
    	System.out.println("Addition "+a.addition(n, m));
    	System.out.println("Subtraction "+a.subtraction(n, m));
    	System.out.println("Multiplication "+a.multiplication(n, m));
    	System.out.println("Division "+a.division(n, m));
    	
    	
    }
}