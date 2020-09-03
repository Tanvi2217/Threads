package chat;

public class MainClass {
	public static void main(String[] args) {
		
		ChatWindow chatWindow = new ChatWindow();
		
		new user("tanvi", "Good Morning", chatWindow);
		new user("abc", "Java", chatWindow);
		new user("def", "Threading", chatWindow);
		new user("xyz", "Servlet", chatWindow);
		
		
	}

}
