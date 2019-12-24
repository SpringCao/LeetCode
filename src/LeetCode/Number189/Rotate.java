package LeetCode.Number189;

//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
public class Rotate {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
//        int[] b = rotate1(a,4);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        rotate2(a,4);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    //法1：我首先可以想到的，时间复杂度为O(n),空间复杂度为O(n)
    private static int[] rotate1(int[] a,int k){
        int[] b = new int[a.length];
        int i = 0;
        for (int j = k; j < a.length; j++) {
            b[i++] = a[j];
        }
        for (int s = 0; s < k; s++) {
            b[i++] = a[s];
        }
        return b;
    }

    //法2：时间复杂度为O(n),空间复杂度为O(1)
    private static void rotate2(int[] a,int k){
        k = k % a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);

    }
    private static void reverse(int[] a,int begin,int end){
        int temp;
        while (begin < end){
            temp = a[begin];
            a[begin] = a[end];
            a[end] = temp;
            begin++;
            end--;
        }
    }
}
