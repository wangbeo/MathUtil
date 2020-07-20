/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttd;

import com.quang.util.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wangp
 */
public class MathUtilTest {
    
    @Test
    public void testSuccessfulCases()
    {
        //ddaay la ham dung de test cac dau vao hop le cua ham cF()
        // vi du cF(5), cF(6), ... minh se goi o day, coi actual cua chung tra ve
        // co khop voi excepted hay kh
        // tuy nhien minh ko chi tro sout() tu luan
        // mà để cho .jar vừa vào tự luận kết quả mà đẻ cho,.jar vau add vua tu luan ke qua so sanh
        // roi in ra xanh do cho minh xem
        Assert.assertEquals(1, MathUtil.computeFactorial(0));
        Assert.assertEquals(1, MathUtil.computeFactorial(1));
        Assert.assertEquals(2, MathUtil.computeFactorial(2));
        Assert.assertEquals(6, MathUtil.computeFactorial(3));
        Assert.assertEquals(24, MathUtil.computeFactorial(4));
        Assert.assertEquals(720, MathUtil.computeFactorial(6));
    // mau xanh chi xay ra neu tat ca la mau xanh
    // chyaj đúng mọi truong hop cân xu ly
// mau do chi can 1 thang mau đo là toang rôi    
// đúng gần hét chỉ 1 case bị sai
// túm lại có 1 chút error coi như là error
        
    }
    
    @Test(expected  = IllegalArgumentException.class)
        public void testFailedCases()
        {
            // ham nay test truongw hopjw ddwua data caf chowns
            // vd -5! 
            // kh tinhs ddc chuws chu ko tra vef -1 noi rang dau vao vo ly
            // vi xet -1 ddc xem la 1 value
            // tinh huống adaauf vào ca chớn ta sẽ tung ả ném ra ngoài lề nào đó
            // mà Exception nới chung thi kh pahir là 1 valur
            // noi đại diện cho 1 cái bất thuognwf nào đó
            // bất thương thì kh thể só sánh
            // vậy mà tình huống hàm trả lkaij ngoại lê kh xài 
            // kh xài đc hàm assertEquak(value,value,...)
            // ta xài chiu kahsc 
            // chờ đưa ra ngoại lệ
            MathUtil.computeFactorial(-5);
            // du code đỏ hay xanh do mình chơi kiêu test app qua junit
            // thi: clean and build luôn chạy
            // nhiệm vụ gốc ban đầu code kh có error cú pháp , phải ra .jar .war
            
            
            // mình sẽ năng cấp code bạn còn màu đỏ tức là chyaj kh như kỳ vọng 
            // tao disable nút clean + build
            // hoặc code bạn phải màu xanh, hoạc bạn xóa mẹ nó mấy phần test đi thì
            // mới ra .jar .war
            
            
            //nhớ 2 con số dặc biệt 
            // netbeans 8 --> 1005
            // netbena 10 trở lên --> 1204
            
            
            
                    
        }
}
