package ch02_pjt_02;

//ICalcultor 구현
public class CalDiv implements ICalculator{ // ICalculator 인터페이스 구현

	@Override
	public int doOperation(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		return secondNum != 0 ? (firstNum / secondNum) : 0;
	}
	
}
