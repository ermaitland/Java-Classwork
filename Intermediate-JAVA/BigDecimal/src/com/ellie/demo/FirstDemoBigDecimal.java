package com.ellie.demo;

import java.math.BigDecimal;

public class FirstDemoBigDecimal {
 public static void main(String[] args) {
	 double a=0.03;
     double b=0.04;
     double c=b-a;
     System.out.println(c);

     BigDecimal _a = new BigDecimal("0.03");
     BigDecimal _b = new BigDecimal("0.04");
     BigDecimal _c = _b.subtract(_a);
     System.out.println(_c);
 }
}
