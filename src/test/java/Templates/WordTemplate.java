package Templates;

public class WordTemplate {
    public static void main(String args[]){
        String s = "This is a String";
        s+=" "; //Adds a space after last word in a string i.e., no. of words = no. of spaces
        String w = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w+=c;
            else {
                //Word Processing
                System.out.println(w);
                w="";
            }

        }


    }
}
