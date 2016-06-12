package org.speranza.ex02pag30;

import java.util.Random;

public class IssnGenerator02 implements NumberGenerator02 {

	@Override
	public String generateNumber() {
		return "8-" + Math.abs(new Random().nextInt());
	}

}
