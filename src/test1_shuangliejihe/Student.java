package test1_shuangliejihe;

import java.util.Objects;

/****************************
 * @project zjhjava2
 * @package test1_shuangliejihe
 * @className Student
 * @author Zjiah
 * @date 2023/5/24 20:40
 * @Description:   *
 ****************************/
public class Student implements Comparable<Student>{
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }


    @Override
    public int compareTo(Student o) {
        int i = this.getAge() - o.getAge();
        i = i==0?this.getName().compareTo(o.getName()):i;
        return i;


    }
}
