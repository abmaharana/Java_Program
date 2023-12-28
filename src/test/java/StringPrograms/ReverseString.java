package StringPrograms;

public class ReverseString {

        public static void main(String[] args) {
//            String s = new String("5");
//            System.out.println(1 + 10 + s + 1 + 10);

            System.out.println("Jayaguru");
            String s = "This is the String";
            String rev = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                rev = ch + rev;
            }
            System.out.println(rev);
        }
    }


//    public static void main(String args[]){
//
//        //Way 1
//        System.out.println("Jayaguru");
//        String s = "This is the String" ;
//        String rev = "";
//        for (int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            rev = ch+rev;
//        }
//        System.out.println(rev);
//
//        /**
//        //For Palindrome add below code
//        if(s.equalsIgnoreCase(rev))
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not Palindrome");
//        */
//
//        /**Way 2
//        StringBuffer s = new StringBuffer("This is the String");
//        System.out.println(s.reverse());
//         */
//
//    }
