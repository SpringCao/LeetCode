package LeetCode.Number88;

//合并两个有序数组
public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4};
        int[] b ={3,3,4,5,7};
        int[] c = mergeArrays(a,6,b,5);
        for (int i = 0; i < a.length+b.length; i++) {
            System.out.println(c[i]);

        }
    }
    private static int[] mergeArrays(int[] a,int m,int[] b,int n){
        int[] c = new int[m+n];
        int i = 0,j = 0,k = 0;
        while (i <a.length && j <b.length) {
            if (a[i] <= b[j]){
                c[k++] = a[i];
                ++i;
            }else {
                c[k++] = b[j];
                ++j;
            }
        }
        while (i < a.length ) c[k++] = a[i++];
        while (j < b.length ) c[k++] = b[j++];
        return c;
    }
}
