package mvc;

public class AuthModel {
	public AuthModel()
	{
		
	}
	public boolean login(String userName, String password) {
		if(userName.equals("admin")&&password.equals("123"))
		{
			return true;
		}
		return false;
	}
}