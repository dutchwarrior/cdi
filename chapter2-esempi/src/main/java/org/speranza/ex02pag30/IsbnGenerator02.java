package org.speranza.ex02pag30;

import java.util.Random;

public class IsbnGenerator02 implements NumberGenerator02{

	@Override
	public String generateNumber() {
		return "13-84356-" + Math.abs(new Random().nextInt());
	}

}
