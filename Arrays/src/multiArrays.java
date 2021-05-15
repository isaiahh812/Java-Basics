public class multiArrays{
    public static void main(String args []){
        int myArray [][] = {{1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,13,14,15},
                            {16,17,18,19,20}};
        /*int sum = 0;
        int avg = 0;
        //Adding one row
        for(int i = 0; i < myArray[0].length; i++) {
        	sum += myArray[0][i];
        	//sum = sum + myArray[0][i];
        }
        avg = sum / myArray[0].length;
        System.out.println(avg);
        System.out.println(sum);
        sum =0;
        avg = 0;
        //adding one column
        for (int col = 0; col < myArray.length; col++) {
        	sum+=myArray[col][0];
        }
        avg = sum / myArray.length;
        System.out.println(avg);
        System.out.println(sum);
        sum = 0;
        
       */
        int totRowSum [] = new int[myArray.length];
        int totColSum [] = new int[myArray[0].length];
        int totAvg [] = new int [myArray.length + myArray[0].length];
        
        
        
        
        for(int i = 0; i < myArray.length;i++) {
        	//length of column = number of row
        	totRowSum[i] = sumRow(myArray, i);
        }
        
        
        /*System.out.println(sumRow(myArray,0));
        System.out.println(sumRow(myArray,1));
        System.out.println(sumRow(myArray,2));
        System.out.println(sumRow(myArray,3));
        */
        System.out.println();
        for(int i = 0; i< myArray[0].length; i++) {
        	//length of row = number of columns
        	totColSum[i] = sumCol(myArray, i);
        }
        /*
        System.out.println(sumCol(myArray,0));
        System.out.println(sumCol(myArray,1));
        System.out.println(sumCol(myArray,2));
        System.out.println(sumCol(myArray,3));
        System.out.println(sumCol(myArray,4));
        */
        Boolean temp = false;
        int count = 0;
        for(int i = 0; i< totAvg.length; i++) {
        	if(temp == false) {
        		if (count < myArray.length) {
        			totAvg[i] = avg(totRowSum[count],myArray[0].length);
        			count++;
        		}
        		else {
        			temp = true;
        			count =0;
        			i--;
        		}
        	
        	}
        	else {
        		totAvg[i] = avg(totColSum[count],myArray.length);
        		count++;
        	}
        }
        for(int i = 0; i<totAvg.length;i++) {
        	System.out.println(totAvg[i]);
        }
    }
    public static int sumRow(int array [][],int rowNum) {
    	int sum =0;
    	for(int i = 0; i < array[rowNum].length; i++) {
        	sum += array[rowNum][i];
        	//sum = sum + myArray[0][i];
        }
    	return sum;
    }
    public static int sumCol(int array[][], int colNum) {
    	int sum = 0;
    	for(int i =0; i <array.length; i++) {
    		sum +=array[i][colNum];
    	}
    	return sum;
    }
    public static int avg(int sum, int length) {
    	//System.out.println(sum + " " + length + " " + sum/length);
    	
    	return sum / length;
    }
}
