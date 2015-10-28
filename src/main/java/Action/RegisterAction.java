package Action;

import Form.ActionForm;
import Form.RegisterForm;

/**
 * Created by sun38 on 10/28/2015.
 */
public class RegisterAction implements Action{
    public String execute(ActionForm form) {
        String ret = "";
        try {
            ret = ((RegisterForm)form).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
