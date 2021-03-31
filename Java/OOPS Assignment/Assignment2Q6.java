abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return ("It is File Persistence");
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return("It is database persistence");
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) 
    {
    	FilePersistence fp=new FilePersistence();
    	DatabasePersistence dp=new DatabasePersistence();
    	System.out.println(fp.persist());
    	System.out.println(dp.persist());
    }
}