package FirstTask;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationWithMethod {
    @Test(a = 2, b = 5)
    public static int test(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> cls = AnnotationWithMethod.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                int result = (Integer) method.invoke(null, test.a(), test.b());
                System.out.println(result);
            }
        }
    }
}
