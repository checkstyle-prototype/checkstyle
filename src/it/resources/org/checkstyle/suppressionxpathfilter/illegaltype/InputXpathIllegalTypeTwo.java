package org.checkstyle.suppressionxpathfilter.illegaltype;

import java.io.Serializable;

public class InputXpathIllegalTypeTwo {
 public <T extends Boolean, U extends Serializable> void typeParam(T a) {} // warn
}
