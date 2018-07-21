import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author lixu
 * @date 2018年07月20日 15:24
 *
 */
public class Dscc {//单行注释
    public static void main(){
        try {
            FileInputStream fileInputStream=new FileInputStream("d:\\xx.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
