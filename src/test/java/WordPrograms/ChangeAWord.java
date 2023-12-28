package WordPrograms;

public class ChangeAWord {
    public static void main(String args[]) {
        String s = "A Red Seed";
        s += " ";
        String w = "";
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                //Word Processing
                if (w.equals("Red"))
                    ns = ns + "Blue" + " ";
                else
                    ns = ns + w + " ";
                w = "";
            }
        }
        System.out.println(ns);
    }
}



