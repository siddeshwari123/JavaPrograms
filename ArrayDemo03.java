import java.util.Arrays;
public class ArrayDemo04
{
	public static void main(String[] args)
	{
		int[] arr=new int[2];

		arr[0]=10;
		arr[1]=20;
		arr[2]=30;

		System.out.println(arr[0]);

		for (int i=0;i<arr.length;i++)
		{
			System.out.println(i);
		}
	}
}