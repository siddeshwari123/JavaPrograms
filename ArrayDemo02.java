package com.codegnan.javabasics.Arrays;
public class ArrayDemo02
{
	public static void main(String[] args)
	{

		/*                c1      c2
		first  row R0  10(0,0)  20(0,1)
		second row R1  30(1,0)  40(1,1)


		*/
		int[][] mArray=new int[2][2];

		mArray[0][0]=10;
		mArray[0][1]=20;
		mArray[1][0]=30;
		mArray[1][1]=40;

		System.out.println(mArray.length);


        //Use nested for loop to traverse the elements in multidimension

        // outer for loop-for loop

		//inner for loop-to retrieve element in the column of each row

		for(int i=0;i<mArray.length;i++)
		{
			for(int j=0;j<mArray[i].length;j++)
			{
				System.out.println(mArray[i][j]+" ");
			}
		}
		System.out.println();

	}
}