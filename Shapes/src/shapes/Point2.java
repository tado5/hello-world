package shapes;

public class Point2 extends Shape {

	public Point2(int x, int y, char fill) {
		super(x, y, fill);
		setFillChar(fill);
		setX(x);
		setY(y);
	}

	public Point2() {
		this(5, 5, '-');
	}

	public void draw() {

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {

				if (i == getY() && j == getX()) {
					System.out.print(getFillChar() + " ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}
}
