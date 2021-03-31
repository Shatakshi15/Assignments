import java.util.HashSet;
import java.util.Set;

class Employee {
    private String name;
    private int id;
	public void setId(int i) {
		// TODO Auto-generated method stub
		this.id=i;
	}
	public void setName(String n)
	{
		this.name=n;
	}
}

public class Assignment3Q5 {
    public static void main(String[] args) {
    	Employee e1 = new Employee();
        Employee e2 = new Employee();
 
        e1.setId(100);
        e1.setName("hi");
        e2.setId(100);
        e2.setName("hi");
 
        //Prints 'true'
        System.out.println(e1.equals(e2));
 
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
         
        System.out.println(employees); 
    }
}

