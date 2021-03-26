/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutk.ultil;

/**
 *
 * @author Admin
 */
public class MathUtility {

    //Class này chứa 1 nhóm hàm toán học, fake từ class chuẩn
    // java.util.Math của JDK
    // Vì là đồ xài chung cho nên sẽ là STATIC
    public static final double PI = 3.1415;

    //Hàm tính n!
    //Vì giai thừa tăng rất nhanh, 21! tràn kiểu long
    //Kiểu long chịu đc 10^18 18 con số 0. Lớn hơn nữa là thua
    //âm giai thừa ko tính đc
    //hàm chỉ chấp nhận từ 0..20! -> long
    //0! = 1! = 1
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
//        
//        if (n == 0 || n == 1) 
//            return 1; //khỏi mất công tính, return ngay
//        
//        //Sống sót đến đoạn này, sure n = 2..20
//        long result = 1; // Cố tình để value này
//        
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        //n! = 1.2.3.4.5....n
//        return result;
//    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");

        if (n == 0 || n == 1) 
            return 1; //khỏi mất công tính, return ngay
 
        return n * getFactorial(n - 1);
    }
}
