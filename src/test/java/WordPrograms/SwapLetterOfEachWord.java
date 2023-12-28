package WordPrograms;

public class SwapLetterOfEachWord {
    public static void main(String args[]) {
        String s = "In the box";
        String w = "";
        s += " ";
        String ns = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                char f = w.charAt(0);
                char l = w.charAt(w.length()-1);
                String m = w.substring(1,w.length()-1);
                ns = ns + l + m + f + " ";
                w = "";
            }
        }
        System.out.println(ns);
    }
}
