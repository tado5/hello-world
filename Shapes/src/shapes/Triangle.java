package shapes;

public class Triangle extends Shape {

	private int size;

	public Triangle(int x, int y, char fill, int size) {
		super(x, y, fill);
		setFillChar(fill);
		setX(x);
		setY(y);
		setSize(size);

	}

	public Triangle() {
		this(3, 4, '-', 6);
	}

	@Override
	public void draw() {
		setYPosition();
		for (int i = 0; i < getSize(); i++) {
			setXPosition();
			printChars(i + 1, getFillChar());
			System.out.println();
		}

	}

	private void printChars(int length, char c) {
		for (int i = 0; i < length; i++) {
			System.out.print(c);
		}
	}

	public void printTriangle(int size) {
		for (int i = 0; i < size; i++) {

			printChars(i + 1, '*');
			System.out.println();
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setXPosition() {
		for (int i = 0; i < getX(); i++) {
			System.out.print(" ");
		}
	}

	public void setYPosition() {
		for (int i = 0; i < getY(); i++) {
			System.out.println();
		}
	}

	public void describe() {
		System.out.println("Velkost: " + getSize() + ", ");
		super.describe();
	}

}
