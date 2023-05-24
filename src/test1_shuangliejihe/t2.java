package test1_shuangliejihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/****************************
 * @project zjhjava2
 * @package test1_shuangliejihe
 * @className t2
 * @author Zjiah
 * @date 2023/5/24 20:45
 * @Description:   *
 ****************************/
public class t2 {
    public static void main(String[] args) {
        Map<Student, String> s = new HashMap<>();
        Student student1 = new Student("张家豪",22);
        Student student66 = new Student("张家豪",22);
        Student student2 = new Student("xxp",222);
        Student student3 = new Student("xxpqwq",222);

        s.put(student1,"临沂");
        s.put(student66,"临沂ww");
        s.put(student2,"ss ");
        s.put(student3,"dd");

//       s.forEach(new BiConsumer<Student, String>() {
//           @Override
//           public void accept(Student student, String s) {
//               System.out.println(student+s);
//           }
//       });

        Set<Map.Entry<Student, String>> entries = s.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry);
        }

    }
}
