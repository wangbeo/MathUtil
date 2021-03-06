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
        // hàm sẽ ném về ngoại lệ nếu bạn đưa vào n cà chớn
        if(n < 0 || n > 15){
            throw new IllegalArgumentException("Invalid argument. n must be >= 0 and <= 15");
        }
//        long result = 1;
//        for( int i=1; i<=n; i++){
//            result *=i;
//            
//    }
//    return result;
        //chơi đệ quy
        if(n==0 || n== 1)
            return 1;
            // diểm dùng đệ quy
                
            // bắt đầu các lệnh ở đây
            //đứa nào viết else bị trừ điểm
            // vì else chỗ này mặc định
            return n * computeFactorial(n-1);
            // xong n! = n* (n-1)!
                
    }
    
    // nhờ jenkins xác nhập code chỉnh sử ổn kh
    // như ngày xưa hay kh
    //Regression dc thực thi bởi jenkins tét lại những gì đã đc tesst
    // de confirm chất luong sau khi thay đổi
}
