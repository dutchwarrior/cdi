package org.speranza.ex23DecoratorExample;

import java.util.Random;

@TypeProcess
public class IssnGenerator implements NumberGenerator{

	@Override
	public String generateNumber() {
		return "issn" + new Random().nextInt();
	}

}
