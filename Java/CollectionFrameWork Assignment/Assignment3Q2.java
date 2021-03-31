import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
    public static void main(String[] args) { 
    	HashSet<String> set=new HashSet<String>();
    	 LinkedHashSet<String> lset=new LinkedHashSet<String>();
    	 LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
    	 linkedHashSet=ordered(lset);
    	Iterator<String> i=linkedHashSet.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
        HashSet<String> hashSet=new HashSet<String>();
        hashSet=unordered(set);
        Iterator<String> j=hashSet.iterator();  
        while(j.hasNext())  
        {  
        System.out.println(j.next());  
        }  
        
    }
    public static LinkedHashSet<String> ordered(LinkedHashSet<String> linkedHashSet){
    	linkedHashSet.add("One");    
        linkedHashSet.add("Two");    
        linkedHashSet.add("Three");   
        linkedHashSet.add("Four");  
        linkedHashSet.add("Five"); 
        return(linkedHashSet);
    	
    }
    public static HashSet<String> unordered(HashSet<String> hashSet){
    	hashSet.add("One");    
        hashSet.add("Two");    
        hashSet.add("Three");   
        hashSet.add("Four");  
        hashSet.add("Five");
    	return(hashSet);
    	
    }
}