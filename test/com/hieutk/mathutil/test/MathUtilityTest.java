/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutk.mathutil.test;

import static com.hieutk.ultil.MathUtility.*; //Tao muốn các hàm, biến
import java.sql.SQLException;
                                                          //Trog class này gõ trực tiếp luôn
                                                          //gõ trực tiếp ko cần class chấm
                                                          //chỉ static mới có điều này
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest  {

    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult()  {
        int n = 5;
        long expected = 120;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
            
        //Mình test tiếp các trường hợp khác đúng đầu vào, đúng đầu ra
        //Khỏi cần biến trung gian, chơi luôn trong lệnh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1,  getFactorial(0));
    }
    
    //Điều gì xảy ra nếu ta đưa vào tham số cà chớn, âm hoặc > 20
    //Theo thiết kế của hàm, đưa vào cà chớn sẽ ném ra ngoại lệ và ta cần
    //test xem ngoại lệ có được ném ra không nếu ta cà chớn
    //TỨC LÀ XUẤT HIỆN NGOẠI LỆ NẾU CÓ CÀ CHỚN ĐƯA VÀO -> HÀM ĐÚNG
    //THẤY NGOẠI LỆ KHI CÓ CÀ CHỚN MÌNH LẠI MỪNG VÌ HÀM ĐÃ CHẠY ĐÚNG
    
    @Test(expected = IllegalArgumentException.class)
    //Có đúng là khi chạy hàm này thì ném ra ngoại lệ tên là IllegalArgument
    //Nếu đúng nó ném ra ngoại lệ cùng tên, code đúng rồi, XANH THOY
    public void testFatorialWrongArgumentThrownException() {
        //Mình test tình huống hàm phải ném ra ngoại lệ nếu tham số cà chớn
        //ngoại lệ ko phải là value để so sánh, ko dùng assertEquals()
        //ta phai dùng chiêu khác. JUnit 4 khác JUnit 5 ở chỗ bắt ngoại lệ
        //Kì 5 đi dự thính SWT301 của thầy HOàng: DI, Lambda, Expression liên quan
        //JUnit 5                           Dependency Injection / SOLID
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }

}
