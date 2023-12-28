package NumberPrograms;

public class FindGreatestNumber {
    public static void main(String[] args) {
        int arr[] = {66, 5, 3, -30};
        int greatest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>greatest){
                greatest = arr[i];
            }else if(arr[i]<smallest){
                smallest = arr[i];{}
            }
        }
        System.out.println(greatest);
        System.out.println(smallest);
    }
}
