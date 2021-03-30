package Array_programing;

public class Bsort {

	public static void main(String[] args) {
		int [] arr={10,20,5,3,6};
		int l = arr.length;
		
		for(int i=0; i<l-1; i++)
		{
			for(int j=0; j<l-1; j++)//
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	for(int i=0; i<=l-1; i++){
		System.out.println(arr[i]);
	}
	}
}
