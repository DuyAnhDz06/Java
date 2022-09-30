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
public class EX05 {
    // Nhận vào 1 chuỗi và 1 số k biểu diễn k phép dịch phải ký tự
    // In ra chuỗi kết quả
    // VD: str = "Quay", k = 2
    // Output = "Swcb"
  
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        int k = scan.nextInt();
//        char[] chars = input.toCharArray();
//        for (int i = 0; i < chars.length; i++)
//        {
//            chars[i] += k;
//        }
//        System.out.println("input");

public static void main(String[] args) {
		//Nhận vào 1 chuỗi, và 1 số k biểu diễn k phép dịch phải ký tự.
		// In ra chuỗi kết quả
		
		// Ví dụ: str =  "Quay", k=3
		//       output = "Txd{c )9" 
		
//		String str = new String("Qua{y )9");
//		int k = 81;
//		char ch[] = str.toCharArray();  //Phương thức java string toCharArray () chuyển đổi chuỗi đã cho thành một chuỗi ký tự . Độ dài mảng được trả về bằng độ dài của chuỗi
//                
//
//		for(int i = 0; i<ch.length; i++) //biến độ dài này để tìm kích thước của một mảng
//                {
//                    //t là ký tự thử dịch chuyển
////                    if(ch[i] < 'a' && ch[i] > 'z' || ch[i] < 'A' && ch[i] > 'Z')
////                   
////                    else
//                        int status = isLetter(ch[i]);
//                        if(status != 0)  // THis is a letter
//                        {
//			int t = ch[i] + k%26;   //ch : là mảng chuỗi ký tự từ chuỗi ban đầu cho vào
//                    if(status == 1)
//                    {
//			if(isLower(ch[i]))
//                        {
//				ch[i] = (char) ((t <='z') ? t : ('a' + (t-'z'))); // nếu t < z thì giữ nguyên t
//			}
//                        else 
//                        {
//				ch[i] = (char) ((t <='Z') ? t : ('A' + t-'Z'));
//			}
//		}
//                }
//		String output = new String(ch);
//		System.out.println("Result = " + output);
//	}
//// Thành phần trong hàm
////1. Tham số PARAMETER chính là input của 1 hàm
////2. Kiểu dữ liệu của giá trị trả về (return type)
//// Data type of the expected output
////3. Function Name. EX: isLower
////	private static boolean isLower(char c) {
////		if(c >='a' && c <= 'z') // &&đánh giá bên trái của hoạt động, nếu nó true, nó tiếp tục và đánh giá bên phải.
////			return true; // returned value
////		else 
////			return false;
////	}
//        private static int isLetter(char c) {
//		if(c >='a' && c <= 'z') // &&đánh giá bên trái của hoạt động, nếu nó true, nó tiếp tục và đánh giá bên phải.
//			return 1; // returned value
//		else if(c >='A' && c <= 'Z')
//			return 2;
//                else
//                    return 0;
//	}
//
//    private static int isChar(char c) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
        //Nhận vào 1 chuỗi, và 1 số k biểu diễn k phép dịch phải ký tự.
        // In ra chuỗi kết quả

        // Ví dụ: str =  "Quay", k=3
        //       output = "Txdc" 
        // Ví dụ: str =  "Qua{y )9", k=3
        //       output = "Txd{c }9" 
        String str = new String("Qua{y )9");
        int k = 81;
        char ch[] = str.toCharArray(); // ch là mảng các kí tự từ chuỗi ban đầu vào
        for (int i = 0; i < ch.length; i++) {
            int status = isLetter(ch[i]);
            if (status != 0) {  //This is a letter
                int t = ch[i] + k % 26;  //t là kí tự khi mình thử dịch chuyển
                if (status == 1) {
                    ch[i] = (char) ((t <= 'z') ? t : ('a' + (t - 'z'))); // nếu t nhỏ hơn hoặc bằng z thì ch[i] = t nếu lơn hơn z thì sẽ bằng a cộng thêm phần dư của t - z
                } else if (status == 2) {
                    ch[i] = (char) ((t <= 'Z') ? t : ('A' + t - 'Z'));

                }
            }
        }

        String output = new String(ch);     // output sẽ bằng chuỗi ch đã dịch chuyển thành công
        System.out.println("Result = " + output);
    }
    //Thành phần trong hàm
    //1. Tham số(Parameter) là input của 1 hàm. VD char c
    //2. Kiểu dữ liệu của giá trị trả về (return type). VD boolean
    //Data type of the expected output
    //3. Function name. VD isLower

    private static int isLetter(char c) {    //Phân biệt chữ hoa và chữ thường
        if (c >= 'a' && c <= 'z') {
            return 1;    //Returned Value
        } else if ((c >= 'A' && c <= 'Z')) {
            return 2;
        } else {
            return 0;
        }
    }
}
