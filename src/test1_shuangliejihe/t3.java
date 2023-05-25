package test1_shuangliejihe;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/****************************
 * @project zjhjava2
 * @package test1_shuangliejihe
 * @className t3
 * @author Zjiah
 * @date 2023/5/25 20:08
 * @Description:   *
 ****************************/
public class t3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> objectObjectLinkedHashMap = new LinkedHashMap<>();

        objectObjectLinkedHashMap.put(2,"zjhs");
        objectObjectLinkedHashMap.put(3,"zjhs");
        objectObjectLinkedHashMap.put(2,"zjhd");

        System.out.println(objectObjectLinkedHashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeMap.put(2,"b");
        treeMap.put(1,"a");
        treeMap.put(3,"c");
        treeMap.put(4,"a");

        System.out.println(treeMap);

        TreeMap<Student, String> treeMap2 = new TreeMap<>();

        treeMap2.put(new Student("zjh",22),"linyi");
        treeMap2.put(new Student("zjh",32),"lin33yi");
        treeMap2.put(new Student("ajh",32),"lin33yi");
        treeMap2.put(new Student("azjh",11),"lin2yi");

        System.out.println(treeMap2);






    }
}
