package StringPrograms;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "MADAM";
        char[] ch = str.toCharArray();

        System.out.print("Duplicates char in the string are: ");
        for (int i=0; i<str.length(); i++){
            for (int j = i+1; j<str.length(); j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[j]+" ");
                    break;
                }
            }
        }
    }
}
