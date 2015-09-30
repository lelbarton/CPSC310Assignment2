
public class HelloWorld {
	String message;
	
	public HelloWorld(String message) {
		this.message = message;
	}
	
	public void ToString() {
		System.out.println(this.message);
	}
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("Hello World!");
		hw.ToString();
	}
	
	
}
