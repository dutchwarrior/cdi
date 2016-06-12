package org.speranza.ex09.pag36;

import java.util.Random;

@EightDigits09
@Even09
public class IssnGenerator09 implements NumberGenerator {

	@Override
	public String generateNumber() {
	    return "8-" + Math.abs(new Random().nextInt());
	  }
}
