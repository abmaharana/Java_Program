package WordPrograms;

public class ChangeCaseAlternateWord {
    public static void main(String args[]){
        String s = "A red seed";
        String w= "";
        s+=" ";
        String ns = "";
        int count = 0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w+=c;
            else {
                if (count++%2==0)
                    ns = ns + w.toUpperCase()+" ";
                else
                    ns = ns + w.toLowerCase()+" ";
                w="";
            }
        }
        System.out.println(ns);

    }
}
