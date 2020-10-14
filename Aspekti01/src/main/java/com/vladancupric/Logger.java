package com.vladancupric;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
	public void preFotogrfisanja() {
		System.out.println("Fotografija ce upravo biti napravljena");
	}
	public void posleFotografisanja() {
		System.out.println("Fotografija je napravljena");
	}
	public void fotografijaJePoslata() {
		System.out.println("Fotografija je poslata");
	}
	public void aroundAdvice(ProceedingJoinPoint p) {
		System.out.println("Nalazimo se na pocetku snimanja");
		preFotogrfisanja();
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Nalazimo se na zavrsetku fotografisanja");
		posleFotografisanja();
	}

}
