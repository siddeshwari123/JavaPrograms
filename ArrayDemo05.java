package com.codegnan.javabasics.Arrays;
public class ArrayDemo05
{
	public static void main(String[] args)
	{
	  int[][] arr=new int[2][2];

	  arr[0][0]=10;
	  arr[0][1]=20;
	  arr[1][0]=30;
	  arr[1][0]=40;

	  for(int i=0;i<arr.length;i++)
	  {
	   for(int j=0;j<arr[i].length;j++)
	   {
	     System.out.println(arr[i][j]+" ");
	   }
	  }
	  System.out.println();
	}
}