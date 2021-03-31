import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	int curr_total=totalDeposits+creditLimit;
    	return(curr_total);
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	int sav_total=totalDeposits+fixedDepositAmount;
    	return(sav_total);
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
    	int total=0;
    	total=total+cash.get(0);
    	total=total+cash.get(1);
    	return(total);
    	
    }
    public int getCash(){
    	int totalDeposits=10000;
    	return(totalDeposits);
    }
    public static void main(String[] args) {
    	CurrentAccount ca=new CurrentAccount();
    	SavingsAccount sa=new SavingsAccount();
    	Assignment2Q3 a=new Assignment2Q3();
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	al.add(ca.getCash());
    	al.add(sa.getCash());
    	System.out.println("Total Cash in Bank = "+a.totalCashInBank(al));
    	
    	
    }
}

