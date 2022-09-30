/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeGiaitri;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class InsertionSort {
    // Tạo ra 1 biến để Lưu vào giá trị cần đổi chỗ
    // Duyệt mảng 
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a[]= new int [100];
        int n;
        System.out.print("Please Input Array :");
        n= sc.nextInt();
 
        for(int i = 0; i < n ; i++)
        {
            System.out.print("a[" + i + "]= ");
           
            a[i]=sc.nextInt(); 
        }

        int index, k;
	    for(int i = 1; i < n; i++)
            { 
		k = a[i];                                   // k=a[1]
		index = i;                               //pos = 1
		while(index > 0 && k < a[index-1])
                {                                           // 1>0 va a[1]<a[0]  thi
			a[index] = a[index-1];	    // a[1]=a[0]
			index--;                         //pos-- => pos=0 
		}
		a[index] = k;                            // sau khi chay vong lap while gan a[0] = a[1]
	    }
                 System.out.println("The array after insertion sort is:  ");
                 for(int i=0;i<n;i++)
        {
            
                 System.out.println("a[" + i + "]= " + a[i]);
        }
  
        
    }
}
