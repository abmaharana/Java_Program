package NumberPrograms;

public class PrintNumWithoutUsingNum {
    public static void main(String[] args) {
        int one = 'A'/'A';
        String s = "..........";

        for (int i=one;i<(s.length()*s.length());i++){
            System.out.println(i);
        }

        for (int i=one;i<='d';i+=one){
            System.out.println(i);
        }
    }
}
