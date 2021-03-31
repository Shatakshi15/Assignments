import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Chatroom{
    private String name;
    private Set<String> username;
    private List<String> messages;

    {
        name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }
    public boolean removeUser(String username) {
    }
}

class User{

    private String username;
    private String password;
    private String firstName;
    private String lastName;
}


class ChatApplication{

    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) {}

    public boolean isUsernameExists(String username) {}

    public boolean authenticateUser(String username, String password) {}

    //UI Methods Below
    public void createChatroom() {}

    public void addNewUser() {}

    public boolean login() {}

    public void sendMessage() {}
    public void printMessages() {}

    public void listUsersFromChatroom() {}

    public void logout(){}

    public void deleteUser(){}


    public void menu() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Menu");
    	System.out.println("A.Create a room");
    	System.out.println("B. Add the user");
         System.out.println("C. User login");
         System.out.println("D. Send a message");
         System.out.println("E. Display the messages from a specific chatroom");
         System.out.println("F. List down all users belonging to the specified chatroom");
         System.out.println("G. logout");
         System.out.println("H. Delete an user");
         System.out.println("I. Delete the chat room");
         System.out.print("Please enter your option: ");
         char ch=sc.next().charAt(0);
         switch(ch)
         {
         case 'A':
        	 
         }
    	
    }
}

public class Assignment3Q6{
    public static void main(String[] args){}
}

