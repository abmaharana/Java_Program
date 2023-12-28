package NumberPrograms;

public class ReverseNumber {
    public static void main(String[] args) {

        //using algo
        int n = 12345;
        int rev= 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        System.out.println(rev);

        //Using stringbuffer
        int n1 = 45678;
        System.out.println(new StringBuffer(String.valueOf(n1)).reverse());

    }
}
