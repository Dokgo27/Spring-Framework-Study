package ch03_pjt_03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class);
		calAssembler.assemble();

//		<bean id="calAssembler" class = "ch03_pjt_03.CalAssembler">
//			<constructor-arg ref="myCalculator"/>
//			<constructor-arg ref="cAdd"/>
//			<constructor-arg ref="cSub"/>
//			<constructor-arg ref="cMul"/>
//			<constructor-arg ref="cDiv"/>
//		</bean>

	}

}
