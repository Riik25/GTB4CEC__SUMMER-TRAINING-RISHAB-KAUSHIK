public class Recursion{
    static void print(int n){
        if(n==10 ){
            System.out.println(n);
            return;

        }
        System.out.println(n);
        print(n+1);
    }
        //head recursion
    static int sumHead(int n){
        if(n==1){
            return 1;
        }

        int prevValueSum = sumHead(n-1);

        return n + prevValueSum;
    }
    //tail recursion
    static int sumTail(int n,int a){
        if(n==1){
            return a+n;

        }
      return  sumTail(n-1,a+n);
        
    }

    static int countEvenHead(int n) {
        if (n == 1) {
            return 0; // base case: no even numbers in range [1, 1]
        }
    
        int prevCount = countEvenHead(n - 1);
    
        if (n % 2 == 0) {
            return prevCount + 1; // increment count if n is even
        } else {
            return prevCount; // no change if n is odd
        }
    }


    static int countEven(int n, int count){
        if(n==1){
            return count;
        }
            if(n%2==0){
                count++;
            }

            return countEven(n-1,count);
        }

        static int power(int a, int n){
            if(n==0){
                return 1;

            }
            return a*power(a,n-1);
        }
        //head recursion
        static int fact(int n,  int acc){
            if(n==0){
            return acc;
         }else{
            return fact(n-1,n*acc);
         }

}

static int fibonacci(int n, int a, int b) {
    if (n == 0) {
        return a;
    } else {
        return fibonacci(n - 1, b, a + b);
    }
}

public static int fibonacci(int n) {
    return fibonacci(n, 0, 1);
}

        
                

 public static void main(String[] args){
        int a = 1, n=1;
        //print(n);

        /*int sum = 0;
        for(int i=1;i<=n;i++)
            sum+=i;
            System.out.println(sum);*/

            //int sum=sum(n,0);
            //System.out.println(sum);
            System.out.println(fibonacci(5, n, n));

    }


    }