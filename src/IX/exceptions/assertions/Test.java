package IX.exceptions.assertions;

import javax.security.auth.login.AccountException;
import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.LoginException;

public class Test {

	public static void main(String[] args) {
		try {
			LoginException le = new AccountNotFoundException();
			throw  (Exception) le;// Goes to first handler because of polimorphysm
			//throw new Exception(le); //Go to last handler because I explicit create a new Exception object passing an argument
		} catch (AccountNotFoundException anfe) {
			System.out.println("In the handler of AccountNotFoundException");
		} catch (AccountException ae) {
			System.out.println("In the handler of AccountException");
		} catch (LoginException le) {
			System.out.println("In the handler of LoginException");
		} catch (Exception e) {
			System.out.println("In the handler of Exception");
		}
	}
}
