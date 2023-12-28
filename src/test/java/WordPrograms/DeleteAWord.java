package WordPrograms;

public class DeleteAWord {
    public static void main(String args[]){
        String s = "A Red seed";
        String w="";
        s+=" ";
        String ns = "";
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w+=c;
            else{
                //
                if(!w.equalsIgnoreCase("Red"))
                    ns = ns + w + " ";
                    w="";
            }
        }
        System.out.println(ns);
    }
}
