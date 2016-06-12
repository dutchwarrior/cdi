package org.speranza.ex11pag38;

import javax.inject.Inject;

@EightDigits11
public class IssnGenerator11 implements NumberGenerator11{

	@Inject
	@EightDigits11
	private String prefix;
	
	@Inject
	@Ramdom11
	private double postfix;
	
	@Override
	public String generateNumber() {
		return prefix + postfix;
	}

}
