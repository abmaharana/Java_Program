package StringPrograms;

public class SeparateNumFromString {
    public static void main(String[] args) {
        String input = "abc123def";
        int sum = 0;
        int digitValue=0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                digitValue = Character.getNumericValue(c);
                System.out.println("Digits in the string: "+digitValue);
                sum += digitValue;
            }
        }

        System.out.println("Sum of numeric digits in the string: " + sum);
    }
}



   // ArrayList<Integer> al = [1234, 5678, 2345, 1098, 1190, 9123, 2134]

//find max product of arr = {6, -3, -10, 0, 2}





