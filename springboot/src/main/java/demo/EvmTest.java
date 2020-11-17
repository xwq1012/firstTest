package demo;

import java.io.File;

/**
 * @Author xwq
 * @Date 2020/9/17 16:30
 */
public class EvmTest {

    public static void main(String[] args) {
        String contents = "http://113.207.121.39:17088/main/evaluatereq/qrdynamic/score?projectId=5000000119XKCK20200917011589963906&proStatus=3&areaId=500116&sign=2e440bc9a398c9a7c3a6f75a82b59854&timestamp=&appId=0DD9FE9095&pf=3&backUrl";
        String format = "jpeg"; //***此处如果格式为"gif"，则logo图片为黑色，其他格式ok
        //生成二维码
        File logoImg = new File("C:\\Users\\pc\\Desktop\\ewm.png");
//        File img = new File("D:"+File.separator+"csdn.jpg");
        File img = new File("C:\\Users\\pc\\Desktop\\\\ewm.png");
        EncodeImgZxing.writeToFile(contents, format, img);
//      //添加logo图片
        File img1 = new File("C:\\Users\\pc\\Desktop\\favicon.png");
        EncodeImgZingLogo.writeToFile(img, logoImg, format, img1);
        System.out.println("over................");
    }
}
