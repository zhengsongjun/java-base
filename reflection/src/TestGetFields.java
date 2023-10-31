import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class TestGetFields {
    @Test
    public void getFields() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("Student");
        Field[] fields = aClass.getFields();
        Arrays.stream(fields).forEach(System.out::println);
    }

    @Test
    public void getDeclareFields () throws ClassNotFoundException {
        Class<?> aClass = Class.forName("Student");
        Field[] fields = aClass.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);
    }


    @Test
    public void getField() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> aClass = Class.forName("Student");
        Field age = aClass.getField("age");
        System.out.println(age);
    }

    @Test
    public void getDeclareField() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> aClass = Class.forName("Student");
        Field names = aClass.getDeclaredField("name");
        System.out.println(names);
    }

    @Test
    public void TestGetAndSet() throws Exception {
        Class<?> aClass = Class.forName("Student");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Student student = (Student) declaredConstructor.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(student,"tom");
        System.out.println(name.get(student));
    }
}
