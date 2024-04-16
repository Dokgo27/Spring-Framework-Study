package ch02_pjt_02;

// MainClass는 MyCalcutor 객체를 의존
public class MainClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MyCalculator calculator = new MyCalculator();
		calculator.calculate(10, 5, new CalAdd()); // 객체 주입
		calculator.calculate(10, 5, new CalSub()); // 객체 주입
		calculator.calculate(10, 5, new CalMul()); // 객체 주입
		calculator.calculate(10, 5, new CalDiv()); // 객체 주입
	}
}