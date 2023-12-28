package NumberPrograms;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {

        int array2[] = {1,7,0,0,8,0,10,12,0,4};
        int n = array2.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(array2[i] != 0){
                array2[count++] = array2[i];
            }
        }
        while(count<n)
            array2[count++] = 0;

        for(int j=0;j<n;j++){
            System.out.print(array2[j]+" ");
        }
    }
}
