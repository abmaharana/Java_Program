package WordPrograms;

public class FirstChar {
    public static void main(String args[]){
        String s = "This is a String";
        s+=" ";
        String w = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w+=c;
            else {
                //Word Processing
                System.out.println(w.charAt(0));
                w="";
            }
        }
    }
}

