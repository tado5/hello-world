package shapes;

public class Line extends Shape {
	private int size;

	public Line(int x, int y, char fill, int size) {
		super(x, y, fill);
		setX(x);
		setY(y);
		setFillChar(fill);
		setSize(size);
	}

	public Line() {
		this(6, 2, '-', 6);

	}

	@Override
	public void draw() {
		setPosition();
		for (int i = 0; i < getSize(); i++) {
			System.out.print(getFillChar() + " ");
		}
		System.out.println();
	}

	public void setPosition() {
		for (int i = 0; i < getY(); i++) {
			System.out.println();
		}
		for (int j = 0; j < getX(); j++) {
			System.out.print(" ");
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void describe() {
		System.out.println("Velkost : " + getSize()	); 
		super.describe();
	}

}
