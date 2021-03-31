import java.util.*;
import java.io.*;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	int num[]=new int[899];
    	for(int i=0,j=min;i<899&&j<=max;j++)
    	{
    		if(armstrong(j))
    		{
    			num[i]=j;
    			i++;
    		}
    	}
    	return (num);
    }
    public boolean armstrong(int num)
    {
    	int org=num;
    	int sum=0;
    	while(org>0)
    	{
    		int r=org%10;
    		sum=sum+(r*r*r);
    		org=org/10;
    	}
    	if(sum==num)
    		return (true);
    	else return(false);
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;
       ArmstrongNumBetweenRange ob=new ArmstrongNumBetweenRange();
       int num[];
       num=ob.armstrongNumbersInRange(min, max);
       for(int i=0;i<num.length;i++)
       {
    	   if(num[i]!=0)
    		   System.out.println(num[i]);
    	   else break;
       }

    }
}