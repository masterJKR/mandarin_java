package test2;

public class Cash extends Payment{//현금
	public Cash(int m, String date) {
		super(m,date);
	}
	
	@Override
	public void processPay() {
		System.out.println("현금 결제 금액 : "+this.money +
				" 결제일 : "+this.payDate);
	}
}
