import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return(this.salary+incentive);
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return(this.salary+overtime);
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
    	return (salary);
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int total=employeeSalaries.get(0);
    	total=total+employeeSalaries.get(1);
    	return(total);
    }
    public static void main(String[] args) {
    	Labour l=new Labour();
    	Manager m=new Manager();
    	Assignment2Q2 a=new Assignment2Q2();
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	int ms=m.getSalary(a.salary);
    	int ls=l.getSalary(a.salary);
    	al.add(ms);
    	al.add(ls);
    	System.out.println("Manager salary = "+ms);
    	System.out.println("Labour salary = "+ls);
    	System.out.println("Total Employee Salary = "+a.totalEmployeesSalary(al));
    }
}