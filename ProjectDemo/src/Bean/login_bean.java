package Bean;
import java.io.Serializable;
public class login_bean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String loginName;
	private String password;

	public String getloginName() {
		return loginName;
	}

	public void setloginName(String loginName) {
		this.loginName = loginName;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
}

