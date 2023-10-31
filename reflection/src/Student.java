import java.util.List;

public class Student {
    private String name;
    public Integer age;
    private static String clazz = "三班";
    private List<String> hobby;

    private Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer age, String clazz, List<String> hobby) {
        this.name = name;
        this.age = age;
        this.clazz = clazz;
        this.hobby = hobby;
    }

    public void introduce(){
        System.out.println("大家好，我是"+this.name);
    }
    public void introduce(String introduceName){
        System.out.println("大家好，我是"+introduceName);
    }

    public void birthday(){
        System.out.println("今天我过生日,我长大了一岁");
    }

    private void testResult(){
        System.out.println("我的考试成绩");
    }
}