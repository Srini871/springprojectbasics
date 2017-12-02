package com.srinivas.spring.springcore.lc.TicketReservationProj;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srinivas/spring/springcore/lc/TicketReservationProj/ticketReservationConfig.xml"
				);
		TicketReservation tr = (TicketReservation) context.getBean("ticketReservation");
		System.out.println(tr);
		context.registerShutdownHook();
		context.close();
	}

}
