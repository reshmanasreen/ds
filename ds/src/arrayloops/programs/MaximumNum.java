package arrayloops.programs;

public class MaximumNum {

	public static void main(String[] args) {
		
		  int[] arr = {10, 20, 5, 30, 25};
	        int num = arr[0];
	       
	        for (int i = 1; i < arr.length; i++) {
	       
	            if (arr[i] > num) {
	       
	                num = arr[i];
	            }
	        }
	        System.out.println(num);
	    }
	}
	// 30
	
