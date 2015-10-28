package Form;

/**
 * Created by sun38 on 10/22/2015.
 */
public class LoginForm implements Comparable{
    private String username = "";
    private String password = "";
    public LoginForm(){}
    public LoginForm(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginForm loginForm = (LoginForm) o;

        if (!username.equals(loginForm.username)) return false;
        return password.equals(loginForm.password);

    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int compareTo(Object o) {
        return 0;
    }
}
