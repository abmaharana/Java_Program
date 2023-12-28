package StringPrograms;

public class SplitString {
    public static void main(String args[]){
        /**
         * INPUT : A1B1c2d3U4u5i10
         * OUTPUT:
         * ABCDUUI
         * 123450
         */

        //using algo
        String s = "M1AD2A3M",uCaseAlpha = "";
        StringBuffer alpha = new StringBuffer();
        StringBuffer num = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                StringBuffer res = alpha.append(ch);
                uCaseAlpha = res.toString().toUpperCase();

            }else
                num.append(ch);
        }
        System.out.println(uCaseAlpha);
        System.out.println(num);

        //using regular expression
        String s1 = "M1AD2A3M";
        System.out.println(s1.replaceAll("[0-9]",""));
        System.out.println(s1.replaceAll("[^0-9]",""));

    }
}
