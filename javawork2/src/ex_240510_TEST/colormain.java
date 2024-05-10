package ex_240510_TEST;

public class colormain {
	
	public static void main(String[] args) {
     
        ColorPoint cp = new ColorPoint(5,5,"Yellow");
        cp.setXY(10,20);
        cp.setColor("GREEN색으로");
        String str = cp.toString();
        System.out.println(str);
    }

}
