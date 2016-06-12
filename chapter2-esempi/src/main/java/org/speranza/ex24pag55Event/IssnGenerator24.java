package org.speranza.ex24pag55Event;

import java.util.Random;

public class IssnGenerator24 implements INumberGenerator {

	@Override
	public String generateNumber() {
		return "8-" + new Random().nextInt();
	}

}
