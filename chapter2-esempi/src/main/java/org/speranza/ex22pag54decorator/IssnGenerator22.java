package org.speranza.ex22pag54decorator;

import java.util.Random;

public class IssnGenerator22 implements Numbergenerator22{

	@Override
	public String generateNumber() {
		return "8-" + Math.abs(new Random().nextInt());
	}

}
