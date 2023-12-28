package WordPrograms;

public class EndWith {
    public static void main(String args[]){
        String s = "This is a String";
        s+=" ";
        String w = ""; int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w+=c;
            else {
                //Word Processing
                if(w.endsWith("is") ) {
                    System.out.println(w);
                    count++;
                }
                w="";
            }
        }
        System.out.println("No. of words:"+count);
    }
}
