import java.util.ArrayList;
import java.util.List;

/**
 * 4. There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * You may assume nums1 and nums2 cannot be both empty.
 */
// 本题思路：采用双指针方法，每次判断两个数组的array的指针处大小，将小的那个存入新的数组中，
// 注意，当存到 (nums1.length + nums2.length)/2 + 1 时就停止，后边没有必要再比较了。
public class Solution_4_Median_Two_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lens1 = nums1.length;
        int lens2 = nums2.length;
        int ini1 = 0;
        int ini2 = 0;
        double median;
        List<Integer> myList = new ArrayList<>();
        while (myList.size() < (lens1 + lens2)/2 + 1){
            if (ini1 < lens1 & ini2 < lens2){
                if (nums1[ini1] < nums2[ini2]){
                    myList.add(nums1[ini1]);
                    ini1++;
                }else{
                    myList.add(nums2[ini2]);
                    ini2++;
                }
            }else if (ini1 == lens1){
                myList.add(nums2[ini2]);
                ini2++;
            }else{
                myList.add(nums1[ini1]);
                ini1++;
            }
        }
        if ((lens1 + lens2)%2 == 0){
            median = ((double) myList.get((lens2+lens1)/2 - 1) + myList.get((lens2+lens1)/2))/2;
        }else{
            median = (double) myList.get((lens2+lens1)/2);
        }
        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        Solution_4_Median_Two_Arrays sol = new Solution_4_Median_Two_Arrays();
        System.out.println(sol.findMedianSortedArrays(nums1,nums2));
    }
    // 最终提交时间 20190507
    // 运行时间 3ms 超过了 71.24%用户
    // 运行内存 48.5m 超过了 78.07%用户
}
