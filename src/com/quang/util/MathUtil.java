/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quang.util;

/**
 *
 * @author wangp
 */
// class nay chua những hàm toán học, tính toán gì đó, giúp cho mọi nơi khác 
// phàm cái gì mang tính chất xài  chung cho mọi nơi, t se dùng kĩ thuật
// STATIC
public class MathUtil {
    // tinh n! = 1.2.3...n -> vì n! tăng kết quả rất nhanh, sẽ tràn kiểu int sớm, do int chỉ tối đa 2 tỷ 1, do đó xài long an toàn hơn
    // tuy thế 15! đã là to lắm, mình hạn chế chỉ tính 15! đỏ lại
    public static long computeFactorial(int n)
    {
        long result = 1;
        for( int i=1; i<=n; i++){
            result *=i;
            
    }
    return result;
    }
}
