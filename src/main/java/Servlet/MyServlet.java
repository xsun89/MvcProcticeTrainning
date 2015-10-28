package Servlet;

import Form.LoginForm;
import Util.FullBean;

import java.io.IOException;

/**
 * Created by sun38 on 10/22/2015.
 */
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String value = request.getParameter("sign");
        try {
            LoginForm form = (LoginForm)FullBean.getFullBean(value, request);
            System.out.println(form.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
