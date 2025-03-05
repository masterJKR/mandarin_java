package generic3;

public class Snack {
	protected String snackName;
	protected int price;
	
	public Snack(String name ,int price) {
		this.snackName=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "과자이름 : "+snackName + "  가격 : " +price;
	}
}
