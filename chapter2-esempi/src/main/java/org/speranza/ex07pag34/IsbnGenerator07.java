package org.speranza.ex07pag34;


import java.util.Random;

@ThirteenDigits07
class IsbnGenerator07 implements NumberGenerator07 {

  // ======================================
  // =          Business methods          =
  // ======================================

  @Override
public String generateNumber() {
    return "13-84356-" + Math.abs(new Random().nextInt());
  }
}