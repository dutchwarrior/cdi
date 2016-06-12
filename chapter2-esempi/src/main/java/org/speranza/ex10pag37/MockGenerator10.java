package org.speranza.ex10pag37;

import javax.enterprise.inject.Alternative;

@Alternative
public class MockGenerator10 implements NumberGenerator10{

	@Override
	public String generateNumber() {
		return "mock generator";
	}

}
