package ch02_pjt_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator calculator = new MyCalculator();
		
		//DI(Dependency Injection) 의존성 주입
		calculator.calAdd(10, 5, new CalAdd()); // 인수로 클래스 CalAdd()가 넘어감 
		calculator.calSub(10, 5, new CalSub());
		calculator.calMul(10, 5, new CalMul());
		calculator.calDiv(10, 5, new CalDiv());
	}
}
