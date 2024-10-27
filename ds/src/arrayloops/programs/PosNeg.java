package arrayloops.programs;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			int[] arr ={2,-9,8,6,-5,-3,45,76,-86};

			int positive =0;
			int negative=0;

			for(int num :arr){
				if(num >0){
					positive++;
				}else if (num < 0){

					negative++;
				}

				}
	System.out.println(positive);
	System.out.println(negative);
	}
	}
	//5
	//4


