package Action;

import Form.ActionForm;
import Form.LoginForm;
import Util.FullBean;

/**
 * Created by sun38 on 10/28/2015.
 */
public class LoginAction implements Action{
    public String execute(ActionForm form) {
        String ret = "";
        try {
            ret = ((LoginForm)form).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
