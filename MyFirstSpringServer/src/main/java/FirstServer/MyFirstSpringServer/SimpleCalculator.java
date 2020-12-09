package FirstServer.MyFirstSpringServer;

public class SimpleCalculator {
	private int x, y;
	
	public SimpleCalculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getFirstUserInput() {
		return x;
	}
	
	public void setFirstUserInput(int x) {
		this.x = x;
	}
	
	public int getSecondUserInput() {
		return y;
	}
	
	public void setSecondUserInput(int y) {
		this.y = y;
	}
	
	public int add (int x, int y) {
		return x + y;
	}
	
	public int subtract (int x, int y) {
		return x - y;
	}
	
	public int divide (int x, int y) {
		return x / y;
	}
	
	public int multiply (int x, int y) {
		return x * y;
	}
}
