package ch02_pjt_02;

public class MyCalculator {
	
	public void calAdd(int fNum, int sNum, CalAdd calAdd) { // 인수로 CalAdd 클래스 객체를 받는다.
		ICalculator calculator = new CalAdd();				// CalAdd()는 ICalculator를 구현(implement)한다.
		int value = calculator.doOperation(fNum, sNum);		// 메소드 오버라이딩(doOperation)
		System.out.println("result : " + value);			// 인자로 들어온 클래스에 따라 동적으로 바인딩
	}
	public void calSub(int fNum, int sNum, CalSub calSub) {
		ICalculator calculator = new CalSub();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	public void calMul(int fNum, int sNum, CalMul calMul) {
		ICalculator calculator = new CalMul();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	public void calDiv(int fNum, int sNum, CalDiv calDiv) {
		ICalculator calculator = new CalDiv();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}

}
