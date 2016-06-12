package org.speranza.ex03pag30;

import java.util.Random;

public class IssnGenerator03 implements NumberGenerator03 {

	@Override
	public String generateNumber() {
		return "8-" + Math.abs(new Random().nextInt());
	}

}
