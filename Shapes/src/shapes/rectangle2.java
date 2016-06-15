package shapes;

public class rectangle2 implements rotable {
	int x;
	int y;

	public rectangle2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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

	@Override
	public void draw() {
	 int a; 
	 a= x;
	 x=y;
	 y = a;
	 System.out.println("otocil si obdlznik" );
	 
	
	 
	}
	public void inspect(){
		System.out.println( "obdlynik ma " + getX() +" "+ getY() );
		
		
	}

}
