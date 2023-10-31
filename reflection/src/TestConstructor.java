import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class TestConstructor {
    @Test
   public void TestGetConstructorMethod() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("Student");
        Constructor<?>[] constructors = aClass.getConstructors();
        Arrays.stream(constructors).forEach(constructor -> {
            System.out.println("构造器名称是:"+constructor.getName()+"构造器个数："+constructor.getParameterCount());
        });
    }

    @Test
    public void getDeclareConstructors() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("Student");
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        Arrays.stream(constructors).forEach(constructor -> {
            System.out.println("构造器名称是:"+constructor.getName()+"构造器个数："+constructor.getParameterCount());
        });
    }

    @Test
    public void TestGetConstructor() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("Student");
        Constructor<?> constructor = aClass.getConstructor(String.class);
        System.out.println(constructor.getName());
    }

    @Test
    public void TestGetDeclareConstructor() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("Student");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        System.out.println(declaredConstructor.getName());
    }
    
    
    @Test
    public void TestNewInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("Student");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Student student = (Student) declaredConstructor.newInstance();
        System.out.println(student);
    }
}
