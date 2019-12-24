package LeetCode.Number26;

//删除数组中的重复项，并返回数组的长度
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3,3,4};
        int n = removeDuplicates(a);
        System.out.println(n);
    }
    private static int removeDuplicates(int[] a){
        int i = 0;
        for (int j=1;j < a.length;++j){
            if (a[i] != a[j]){
                a[++i] = a[j];
            }
        }
        return i+1;
    }
}
