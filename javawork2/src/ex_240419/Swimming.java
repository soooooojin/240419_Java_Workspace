package ex_240419;

public class Swimming {
	private String sportsName;
	private  int sportsMember;
	private String sportsSeason;
	
	@Override
	public String toString() {
		return "Swimming [sportsName=" + sportsName + ", sportsMember=" + sportsMember + ", sportsSeason="
				+ sportsSeason + "]";
	}
	
	static final String swimmingStyle = "이것이 전역 상수!";
			
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public int getSportsMember() {
		return sportsMember;
	}
	public Swimming(String sportsName, int sportsMember, String sportsSeason) {
		super();
		this.sportsName = sportsName;
		this.sportsMember = sportsMember;
		this.sportsSeason = sportsSeason;
	}
	public void setSportsMember(int sportsMember) {
		this.sportsMember = sportsMember;
	}
	public String getSportsSeason() {
		return sportsSeason;
	}
	public void setSportsSeason(String sportsSeason) {
		this.sportsSeason = sportsSeason;
	}
	
	public static String freeStyle() {
		return swimmingStyle;
	}
	
	

}
