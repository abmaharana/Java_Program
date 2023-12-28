package NumberPrograms;

import java.util.Scanner;

public class MissingNumber {
    public static void printMissingElements(int arr[], int N)
    {
        int cnt = 0;
        for (int i = arr[0]; i <= arr[N - 1]; i++)
        {

            // Check if number is equal to the first element in
            // given array if array element match skip it increment for next element
            if (arr[cnt] == i)
            {

                // Increment the count to check next element
                cnt++;
            }
            else
            {

                // Print missing number
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,2,4,8,10};
        int n = arr.length;

        //if single missing number is present
//        int sum=(n+1)*(n+2)/2;   //Calculate the expected sum of all the elements from 1 to n
//        for(int i=0;i<n;i++)
//        {
//            sum=sum-arr[i]; //Subtract each element from the sum
//        }
//        System.out.println("Missing Element is "+sum);  //Print the missing element

        //if multiple missing numbers are present
        printMissingElements(arr, n);
    }
}
