
import java.util.ArrayList;
import java.util.List;

public class Assignment3Q3 {
    public static List<Integer> traverseReverse(ArrayList<Integer> aList){
    	List <Integer> l= new ArrayList<Integer>();
    	for(int i=aList.size()-1;i>=0;i--)
    	{
    		l.add((Integer) aList.get(i));
    	}
    	return l;
    }
    public static void main(String[] args) {
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	List <Integer> l= new ArrayList<Integer>();
    	al.add(1);
    	al.add(5);
    	al.add(9);
    	al.add(20);
    	al.add(54);
    	al.add(62);
    	al.add(22);
    	l=traverseReverse(al);
    	for(int i:l)
    		System.out.println(i);
    	
    }
}