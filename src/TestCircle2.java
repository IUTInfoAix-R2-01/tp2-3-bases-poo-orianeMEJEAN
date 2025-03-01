
public class TestCircle2
{
	public static void main(String[] args)
	{
		Circle2 c1 = new Circle2();
		System.out.println("The circle has a radius of " + c1.getRadius() + " and an area of " + c1.getArea());
		
		Circle2 c2 = new Circle2(2.0);
		System.out.println("The circle has a radius of " + c2.getRadius() + " and an area of " + c2.getArea());
		
		System.out.println(" ");
		Circle2 c3 = new Circle2(3.0, "orange");
		System.out.println("The circle has a radius of " + c3.getRadius() + " and an area of " + c3.getArea());
		System.out.println("The color of this circle is " + c3.getColor());
		
		//System.out.println(c1.radius);
		//c1.radius = 5.0;  //doesn't work because it's private
		
		System.out.println(" ");
		Circle2 c5 = new Circle2(5.5);
		System.out.println(c5.toString());
		
		Circle2 c6 = new Circle2(6.6);
		System.out.println("explicit call : " + c6.toString());
		System.out.println("implicit call : " + c6);	
		System.out.println("call with + : " + c6);
				
	}
}

