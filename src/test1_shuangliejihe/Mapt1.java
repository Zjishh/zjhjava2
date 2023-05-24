package test1_shuangliejihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/****************************
 * @project zjhjava2
 * @package test1_shuangliejihe
 * @className Mapt1
 * @author Zjiah
 * @date 2023/5/24 20:20
 * @Description:   *
 ****************************/
public class Mapt1 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("1","asdas");
        m.put("2","asdweewas");
        m.put("3","asdrqrefas");

        System.out.println(m);

//        Set<String> strings = m.keySet();
//        System.out.println(strings);
//        for (String string : strings) {
//            System.out.println(string);
//            System.out.println(m.get(string));
//        }

//        Set<Map.Entry<String, String>> entries = m.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry);
//        }

        m.forEach((s,s2) -> System.out.println(s+s2));
    }
}
