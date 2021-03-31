import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
    	if((user.equals(userId))&&(pass.equals(password)))
    		return("Welcome Ajay");
    	else
    	{
    		return("You have entered wrong credentials ,please enter the right credentials.");
    	}
    	
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
    	String user,pass;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter userId");
    	user=sc.nextLine();
    	System.out.println("Enter Password");
    	pass=sc.nextLine();
    	Login lu=new Login();
    	int i=1;
    	//System.out.println(user+" "+pass);
    	//System.out.println(lu.loginUser(user,pass).equals("Welcome Ajay"));
    	if((lu.loginUser(user,pass)).equals("Welcome Ajay"))
    	System.out.println(lu.loginUser(user,pass));
    	else
    	{
    		while(i<=3)
    		{
    			if((i==3)&&(lu.loginUser(user,pass).equals("Welcome Ajay"))==false)
    			{
    				System.out.println("You have entered wrong credentials 3 times\nContact Admin");
    				break;
    			}
    			else if((lu.loginUser(user,pass)).equals("Welcome Ajay")==false)
    			{
    				i++;
    				System.out.println(lu.loginUser(user,pass));
    				System.out.println("Enter userId");
    		    	user=sc.nextLine();
    		    	System.out.println("Enter Password");
    		    	pass=sc.nextLine();
    			}
    			else
    			{
    				System.out.println(lu.loginUser(user,pass));
    				break;
    			}
    			
    			
    		}
    	}
    }
}