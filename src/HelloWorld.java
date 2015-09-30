
public class HelloWorld {
	String message;
	String pony;
	int repeat;
	
	public HelloWorld(String message, String pony, int repeat) {
		this.message = message;
		this.pony = pony; 
		this.repeat = repeat;
	}
	
	public void ToString() {
		for (int i=0; i < this.repeat; i++) {
            		System.out.println(this.message);
			System.out.println(this.pony);
        	}
	}

	public void setRepeat(Int num) {
		this.repeat = int;
	}
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("Hello World!", "My Little Pony!", 3);
		setRepeat(5);
		hw.ToString();
	}
	
	
}
