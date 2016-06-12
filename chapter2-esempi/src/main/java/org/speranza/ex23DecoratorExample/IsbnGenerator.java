package org.speranza.ex23DecoratorExample;

import java.util.Random;

public class IsbnGenerator implements NumberGenerator{

	@Override
	public String generateNumber() {
		return "isbn" + new Random().nextInt();
	}

}
