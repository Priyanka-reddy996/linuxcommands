BUBBLESORT:

public class Bubble
{  
    static void bubbleSort(int[] arr)
     {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
    public static void main(String[] args) {  
        int arr[] ={3,4,8,0,6,7,2,1,9,5};  
         
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

}  
}  

OUTPUT:

Array Before Bubble Sort
3 4 8 0 6 7 2 1 9 5
Array After Bubble Sort
0 1 2 3 4 5 6 7 8 9

----------------------------------------------------------------------------
INSERTIONSORT:

public class Insertion {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {12,18,19,13,17,11,16,15,14,10};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1); 
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    

OUTPUT:

Before Insertion Sort
12 18 19 13 17 11 16 15 14 10
After Insertion Sort
10 11 12 13 14 15 16 17 18 19

-------------------------------------------------------------------------
MERGESORT:

import java.util.*;
class Merge1
{
  void merge(int array[], int p, int q, int r)
   {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];
    for (int i = 0; i < n1; i++)
      L[i] = array[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = array[q + 1 + j];
    int i, j, k;
    i = 0;
    j = 0;
    k = p;
    while (i < n1 && j < n2) 
    {
      if (L[i] <= M[j]) {
        array[k] = L[i];
        i++;
      } else {
        array[k] = M[j];
        j++;
      }
      k++;
    }
    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = M[j];
      j++;
      k++;
    }
}
  void mergeSort(int array[], int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);
      merge(array, left, mid, right);
    }
  }
  public static void main(String args[]) 
{
    int[] array = { 6, 5, 2, 0, 9, 1, 3, 4, 7, 8 };
    Merge1 ob = new Merge1();
    ob.mergeSort(array, 0, array.length - 1);

    System.out.println("Sorted Array:");
    System.out.println(Arrays.toString(array));
  }
}

OUTPUT:
Sorted Array:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]