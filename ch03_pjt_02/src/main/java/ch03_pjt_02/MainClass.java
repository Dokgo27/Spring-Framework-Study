package ch03_pjt_02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TransportationWalk twork = new TransportationWalk(); // TransportationWalk에 의존하는 main 클래스
		//twork.move();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml"); // 빈으로 만들어 놓은 객체를 찾아서 생성.
		
		TransportationWalk tWalk = ctx.getBean("tWalk",TransportationWalk.class);
		tWalk.move();
		
		ctx.close();
	}
}
