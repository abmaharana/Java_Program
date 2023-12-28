package NumberPrograms;

public class PrintDigitsInNumber {
    public static void main(String args[]){
        int n = 268;
        int m = n; //Make a copy of the number n
        while(n!=0){ //Till the number is '0'
            int d = n%10;
            System.out.println(d);
            n = n/10; //It gives only the number and drops the remainder
        }
    }
}
