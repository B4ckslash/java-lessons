public class ArrayLoop {
    static int arr[] = new int[10];
    public static void main(String[] args) {
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        while(index < arr.length) {
            System.out.println(arr[index]);
            index++;
        }
    }
}
