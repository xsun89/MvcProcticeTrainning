package Util;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

/**
 * Created by sun38 on 10/22/2015.
 */
public class FullBean {
    public static Object getFullBean(String className, HttpServletRequest request) throws ClassNotFoundException {
        Object o = null;
        try {
            Class clazz = Class.forName(className);
            o = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for(Field f: fields){
                f.setAccessible(true);
                f.set(o, request.getParameter(f.getName()));
                f.setAccessible(false);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return o;
    }
}
