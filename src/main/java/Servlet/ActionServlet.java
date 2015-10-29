package Servlet;

import Action.Action;
import Form.ActionForm;
import Form.LoginForm;
import Form.RegisterForm;
import Util.ActionFomMap;
import Util.FullBean;
import Action.LoginAction;
import Action.RegisterAction;

import java.io.IOException;
import java.util.Map;

/**
 * Created by sun38 on 10/22/2015.
 */
public class ActionServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            String value = request.getParameter("sign");
            ActionForm form = FullBean.getFullBean(request);
            Map<String, String> map = ActionFomMap.getActionByForm();
            Class clazz = Class.forName(map.get(value));
            Action act = (Action)clazz.newInstance();
            String ret = act.execute(form);
            System.out.println(ret);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
