package NumberPrograms;

public class NumberProgramTemplate {
    public static void main(String args[]){
        int n= 121;
        int m=n;

        //Initialization
        while(n!=0){
            int d = n%10;
            /////////////
            ////Logic////
            /////////////
            n = n/10;
        }
        //Check
        if(m==n)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
