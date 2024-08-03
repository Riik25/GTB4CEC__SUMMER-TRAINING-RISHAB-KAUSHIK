package Week1;

import java.util.Scanner;

/*public class Sorting {
  static int minimumValue(int[] arr,int a){
    int mini=a;
    for(int i=a+1;i<arr.length;i++){
        if(arr[mini]>arr[i]){
            mini=arr[i];
            }
    }
    return mini;
  }  
  public static void main(String[] args) {
      int[] arr= {11,23,3,4,5};
      System.out.println(minimumValue(arr,a:1));
  }
}*/



//Selection sorting

/*static void selectionSort(int[] arr){
    for(int i=0;i<arr.length;i++){
        int idx= minimumValue(arr,i);
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}
static int minimumValue(int[] arr,int a){
    int mini=a;
    for(int i=a+1;i<arr.length;i++)
    if(arr[mini]>arr[i])
    mini=i;
    return mini;
}
void display(it[] arr){
    for(int i:arr)
    System.out.print(i)
}*/
















//Inserion sort

/*static void insertionSort(int arr[]){
    int n=arr.length;
    for(int i=1;i<arr.length;i++){
        int key=arr[i];
        int j=i-1;
        while(j>0 && arr[j]>key){
            arr[j+1]= arr[j];
            --j;
        }
        arr[j+1]= key;
    }
}

static void display(int[] arr, int a){
    for(int i:arr)
    System.out.print(i+" ");
}

public static void main(String[] args) {
    int[]= {1,23,3,4,5,12,2};

}
}*/




//Binary search


/*static boolean binarySearch(int arr[], int key){
    int start=0, end=arr.length-1;
    while(start<=end){
        int mid= (start+end)/2;
        if(arr[mid]==key)
        return true;
        if(arr[mid]>key)
        end=mid-1;
        else 
        start=mid+1;

    }
    return false;
}
}*/


//Lower bound

/*static int lowerBound(int arr[], int key){
    int start=0, end= arr.length-1;
    int ans= -1;
     while(start<=end){
        int mid= (start + end )/2;
        if(arr[mid]==key){
            ans=mid;
            end=mid-1;
        }
        else if(arr[mid]>key)
        end=mid-1;
        else 
        start=mid+1;
     }
     return ans;
}*/







 