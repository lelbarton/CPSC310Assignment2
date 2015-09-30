
public class HelloWorld {
	String message;
	int repeat;
    
	public HelloWorld(String message, int repeat) {
		this.message = message;
        this.repeat = repeat;
	}
	
	public void ToString() {
		for (int i=0; i < repeat; i++) {
            System.out.println(this.message);
        }
	}
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("Hello World!", 3);
		hw.ToString();
	}
	
	
}
