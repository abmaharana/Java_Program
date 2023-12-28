package NumberPrograms;

public class SecondHighest {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 10, 10, 10, 6};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number.");
        }
    }
}
