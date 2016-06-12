package org.speranza.ex09.pag36;

import java.util.Random;

@ThirteenDigits09
@Even09
public class IsbnEvenGenerator09 implements NumberGenerator{

	@Override
	public String generateNumber() {
		return "132-84356-" + Math.abs(new Random().nextInt());
	}
}
