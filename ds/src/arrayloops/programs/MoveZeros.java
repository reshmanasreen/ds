package arrayloops.programs;

public class MoveZeros {

	public static void main(String[] args) {
	
		        int[] arr = {1, 0, 8, 2, 0, 6, 0, 4, 0};
		        int count = 0;

		       
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] != 0) {
		                arr[count] = arr[i];
		                count++;
		            }
		        }

		       
		        for (int i = count; i < arr.length; i++) {
		            arr[i] = 0;
		        }

		        // Print the modified array
		        System.out.println("Array after moving zeroes: " + java.util.Arrays.toString(arr));
		    }
		}

