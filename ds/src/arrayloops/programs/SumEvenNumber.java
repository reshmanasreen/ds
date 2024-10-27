package arrayloops.programs;

public class SumEvenNumber {

	public static void main(String[] args) {	        
		        int[] arr = {10, 25, 30, 45, 50, 60};		        		    
		        int sum = 0;
		        		     
		        for (int i = 0; i < arr.length; i++) {		            
		            if (arr[i] % 2 == 0) {
		               
		                sum += arr[i];
		            }
		        }
		       	        
		        System.out.println("Sum of even numbers in the array: " + sum);
		    }
		}

	


