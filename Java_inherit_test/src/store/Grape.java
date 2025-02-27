package store;

public class Grape extends Fruit {
	public Grape(int cost, int capacity) {
		super(cost,capacity);
	}
	
	@Override
	public void makeJuice() {
		System.out.println(" 포도 주스 제조");
	}
	@Override
	public void pieceFruit() {
		System.out.println(" 포도 10알 ");
	}
	@Override
	public String toString() {
		return "포도 " + this.cost + "원 "+this.capacity +"ml";
	}
}
