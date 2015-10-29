package Util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sun38 on 10/29/2015.
 */
public class ActionFomMap {
    public static Map<String, String> getActionByForm(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("Form.LoginForm", "Action.LoginAction");
        map.put("Form.RegisterForm", "Action.RegisterAction");

        return map;
    }
}
