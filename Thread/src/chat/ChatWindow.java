package chat;

public class ChatWindow {

	public void displayMsg(String msg,String username)
	{
		System.out.println("Window-1");
		
		synchronized (this) {
			System.out.println("[");
			
			 
			System.out.println(username);
			
			  
			System.out.println(msg);
			System.out.println("]");
			
		}
		
		System.out.println("Window-2");
	}
}