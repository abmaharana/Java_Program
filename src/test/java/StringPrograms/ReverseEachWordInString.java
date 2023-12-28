package StringPrograms;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String name = "I love my India";
        String reversedName = reverseString(name);
        System.out.println(reversedName);
    }

    public static String reverseString(String input) {
        String words[] = input.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }
    }
