package ch03_pjt_03;

public class CalAssembler {
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;

//	이전버전이 했던 방식
//	public CalAssembler() { // 생성자 생성 시 바로 계산할 수 있도록
//		calculator = new MyCalculator();
//		calAdd = new CalAdd();
//		calSub = new CalSub();
//		calMul = new CalMul();
//		calDiv = new CalDiv();
//		
//		assemble();
//	}

	// 전체적인 코드는 변하지 않았지만 생성자 주입 방식이 달라졌다.
	public CalAssembler(MyCalculator calculator, CalAdd calAdd, CalSub calSub, CalMul calMul, CalDiv calDiv) {
		super();
		this.calculator = calculator;
		this.calAdd = calAdd;
		this.calSub = calSub;
		this.calMul = calMul;
		this.calDiv = calDiv;
	}

	public void assemble() {
		calculator.calculate(10, 5, new CalAdd());
		calculator.calculate(10, 5, new CalSub());
		calculator.calculate(10, 5, new CalMul());
		calculator.calculate(10, 5, new CalDiv());
	}
}
