package NumberPrograms;

public class SpecialNumber {
    public static void main(String args[]){
        int n= 59;
        int m=n;

        int sum=0,prod=1;
        while(n!=0){
            int d = n%10;
            sum = sum + d;
            prod = prod * d;
            n = n/10;
        }
        //Check
        if(sum+prod==m)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
