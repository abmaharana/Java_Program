package NumberPrograms;

public class OddEven {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        int[] evenArr = new int[arr.length];
        int[] oddArr = new int[arr.length];

        int evenIndex = 0, oddIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[evenIndex++] = num;
            } else {
                oddArr[oddIndex++] = num;
            }
        }

        // Copy even elements to the original array
        System.arraycopy(evenArr, 0, arr, 0, evenIndex);

        // Copy odd elements after even elements in the original array
        System.arraycopy(oddArr, 0, arr, evenIndex, oddIndex);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
