package WordPrograms;

public class FirstTwoChar {
    public static void main(String args[]){
        String s = "This is String";
        s+=" ";
        String w = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w+=c;
            else {
                //Word Processing
                System.out.println(w.substring(0,2));
                w="";
            }
        }
    }
}
