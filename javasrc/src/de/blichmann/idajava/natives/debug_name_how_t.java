/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public enum debug_name_how_t {
  DEBNAME_EXACT,
  DEBNAME_LOWER,
  DEBNAME_UPPER,
  DEBNAME_NICE;

  public final int swigValue() {
    return swigValue;
  }

  public static debug_name_how_t swigToEnum(int swigValue) {
    debug_name_how_t[] swigValues = debug_name_how_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (debug_name_how_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + debug_name_how_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private debug_name_how_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private debug_name_how_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private debug_name_how_t(debug_name_how_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

