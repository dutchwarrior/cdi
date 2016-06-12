package org.speranza.ex09pag36;

import java.util.Random;

@ThirteenDigits09
@Odd
public class IsbnOddGenerator09 implements NumberGenerator {

	@Override
	public String generateNumber() {
		return "131-84356-" + Math.abs(new Random().nextInt());
	}
}
