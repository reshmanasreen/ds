package arrayloops.programs;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a= {36,19,29,12,5};
		int temp;
	
		for(int i=0; i<a.length;i++) {
			
			for(int j=0;j<a.length-1-i;j++) { //number of rounds=number of values-1
				if(a[j]>a[j+1]) {
				
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
 for(int i=0;i<a.length;i++) {
	 System.out.print(a[i]+" ");
 }
	}

}
