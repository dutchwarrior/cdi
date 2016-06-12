package org.speranza.ex14pag43;

import java.util.Random;

public class IssnGenerator14 implements NumberGenerator14 {

	@Override
	public String generateNumber() {
		return "8-" + new Random().nextInt();
	}

}
