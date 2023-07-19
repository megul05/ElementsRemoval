package ElementsRemoval;

import java.util.*;

public class ElementsRemoval {
	
	public static int elementRemove(int[] arr,int size)
	{
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int cost =0;
		for(int i=0;i<size;i++)
		{
			cost += arr[i] *i+1;
		}
		return cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		int result = elementRemove(arr,size);
		System.out.println(result);
	}

}
