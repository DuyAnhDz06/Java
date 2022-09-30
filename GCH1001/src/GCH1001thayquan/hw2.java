/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCH1001thayquan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class hw2 {
    public static void main(String[] args) 
    {
     int[] arr = {3,2,1,4,5,2,4,7,9,10,2,3};
     Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements in the array: ");
        int n = scanner.nextInt();
        int brr[] = new int[n];
        
        //2.1 Nhập các phần từ cho mảng từ bàn phím
        // 2.2: Sinh ngẫu nhiên các phần tử trong mảng
        
        Random random = new Random();
        for(int i = 0; i < brr.length; i++)
        {
       // brr[i] = scanner.nextInt(); //2.1 Nhập các phần từ cho mảng từ bàn phím
         brr[i] = random.nextInt(21);     // 2.2: Sinh ngẫu nhiên các phần tử trong mảng
            System.out.println(brr[i] + " ");
        
        }
        System.out.println();
        //=====================================================================
        // Tìm dãy con tăng liên tiếp dài nhất
        int max_size = 1 , count = 1;
        int idx = 0;
        for(int i = 0; i<brr.length - 1; i++)
        {
            if(brr[i] < brr[i + 1]) // đếm các số tăng dần trong dãy
                count++;
            else // Gặp 1 số k tăng, dừng việc đếm, xét các ĐK tương ứng
            {
                if(count > max_size)
                {
                max_size = count;
                idx = i - max_size + 1;
                }
                count = 1;
            }
        }
        System.out.println("Dãy tăng liên tiếp dài nhất: ");
        for(int i = idx; i<max_size; i++)
        {
            System.out.println(brr[i] + " ");
            
        }
        System.out.println();
}
}