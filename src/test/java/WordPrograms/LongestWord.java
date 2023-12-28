package WordPrograms;

public class LongestWord {
    public static void main(String args[]){
        String s = "A Red Seed";
        s+=" ";
        String w = "";
        String lw = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w+=c;
            else {
                //Word Processing
                if(w.length()>lw.length())
                    lw=w;
                w="";
            }

        }
        System.out.println(lw);
    }
}
