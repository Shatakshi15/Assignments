abstract class Shape
{
	public abstract void color();
}
abstract class Dimension
{
	public void two_D()
	{
		System.out.println("This is a  2D shape");
	}
}
class rectangle extends Shape
{
	public void color()
	{
		System.out.println("Rectangle is in red color");
	}
}
class circle extends Dimension
{
	public void color()
	{
	System.out.println("Circle is in blue color");
	}
}
public class Assignment2Q4 {

	public static void main(String[] args) {
		rectangle r=new rectangle();
		circle c=new circle();
		r.color();
		c.color();
		c.two_D();
		// TODO Auto-generated method stub

	}

}
