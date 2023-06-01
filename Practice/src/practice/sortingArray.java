package practice;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) 
	{
		int [] arr= {1,2,5,65,6,8,3,9,0,23};
        Arrays.sort(arr);
        System.out.println("Array sorting");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
	}

}
