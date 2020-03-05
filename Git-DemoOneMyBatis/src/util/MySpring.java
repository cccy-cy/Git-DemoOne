package util;

import java.util.HashMap;

public class MySpring {

    private static HashMap<String, Object> hashMap = new HashMap<>();

    public static <T>T getBean(String classPath) {
        T t = (T) hashMap.get(classPath);
        if(t == null) {
            try {
                Class clazz = Class.forName(classPath);
                t = (T) clazz.newInstance();
                hashMap.put(classPath, t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return t;
    }
}
