import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
	public int candy=100;
    public int addCandies(int candies){
    	candy=candy+candies;
    	return(candy);
    }
    public int getCost()
    {
    	return (60*2);
    }
}
class Cookie extends DesertItem {
	public int candy=50;
    public int addCookies(int candies){
    	candy=candy+candies;
    	return(candy);
    }
    public int getCost()
    {
    	return (70*8);
    }
}
class IceCream extends DesertItem {
	public int candy=70;
    public int addIceCreams(int candies){
    	candy=candy+candies;
    	return(candy);
    }
    public int getCost()
    {
    	return (30);
    }
}
public class Assignment2Q7 {
	Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    	Assignment2Q7 a=new Assignment2Q7();
    	a.selectRoles();
    }
    private void selectRoles(){
    	System.out.println("Enter your role: Customer or Owner");
    	String role=sc.nextLine();
    	if(role.equalsIgnoreCase("Customer"))
    	{
    		roles(role);
    	}
    	if(role.equalsIgnoreCase("Owner"))
    	{
    		roles(role);
    	}
    }
    private void roles(String role){
    	if(role.equalsIgnoreCase("Customer"))
    	{
    		int order=0;
    		System.out.println("Place Your order");
    		placeOrder();
    		order=sc.nextInt();
    		placeOrderOperation(order);
    	}
    	if(role.equalsIgnoreCase("Owner"))
    	{
    		int item=0;
    		System.out.println("Which item you want to add");
    		addItems();
    		item=sc.nextInt();
    		addItemsOperation(item);
    	}
    }
    private void addItems() {
    	System.out.println("1. Ice cream");
    	System.out.println("2. Candies");
    	System.out.println("3. Cookies");
    	System.out.println("Enter your choice");
    }
    private void addItemsOperation(int choice) {
    	int ord=0;
    	if(choice==1)
    	{
    		IceCream ic=new IceCream();
    		System.out.println("How many Ice cream you want to add?");
    		ord=sc.nextInt();
    		System.out.println("Total icecream in storage now = "+ic.addIceCreams(ord)+"Item is added successfully");
    	}
    	if(choice==2)
    	{
    		Candy c=new Candy();
    		System.out.println("How many Candies you want to add?");
    		ord=sc.nextInt();
    		System.out.println("Total Candies in storage now = "+c.addCandies(ord)+"Item is added successfully");	
    	}
    	if(choice==3) {
    		Cookie ck=new Cookie();
    		System.out.println("How many Cookies you want to add?");
    		ord=sc.nextInt();
    		System.out.println("Total Cookies in storage now = "+ck.addCookies(ord)+"Item is added successfully");
    	}
    }
    private void placeOrder() {
    	System.out.println("1. Ice cream");
    	System.out.println("2. Candies");
    	System.out.println("3. Cookies");
    	System.out.println("Enter your choice");
    	
    }
    private void placeOrderOperation(int choice) {
    	int ord=0;
    	if(choice==1)
    	{
    		IceCream ic=new IceCream();
    		System.out.println("How many Ice cream you want to order?");
    		ord=sc.nextInt();
    		System.out.println("Pay = "+ic.getCost()*ord+"Your order is placed");
    	}
    	if(choice==2)
    	{
    		Candy c=new Candy();
    		System.out.println("How many Candies you want to order?");
    		ord=sc.nextInt();
    		System.out.println("Pay = "+c.getCost()*ord+"Your order is placed");	
    	}
    	if(choice==3) {
    		Cookie ck=new Cookie();
    		System.out.println("How many Cookies you want to order?");
    		ord=sc.nextInt();
    		System.out.println("Pay = "+ck.getCost()*ord+"Your order is placed");
    	}
    }
}