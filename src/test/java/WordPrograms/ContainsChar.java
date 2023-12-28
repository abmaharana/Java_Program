package WordPrograms;

public class ContainsChar {
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
                if(w.contains("s") || w.contains("S"))
                    System.out.println(w);
                w="";
            }
        }
    }
}
