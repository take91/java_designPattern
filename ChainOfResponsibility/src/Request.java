
public class Request {
	
	private int x,y;
	private String oper;
	
	public Request(int x, int y, String oper) {
		super();
		this.x = x;
		this.y = y;
		this.oper = oper;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getOper() {
		return oper;
	}
	
	
}
