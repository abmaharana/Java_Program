package NumberPrograms;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] n = {1,2,3,1,2,4};
        //char[] ch = n.toString();
        System.out.print("Duplicates number in the array are: ");
        for (int i=0; i<n.length; i++){
            for (int j = i+1; j<n.length; j++){
                if(n[i]==n[j]){
                    System.out.print(n[j]+",");
                    break;
                }
            }
        }

//        int n = 92; //92
//        int[] m = new int[10];
//        for (int i = 1; i < m.length; i++) {
//            if (m[i] == m[i + 1]) {
//                System.out.println("It is the same numbers");
//            }else
//                System.out.println(new StringBuffer(String.valueOf(m)).reverse());
//        }
    }
}
