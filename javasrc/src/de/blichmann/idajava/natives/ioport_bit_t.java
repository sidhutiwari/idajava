/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class ioport_bit_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ioport_bit_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ioport_bit_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_ioport_bit_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    IdaJavaJNI.ioport_bit_t_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return IdaJavaJNI.ioport_bit_t_name_get(swigCPtr, this);
  }

  public void setCmt(String value) {
    IdaJavaJNI.ioport_bit_t_cmt_set(swigCPtr, this, value);
  }

  public String getCmt() {
    return IdaJavaJNI.ioport_bit_t_cmt_get(swigCPtr, this);
  }

  public ioport_bit_t() {
    this(IdaJavaJNI.new_ioport_bit_t(), true);
  }

}
