package ch02_pjt_03;

//MyCalculator 객체는 4개(CalAdd, CalSub, CalMul, CalDiv)의 객체에 의존
public class MyCalculator {
	
	public void calculate(int i, int j, ICalculator cal) {
		int value = cal.doOperation(i, j);
		System.out.println("result : " + value);
	}
	
	/*
	public void CalAdd(int fNum, int sNum, CalAdd calAdd) {
		int value = calAdd.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
	public void CalSub(int fNum, int sNum, CalSub calSub) {
		int value = calSub.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
	public void CalMul(int fNum, int sNum, CalMul calMul) {
		int value = calMul.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
	public void CalDiv(int fNum, int sNum, CalDiv calDiv) {
		int value = calDiv.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	*/
}
