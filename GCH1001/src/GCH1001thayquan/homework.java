/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCH1001thayquan;


import java.util.Scanner;
/**
 *
 * @author DELL
 */
 // HOMEwork
// * // 1. Cho 1 mảng arr và 1 giá trị k, tìm các cặp có tổng = k 
// * ví dụ: arr = {1, 9, 2, 8, 2, 7, 0, 4, 1, 6} 
// * k = 10
// * out put: (1, 9); (2, 8), (4, 6)

// * // 2. Tìm dãy tăng liên tiếp dài nhất trong 1 mảng
// * VÍ Dụ: arr = {3,2,1,4,5,2,4,7,9,10,2,3}
// * Output:
// * Dãy tăng tiếp tiếp dài nhất là: 2,4,7,8,10

    
        public class homework {
             public static void main(String[] args) {
 int[] nums = {1,9,2,8,2,7,0,4,1,6};
        int target = 10;
 
        findPair(nums, target);
}
       public static void findPair(int[] nums, int target)
    {
        // consider each element except the last
        for (int i = 0; i < nums.length - 1; i++)
        {
            // start from the i'th element until the last element
            for (int j = i + 1; j < nums.length; j++)
            {
                // if the desired sum is found, print it
                if (nums[i] + nums[j] == target)
                {
                    System.out.println("Pair found (" + nums[i] + "," + nums[j] + "); ");
                    
                }
            }
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
}


