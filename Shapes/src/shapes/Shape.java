package shapes;

public abstract class Shape {

	private int x, y;
	private char fillChar;

	public Shape(int x, int y, char fill) {
		this.setX(x);
		this.setY(y);
		this.setFillChar(fill);
	}

	public abstract void draw();

	public char getFillChar() {
		return fillChar;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public void describe() {
		System.out.print("Pozicia ");
		System.out.print(" X : " + getX());
		System.out.println(", Y: " + getY()); 
		System.out.println("znak : " + getFillChar());
	}

	public void setFillChar(char fillChar) {
		this.fillChar = fillChar;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

}
