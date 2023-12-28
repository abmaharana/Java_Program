package WordPrograms;

public class aWordExistsOrNot {
    public static void main(String args[]){
        String s = "Mom or Dad";
        String w = "";
        s+="";
        int count=0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=' ')
                w += c;
            else {
                //Word processing
                if(w.equalsIgnoreCase("or"))
                    count++;
                w="";
            }

        }
        if(count==0)
            System.out.println("Not Found");
        else
            System.out.println("Found");
    }
}
