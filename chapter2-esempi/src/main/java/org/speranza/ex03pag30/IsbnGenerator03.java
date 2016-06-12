package org.speranza.ex03pag30;

import java.util.Random;

public class IsbnGenerator03 implements NumberGenerator03{

	@Override
	public String generateNumber() {
		return "13-84356-" + Math.abs(new Random().nextInt());
	}

}
