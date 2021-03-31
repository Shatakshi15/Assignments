import java.util.ArrayList;
import java.util.Scanner;
interface Comparator
{
	int compare(int p);
}
interface Comparator2
{
	int compare(String s);
}
public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
    	ArrayList<Assignment4Q2> al=new ArrayList<Assignment4Q2>();
    	Comparator c=(int price)->{if(price>=10000)return 1; else return 0;};
    	Comparator2 c2=(String s)->{if(s.equalsIgnoreCase("Completed"))return 1;else return 0;};
    	for(int i=0;i<5;i++)
    	{
    		if((c.compare(orders.get(i).totalPrice)==1)&&(c2.compare(orders.get(i).status)==1))
    		{
    			al.add(orders.get(i));
    		}
    	}
    	return(al);
    	
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	ArrayList<Assignment4Q2> al=new ArrayList<Assignment4Q2>();
    	ArrayList<Assignment4Q2> al1=new ArrayList<Assignment4Q2>();
    	Assignment4Q2 obj[]=new Assignment4Q2[5];
    	for(int i=0;i<5;i++)
    	{
    		obj[i]=new Assignment4Q2();
    		System.out.println("Enter total price");
        	obj[i].totalPrice= sc.nextInt();
        	sc.nextLine();
        	System.out.println("Enter status of order: Completed/Incomplete");
        	obj[i].status= sc.nextLine();
        	al.add(obj[i]);

    	}
    	al1=listOfOrders(al);
    	for(int i=0;i<al1.size();i++)
    	{
    		System.out.println("Order greater than or equal to 10000 "+al1.get(i).totalPrice);
    	}
    	
    }
}