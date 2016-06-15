package shapes;

public class Line2 extends Shape {

	private int size;
	
	

	public Line2(int x, int y, char fill, int size) {
		super(x, y, fill);
		setX(x);
		setY(y);
		setFillChar(fill);
		setSize(size);
	}

	public Line2() {
		this(6, 2, '-', 6);

	}
	
	public void draw(){

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 10; j++) {
				if(i == getX () && j < getY() ){
					for (int j2 = 0; j2 < size; j2++) {
					System.out.print( getFillChar() + " ");	
					}
					
					
					}
				else {
					System.out.print("* ");
					
				}
				
			}
			System.out.println("*");
			
		}
		
		
		
		
	}
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
