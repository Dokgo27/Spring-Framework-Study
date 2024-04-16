package ch02_pjt_03;

//ICalcultor 구현
public class CalDiv implements ICalculator{

	@Override
	public int doOperation(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		return secondNum != 0 ? (firstNum / secondNum) : 0;
	}
	
}
