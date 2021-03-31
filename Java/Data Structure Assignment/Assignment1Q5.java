import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	if((ctc>=0)&&(ctc<=180000))
    		return(0);
    	else if((ctc>=181001)&&(ctc<=300000))
    		return ((10*ctc)/100);
    	else if((ctc>=300001)&&(ctc<=500000))
    		return((20*ctc)/100);
    	else
    	{
    		return((30*ctc)/100);
    	}
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	int ctc;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the income");
    	ctc=sc.nextInt();
    	TaxAmount ta=new TaxAmount();
    	System.out.println("Payable Tax amount = "+ta.calculateTaxAmount(ctc));
    }
}