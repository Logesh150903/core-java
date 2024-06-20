package demo;

public class mdarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("JaggedArray");
		int arr[][]=new int[4][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		arr[3]=new int[5];
		int count=20;
		//print numbers
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[i].length;j++)
		    {
		        arr[i][j]=count++;
		        System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		    }
	}

}
