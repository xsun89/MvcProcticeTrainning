package Servlet;

import Action.Action;
import Form.ActionForm;
import Form.LoginForm;
import Form.RegisterForm;
import Util.FullBean;
import Action.LoginAction;
import Action.RegisterAction;

import java.io.IOException;

/**
 * Created by sun38 on 10/22/2015.
 */
public class ActionServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            String value = request.getParameter("sign");
            ActionForm form = FullBean.getFullBean(request);
            Action act = null;
            if(value.equals("Form.RegisterForm")){
                act = new RegisterAction();
            }else if(value.equals("Form.LoginForm")){
                act = new LoginAction();
            }
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
