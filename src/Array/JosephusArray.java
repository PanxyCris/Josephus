package Array;

public class JosephusArray {

	public JosephusArray(int n, int m){
		this.n = n;
		this.m = m;
		array = new int[n];
		for(int i=0;i<n;i++)
			array[i] = 1;
	}

	public int print(){
		int init = 0;
		int end = m;
		Boolean isContinue = true;
		while(isContinue){
		for(int i= init;i<end;i++)
			if(array[(i%n)]==0)
				end++;
		 init = end;
		 array[(init-1)%n]=0;
		 end += m;
		 int count = 0;
		 int record = 0;
		 for(int i=0;i<n;i++)
			 if(array[i]!=0){
				 count++;
				 if(count==1)
					 record = i+1;
			 }
		 if(count <=1)
			 return record;
		}
	   return 0;
	}

	private int n;
	private int m;
	private int[] array;
}
