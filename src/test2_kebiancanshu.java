/****************************
 * @project zjhjava2
 * @package PACKAGE_NAME
 * @className test2_kebiancanshu
 * @author Zjiah
 * @date 2023/5/25 20:54
 * @Description:   *
 ****************************/
public class test2_kebiancanshu {
    public static void main(String[] args) {

        System.out.println(add(3, 4, 5));
    }
//***99*99
    private static int add(int... i) {
        int sun=0;
        for (int i1 = 0; i1 < i.length; i1++) {
            sun += i[i1];
        }
        return sun;
    }
}
