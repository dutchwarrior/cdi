package org.speranza.ex08pag36;

import java.util.Random;

@NumberOfDigits08(odd = true, value = Digits.THIRTEEN)
public class IsbnOddGenerator08 implements NumberGenerator08 {

	@Override
	public String generateNumber() {
		return "131-84356-" + Math.abs(new Random().nextInt());
	}

}
