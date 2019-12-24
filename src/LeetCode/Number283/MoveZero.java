package LeetCode.Number283;

public class MoveZero {
    public static void main(String[] args) {
        int[] a = {1,0,3,5,7,0,3,2};
        moveZeros2(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //方法1
    private static void moveZeros1(int[] a){
        int r = a.length,index=0;
        for (int i = 0; i < r; i++) {
            if (a[i] != 0){
                a[index++] = a[i];
            }
        }
        while (index < r){
            a[index++] = 0;
        }
    }

    //方法2
    private static void moveZeros2(int[] a){
        int j = -1,temp;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0){
                j++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}
