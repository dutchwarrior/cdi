package org.speranza.ex11pag38;

import javax.inject.Inject;

@ThirteenDigits11
public class IsbnGenerator11 implements NumberGenerator11{

	@Inject
	@ThirteenDigits11
	private String prefix;
	
	@Inject
	@ThirteenDigits11
	private int number;
	
	@Inject
	@Ramdom11
	private double postfix;
	
	@Override
	public String generateNumber() {
		return prefix + number + postfix;
	}

}
