package ch02_pjt_02;

//ICalcultor 구현
public class CalMul implements ICalculator{ // ICalculator 인터페이스 구현

	@Override
	public int doOperation(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		return firstNum * secondNum;
	}
	
}
