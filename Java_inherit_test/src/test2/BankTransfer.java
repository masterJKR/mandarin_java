package test2;

public class BankTransfer extends Payment{//이체
	public BankTransfer(int m, String date) {
		super(m,date);
	}
	
	@Override
	public void processPay() {
		System.out.println("이체 금액 : "+this.money +
				" 결제일 : "+this.payDate);
	}
}
