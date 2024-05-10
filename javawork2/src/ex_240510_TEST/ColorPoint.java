package ex_240510_TEST;

class ColorPoint extends Point {
	

	    String str;
	    public ColorPoint(int x, int y, String str) {
	        super(x,y);
	        this.str = str;
	    }
	    public void setXY(int x, int y) {
	        move(x,y);
	    }
	    public void setColor(String str) {
	        this.str = str;
	    }
	    public String toString() {
	        
	        return str+" ("+getX()+","+getY()+")";
	    }
	}
	

