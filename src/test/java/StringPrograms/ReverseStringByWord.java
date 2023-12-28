package StringPrograms;

public class ReverseStringByWord {
    public static String reverseStringWay1(String s){

        int i=s.length()-1;
        String ans=" ";

        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            int j=i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' ') i--;

            if(ans.isEmpty()){
                ans = ans.concat(s.substring(i+1,j+1));
            }else {
                ans = ans.concat(" "+s.substring(i+1,j+1));
            }
        }

        return ans;
    }

    public static String[] reverseStringWay2(String s){
        String str = s;
        //convert string to array with index
        String a[] = str.split(" ");

        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i=a.length-1;i>=0;i--){
            //prints string/word at that index starting from a[2] to a[0]
            System.out.print(a[i]+" ");
        }
        return a;
    }

    public static void main(String[] args) {
        String s = "I love my India";
        System.out.println(reverseStringWay2(s));
    }
}
