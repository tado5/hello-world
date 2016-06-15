package shapes;

public class Rectangle extends Shape {

	private int x;
	private int y;
	private char fillChar;
	private int a, b;

	public Rectangle(int x, int y, char fill, int a, int b) {
		super(x, y, fill);
		setFillChar(fill);
		this.setX(x);
		this.setY(y);
		this.a = a;
		this.b = b;
	}

	public Rectangle() {
		// super(2, 2, '+');
		this(2, 6, '-', 5, 4);
	}

	@Override
	public void draw() {
		setYPosition();
		for (int i = 0; i < getB(); i++) {
			setXPosition();
			for (int j = 0; j < getA(); j++) {

				System.out.print(getFillChar() + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
	}

	public void describe() {
		System.out.println("Velkost :  " + getA() + ", " + getB() ); 
		super.describe();
	}

	public void setYPosition() {
		for (int j = 0; j < getX(); j++) {
			System.out.println();
		}
	}

	public void setXPosition() {
		for (int j = 0; j < getX(); j++) {
			System.out.print(" ");
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public char getFillChar() {
		return fillChar;
	}

	public void setFillChar(char fillChar) {
		this.fillChar = fillChar;
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

}
