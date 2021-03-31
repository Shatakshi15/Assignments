import java.util.Scanner;
import java.util.TreeSet;

class Person implements Comparable<Person>
{
    private String name;
    private int height;
    private double weight;
    Person(String n, int h, double w)
    {
    	this.name=n;
    	this.height=h;
    	this.weight=w;
    }
    public int compareTo(Person b) {  
        if(height>b.height){  
            return 1;  
        }if(height<b.height){  
            return -1;  
        }
        else
        	{if(height==b.height)
        	{ 
        		
             if(weight>b.weight)
            	 return 1;
             else if(weight<b.weight)
            	 return(-1);
             else 
             {
            	 return(0);
             }
        } 
        	else return(0);
        	}
    }  
    public String get()
    {
    	return(this.name);
    }
    public int getHeight()
    {
    	return(this.height);
    }
    public double getWeight()
    {
    	return(this.weight);
    }
}

public class Assignment3Q1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Total number of person");
    	int n=sc.nextInt();
    	Person p[]=new Person[n];
    	TreeSet<Person> set=new TreeSet<Person>(); 
    	for(int i=0;i<n;i++)
    	{
    		
    		System.out.println("Enter height of a person");
    		int h=sc.nextInt();
    		sc.nextLine();
    		System.out.println("Enter name of a person");
    		String na=sc.nextLine();
    		System.out.println("Enter weight of a person");
    		double w=sc.nextDouble();
    		
    		p[i]=new Person(na,h,w);
    		set.add(p[i]);
    	}
    	 for(Person b:set){  
    		    System.out.println(b.get()+" "+b.getHeight()+" "+b.getWeight());  
    		    }  
    }
}