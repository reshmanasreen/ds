package arrayloops.programs;

public class SecondLargest {

	public static void main(String[] args) {
	
		        int[] a = {6, 2, 4, 5, 8}; 
		        int temp;
		        
		      
		        for (int i = 0; i < a.length; i++) {
		            for (int j = i + 1; j < a.length; j++) {
		                if (a[i] < a[j]) {  
		                    temp = a[i];
		                    a[i] = a[j]; 
		                    a[j] = temp;
		                }
		            }
		        }

		        
		        System.out.print("Sorted array: ");
		        for (int i = 0; i < a.length; i++) {
		            System.out.print(a[i] + " ");
		        }
		        
		        System.out.println(); 
		        
		        
		        System.out.println("Second largest element is: " + a[1]);
		    }
		}           //Sorted array:8 6 5 4 2
                   //Second largest element is :6
	
		
		      
	


