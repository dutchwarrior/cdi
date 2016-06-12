package org.speranza.ex06pag32;


import java.util.Random;

public class IsbnGenerator06 implements NumberGenerator06 {

  // ======================================
  // =          Business methods          =
  // ======================================

  @Override
public String generateNumber() {
    return "13-84356-" + Math.abs(new Random().nextInt());
  }
}