package WordPrograms;

public class WordCount {
    public static void main(String args[]){
        String s = "MOM OR DAD";
        s+=" ";
        String w = ""; int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w+=c;
            else {
                //Word Processing
                count++;
                w="";
            }
        }
        System.out.println("No. of words in this sentence: "+count);
    }
}
