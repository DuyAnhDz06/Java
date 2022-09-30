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
// Bảng cửu chương
public class EX03 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++ ) //Xét lần lượt từng ô cửu chương
        {
        for (int j = 1; j <= n; j++)  // Các giá trị cần nhân trong ô cửu chương đang xét
        {
        int ok = j * i;
            System.out.println(i + " x " + j + " = " + ok);
        }
            System.out.println("----------------------------------");
        }
    }
}
