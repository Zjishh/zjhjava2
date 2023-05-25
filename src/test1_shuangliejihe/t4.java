package test1_shuangliejihe;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/****************************
 * @project zjhjava2
 * @package test1_shuangliejihe
 * @className t4
 * @author Zjiah
 * @date 2023/5/25 20:35
 * @Description:   *
 ****************************/
public class t4 {
    public static void main(String[] args) {
        String s = "asassasadassasasafaasassa";

        TreeMap<String, Integer> t = new TreeMap<>();

        List<Character> objects = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            objects.add(c);
        }
        System.out.println(objects);

        for (int i = 0; i < objects.size(); i++) {
            String cc = objects.get(i).toString();
            if (!t.containsKey(cc)) {
                t.put(cc,1);
            }else {
                Integer integer = t.get(cc);
                integer++;
                t.put(cc,integer);
            }
        }
        t.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.print(s+"("+integer+")");
            }
        });


    }
}
