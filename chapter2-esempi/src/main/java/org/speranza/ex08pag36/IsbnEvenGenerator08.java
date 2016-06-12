package org.speranza.ex08pag36;

import java.util.Random;

@NumberOfDigits08(odd = false, value = Digits.THIRTEEN)
public class IsbnEvenGenerator08 implements NumberGenerator08 {

	@Override
	public String generateNumber() {
		return "132-84356-" + Math.abs(new Random().nextInt());
	}

}
