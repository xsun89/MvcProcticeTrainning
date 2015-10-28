package Form;

import Util.FullBean;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sun38 on 10/28/2015.
 */
public class RegisterForm extends ActionForm implements Comparable{
    private String username = "";
    private String password1 = "";
    private String password2 = "";
    private String email = "";

    public RegisterForm() {}

    public RegisterForm(String username, String password1, String password2, String email) {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegisterForm)) return false;

        RegisterForm that = (RegisterForm) o;

        if (!getUsername().equals(that.getUsername())) return false;
        if (!getPassword1().equals(that.getPassword1())) return false;
        if (!getPassword2().equals(that.getPassword2())) return false;
        return getEmail().equals(that.getEmail());

    }

    @Override
    public int hashCode() {
        int result = getUsername().hashCode();
        result = 31 * result + getPassword1().hashCode();
        result = 31 * result + getPassword2().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
    }

    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "RegisterForm{" +
                "username='" + username + '\'' +
                ", password1='" + password1 + '\'' +
                ", password2='" + password2 + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
