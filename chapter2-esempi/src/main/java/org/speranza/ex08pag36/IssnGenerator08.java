package org.speranza.ex08pag36;

import java.util.Random;

@NumberOfDigits08(odd = false, value = Digits.EIGHT)
public class IssnGenerator08 implements NumberGenerator08{

	@Override
	public String generateNumber() {
		return "8-" + Math.abs(new Random().nextInt());
	}

}
