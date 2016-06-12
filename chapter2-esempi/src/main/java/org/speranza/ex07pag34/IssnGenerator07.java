package org.speranza.ex07pag34;

import java.util.Random;

@EightDigits07
public class IssnGenerator07 implements NumberGenerator07 {

	@Override
	public String generateNumber() {
		return "8-" + Math.abs(new Random().nextInt()) ;
	}

}
