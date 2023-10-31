import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestGetMethodToReflect {
    @Test
    public void TestGetMethods() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("Student");
        Method[] methods = aClass.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
    }

    @Test
    public void TestGetDeclareMethods() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("Student");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);
    }

    @Test
    public void TestGetParentMethod() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("Student");
        Method equals = aClass.getMethod("equals");
        System.out.println(equals);
    }

    @Test
    public void TestGetSelfMethod() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("Student");
        Method introduce = aClass.getMethod("introduce",String.class);
        System.out.println(introduce.getName());
        System.out.println(introduce.getParameterCount());
    }


    @Test
    public void TestGetDeclareMethod() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> aClass = Class.forName("Student");
        Method testResult = aClass.getDeclaredMethod("testResult");
        testResult.setAccessible(true);
        Student student = new Student("tom");
        testResult.invoke(student);
    }
}
