
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray [] = new int [3]; 
		int secondArray [][] = {{1,2,3},
								{4,5,6},
								{7,8,9}};
		/*
		 * [1000 , 12, 12, 12, 12,12,12]
		 * [12, 12 ,12 1,12 ,12 12, 12,]
		 * []
		 * []
		 * 
		 */
		
		for(int i = 0 ; i <secondArray[0].length; i++) {
			for(int j = 0; j < secondArray.length; j++) {
				System.out.print(secondArray[i][j] + " ");
				myArray[i] += secondArray[j][i];
			}
			System.out.println();
		}
		
		for(int i = 0; i< myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}

}
