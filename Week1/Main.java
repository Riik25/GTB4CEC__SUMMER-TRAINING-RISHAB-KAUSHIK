

 /*  public int maxProfit(int[] prices){
    int max = 0;
    int min = prices[0];
    for(int i = 1; i < prices.length; i++){
        if(prices[i] < min){
            min = prices[i];
            }
            else if(prices[i] - min > max){
                max = prices[i] - min;
                }
                }
  }  


}*/



/*public int[] plusOne(int[] digits) {
    int[] result = new int[digits.length + 1];
    int carry = 1;
    for(int i = digits.length - 1; i >= 0; i--){
        int sum = digits[i] + carry;
        if(sum > 9){
            result[i+1]=sum%10;
            carry = 1;
            }
            else{
                result[i+1]=sum;
                carry=0;
                }
    }
}*/

    

   /*  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
            int n=scanner.nextInt();
            scanner.close();
            int oddSum=0;
            int evenSum=0;
            int count=1;

            while(n>0){
            	int digit = n%10;
            	n/=10;
            	if(count%2==0){
            		evenSum+=digit;
            	}else{
            		oddSum+=digit;
            	}
            	count++;
            }
            System.out.println("Sum of odd placed digits:"+oddSum);
            System.out.println("Sum of even placed digits:"+evenSum);
        }
		

    }*/


    
/*public class leetcode {
    public static void main(String args[]) {
		try (Scanner scanner = new Scanner(System.in)) {
            int N1 = scanner.nextInt();
            int N2 = scanner.nextInt();
            int lcm = calculateLcm(N1,N2);
            
            System.out.println(lcm);
        }

    }
	public static int calculateLcm(int N1, int N2){
		int gcd = gcd( N1, N2);
		int lcm = (N1*N2)/gcd;
		return lcm;
	}
	public static int gcd(int N1,int N2){
		if(N2==0){
			return N1;
		}
		return gcd(N2,N1%N2);
		
	}

}*/


        
/*public class Main{
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = scanner.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<N;i++){
                if(arr[i]>max){
                    max = arr[i];
                    }
                    if(arr[i]<min){
                        min = arr[i];
                        }
                        }
                        System.out.println(max-min);
                        }
         []               }*/



  /*public class Main {
    public static void main(String[] args) {
        int[][] arr = new int [3][4];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = count;
                count++;
                }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                        }
                        }
                    }*/


   /* public static void main(String[] args) {
        int[][] matrix = {
        {1,2,2,4},
        {4,4,5,5},
        {5,7,7,9}
        };

        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
        System.out.print(matrix[i][j] + "");
    }
    System.out.println();
    }
    }
    }*/



   /*  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length ==
    0) {
    return false;
    }
    int row = 0, col = matrix[0].length - 1;
    while (row < matrix.length && col >= 0) {
    if (matrix[row][col] == target) {
    return true;
    }
    if (matrix[row][col] < target) {
    row++;
    }
    else {
    col--;
    }
    }
    return false;
    }    
    }*/





    
        
    



    
        
        







