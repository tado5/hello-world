package shapes;

public class Point extends Shape {



	public Point(int x, int y, char fill) {
		super(x, y, fill);
		setFillChar(fill);
		setX(x);
		setY(y);
	}

	public Point() {
		this(8, 4, '-');
	}

	@Override
	public void draw() {
		setPosition();
		System.out.print(getFillChar());
		System.out.println();

	}
	public void setPosition(){
		for (int j = 0; j < getY(); j++) {
			System.out.println("");
		}
		for(int i=0; i< getX();i++){
			System.out.print(" ");
		}
	}
	
	public  void describe(){
		super.describe();
		
	}

}
