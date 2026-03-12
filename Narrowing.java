public class Narrowing
{
	public static void main(String[] args)
	{
	 double d=25.75;
	 int i=(int) d;
	 byte b=(byte)i;

	 System.out.println("Double value:" +d);
	 System.out.println("int value:" +i);
	 System.out.println("Byte value:" +b);
	}
}