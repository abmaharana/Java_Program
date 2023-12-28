package WordPrograms;

public class CountWord {
    public static void main(String args[]){
        String s = "A Red Seed";
        String w="";
        s+=" ";
        int count=0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=' ')
                w+=c;
            else{
                count++;
                w = " ";
            }
        }
        System.out.println(count);
    }
}
