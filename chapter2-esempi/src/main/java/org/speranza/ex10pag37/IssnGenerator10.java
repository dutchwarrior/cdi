package org.speranza.ex10pag37;

import java.util.Random;

public class IssnGenerator10 implements NumberGenerator10 {

	@Override
	public String generateNumber() {
	    return "8-" + Math.abs(new Random().nextInt());
	  }
}
