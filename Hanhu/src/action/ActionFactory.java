package action;

public class ActionFactory {
	public Action getAction(String command) {
		Action action = null;
		switch(command) {
		case "signIn":
			action = new SignInAction();
			break;
		case "loginCheck":
			action = new LoginCheckAction();
			break;
		}
		return action;
	}
}
