
public class HelloWorld {
	String message;
	String pony;
	
	public HelloWorld(String message, String pony) {
		this.message = message;
		this.pony = pony; 
	}
	
	public void ToString() {
		System.out.println(this.message);
		System.out.println(this.pony);
	}
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("Hello World!", "My Ltitle Pony!");
		hw.ToString();
	}
	
	
}
