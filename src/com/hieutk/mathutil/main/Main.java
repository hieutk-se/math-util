/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutk.mathutil.main;

import com.hieutk.ultil.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muốn test 5! có đúng 120 ko
        int n = 5; // n!
        long expected = 120; //hi vong 120 trả về
        long actual = MathUtility.getFactorial(n); // thực tế hàm chạy là mấy vậy
        //mình so sánh để biết đúng sai?
        System.out.println("5! expected: " + expected +
                "; actual: " + actual);
        
        //tui muốn test 0! có đúng là 1 hem?
        
        n = 0; // n!
        expected = 1; //hi vong 120 trả về
        actual = MathUtility.getFactorial(n); // thực tế hàm chạy là mấy vậy
        //mình so sánh để biết đúng sai?
        System.out.println(n + "! expected: " + expected +
                "; actual: " + actual);
    }
    
}
//VIẾT CODE XONG THÌ PHẢI TEST CODE - NGUYÊN TẮC PHẢI THEO
//TEST NGAY TỪNG HÀM TỪNG CLASS TRƯỚC KHI RÁP CHÚNG VỚI CÁC CLASS KHÁC
//Test ngay khi xong hàm, xong class được gọi là test mức độ 1, Unit Test (test mức đơn vị code
//Làm sao để test. Có nhiều cách
//1. Cách 1: sout(gọi hàm()) đẻ in ra kết quả xủ lí của hàm (OOP)
//2. Cách 2: JOptionPane để popup lên kết quả xủ lí của hàm (J Desktop)
//3. Cách 3: Ghi ra log file (JW)
// 3 cách này đều phải dùng mắt để xem kết quả, và tự kết luận đúng sai
//đúng: tức là hàm chạy ra 1 giá trị - ACTUAL VALUE
//                      và ta thấy ACTUAL VALUE khớp, bằng với giá trị mà ta mong đợi
//                      ta tính ra trước bằng tay
//Ví dụ 5! thì ta hi vọng expected hàm trả về 120
// nhưng khốn nạy thay, hàm trả về đúng 120 - actual
//hàm chạy đúng cho 5!

//*sai: tui test 6!, expected = 720, khốn nạn thay, chạy ra actual = 120
// hàm xủ lí sai


//CÁCH 4: MÁY ƠI SO SÁNH GIÙM VÀ KẾT LUẬN GIÙM TAO LUÔN VÌ MÀY
//CÓ CÁC PHÉP TOÁN SO SÁNH MÀ
//CON NGƯỜI KHÔNG CẦN NHÌN TỪNG DÒNG KẾT QUẢTRẢ VỀ ĐỂ LUẬN ĐÚNG SAI
//MÁY SẼ LO CHO
//NẾU TẤT CẢ ĐỀU ĐÚNG - > HÀM ĐÚNG - > HÀM ĐÚNG - >MÀU XANH
//HẦU HẾT TÌNH HUỐNG CHẠY HÀM ĐỀU ĐÚNG, CÓ 1 CÁI SAI - > HÀM SAI
//                                                             - > MÀU ĐỎ
//ĐỎ: CHỈ CẦN 1 THẰNG SAI
//XANH: TẤT CẢ PHẢI ĐỀU ĐÚNG

//MUỐN LÀM ĐC ĐIỀU NÀY TA CẦN THƯ VIỆN TRỢ GIÚP CHO JAVA XANH ĐỎ
//ĐIỀU NÀY CŨNG CÓ BÊN C#, PHP, JS, RUBY
//Java: Unit, TestNG
//C#  :NUnit, xUnit, MSTest
//PHP : PHPUnit
//...