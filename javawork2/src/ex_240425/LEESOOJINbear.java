package ex_240425;

public class LEESOOJINbear extends LEESOOJINAnimal{
	
	private String kindOf;
	private String color;	
	
	
	public String getKindOf() {
		return kindOf;	}
	public void setKindOf(String kindOf) {
		this.kindOf = kindOf;
	}	
	public String getColor() {
		return color;	
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public LEESOOJINbear(String name, int age, String[] favoriteFood,String kindOf,String color) {
		super(name, age, favoriteFood);
		// TODO Auto-generated constructor stub
	}
	
	
}
