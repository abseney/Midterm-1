package pkgShape;

public abstract class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	
	public Rectangle(int iWidth, int iLength) {
		
		this.setiWidth(iWidth);
		this.setiLength(iLength);
		
	}

	public int getiWidth() {
		return iWidth;
	}


	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}


	public int getiLength() {
		return iLength;
	}


	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		
		return iLength*iWidth;
	}
	
	public double perimeter() {
		
		return 2*iLength+2*iWidth;
		
	}
	
	public int compareTo(Rectangle rect) {
		
		if (this.area() < rect.area()) {
			return -1;
			
		}
		
		if (this.area() > rect.area()) {
			return 1;
			
		}
		
		else {
			return 0;
		}
	}
}
