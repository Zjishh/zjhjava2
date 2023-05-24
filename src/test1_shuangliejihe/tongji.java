package test1_shuangliejihe;

import java.util.*;
import java.util.function.BiConsumer;

/****************************
 * @project zjhjava2
 * @package test1_shuangliejihe
 * @className tongji
 * @author Zjiah
 * @date 2023/5/24 21:09
 * @Description:   *
 ****************************/
public class tongji {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        List<String> s2 = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            String s = list.get(new Random().nextInt(4));
            s2.add(i,s);
        }
        System.out.println(s2);

        Map<String,Integer> m = new HashMap<>();

        for (String s : s2) {

            if (!m.containsKey(s)){
                m.put(s,0);
            }else {
                int cont = m.get(s);
                cont++;
                m.put(s,cont);
            }

        }

        m.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+"----"+integer);
            }
        });
        int max = 0;
        String res = "";
        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {

            if (entry.getValue()>max){
                max = entry.getValue();
                res = entry.getKey();
            }
        }

        System.out.println(max+res );

    }
}
