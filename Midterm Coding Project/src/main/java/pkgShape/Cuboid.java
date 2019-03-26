package pkgShape;

public class Cuboid extends Rectangle{

	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.setiDepth(iDepth);
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return iDepth * super.getiLength() * super.getiWidth();
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Invalid Operation For Cuboid");
	}

	@Override
	public double area() {
		return 2*iDepth*super.getiLength() + 2*iDepth*super.getiWidth() + 2*super.getiLength()*super.getiWidth();
		
	}
	
	public int compareTo(Cuboid cub) {
		return cub.compareTo(this);
	}
	
	public class SortByArea {
		
		public int compare(Cuboid x, Cuboid y) {
			return Double.compare(x.area(), y.area());
		}
	}
		
	public class SortByVolume {

			public int compare(Cuboid x, Cuboid y) {
				return Double.compare(x.volume(), y.volume());
			}
		}

	
}
