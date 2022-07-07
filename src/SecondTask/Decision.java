package SecondTask;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Decision {
    public static void main(String[] args) {
        TextContainer textContainer = new TextContainer();
        SaveIn saveIn = textContainer.getClass().getAnnotation(SaveIn.class);
        Method[] methods = textContainer.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                try {
                    method.invoke(textContainer, saveIn.path());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
