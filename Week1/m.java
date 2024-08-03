
import java.util.Scanner;

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
                        }*/

                     
                    



    
        
        







