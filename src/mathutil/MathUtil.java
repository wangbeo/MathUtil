/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathutil;
import  static com.quang.util.MathUtil.computeFactorial;
/**
 *
 * @author wangp
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5!=" + computeFactorial(5));
        // doan code nay hinh la tesy ham bang tay, manual test
        // tuc la  ta chuẩn bị dât đẻ tét, chính là số 5, đàu vào
        // t gọi hàm cf(5)
        // ta chạy hàm ta xem nó in ra số giừ (actual value)
        // trc đó ta phải tự tính bằng tay 5! cái ta kì vọng hàm pahir
        // trả về con số này, 120 là cái ta hy vọng hàm phải trả vè cho 5!
        // gọi là expected value ( kết quả muốn thấy)
        // hàm chạy xong ta so sánh kết quả giữa expected và actual nếu khớp nhau
        // hàm chạy xử lý đuugs, vì xử lý đứng mới ra như kỳ vọng
        // nếu khong khớp, hoặc mình kỳ vọng sai
        
        // làm bằng tay t phải so sánh expected và actual bằng mắt để luận
        // kết quả đúng sai
        
        //expected : 720 
        System.out.println("6!=" + computeFactorial(6));
        
        // expected : chửi cà chớn
        // m đưa đầu vào cà chớn bố chửi m = việc ném ra ngoại lệ
        // exception, vì éo tính đc đầu vào cà chớn
        System.out.println("-5!=" + computeFactorial(-5));
        // nhnaf bằng mắt  nhìn kết quả, nhưng chưa hay
        // giang hờ có hỡ trợ ccacs bộ thư viện giúp ta tét hàm ta viết 1 cách
        // hiệu quả hơn qua nhiều hiệu ứng màu sắc, và chứng tụ so sanh dùm ta
        // t kh cần sout{} nhìn kq, so sánh mắt với kỳ vọng
        // tool này se so sánh giùm ta báo ta 2 trạng thái duy nhất
        // màu xanh code chạy actual khớp với ễcption
        // màu đỏ toàng , actual kh lkhowps execption 
        // thu viện này mang tne chung
    }
    
}
