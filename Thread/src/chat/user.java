package chat;

public class user implements Runnable 
{

	String name;
	String msg;
	ChatWindow chatWindow;
	
	Thread t;
	
	public user(String name,String msg,ChatWindow chatWindow) {
		
		this.name = name;
		this.msg = msg;
		this.chatWindow = chatWindow;
		
		t = new Thread(this);
		t.start();
	}


	@Override
	public void run() {
		chatWindow.displayMsg(msg,name);
	}
	
}
