/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class insn_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public insn_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(insn_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_insn_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCs(long value) {
    IdaJavaJNI.insn_t_cs_set(swigCPtr, this, value);
  }

  public long getCs() {
    return IdaJavaJNI.insn_t_cs_get(swigCPtr, this);
  }

  public void setIp(long value) {
    IdaJavaJNI.insn_t_ip_set(swigCPtr, this, value);
  }

  public long getIp() {
    return IdaJavaJNI.insn_t_ip_get(swigCPtr, this);
  }

  public void setEa(long value) {
    IdaJavaJNI.insn_t_ea_set(swigCPtr, this, value);
  }

  public long getEa() {
    return IdaJavaJNI.insn_t_ea_get(swigCPtr, this);
  }

  public void setItype(int value) {
    IdaJavaJNI.insn_t_itype_set(swigCPtr, this, value);
  }

  public int getItype() {
    return IdaJavaJNI.insn_t_itype_get(swigCPtr, this);
  }

  public boolean is_canon_insn() {
    return IdaJavaJNI.insn_t_is_canon_insn(swigCPtr, this);
  }

  public long get_canon_feature() {
    return IdaJavaJNI.insn_t_get_canon_feature(swigCPtr, this);
  }

  public String get_canon_mnem() {
    return IdaJavaJNI.insn_t_get_canon_mnem(swigCPtr, this);
  }

  public void setSize(int value) {
    IdaJavaJNI.insn_t_size_set(swigCPtr, this, value);
  }

  public int getSize() {
    return IdaJavaJNI.insn_t_size_get(swigCPtr, this);
  }

  public void setAuxpref(int value) {
    IdaJavaJNI.insn_t_auxpref_set(swigCPtr, this, value);
  }

  public int getAuxpref() {
    return IdaJavaJNI.insn_t_auxpref_get(swigCPtr, this);
  }

  public void setSegpref(char value) {
    IdaJavaJNI.insn_t_segpref_set(swigCPtr, this, value);
  }

  public char getSegpref() {
    return IdaJavaJNI.insn_t_segpref_get(swigCPtr, this);
  }

  public void setInsnpref(char value) {
    IdaJavaJNI.insn_t_insnpref_set(swigCPtr, this, value);
  }

  public char getInsnpref() {
    return IdaJavaJNI.insn_t_insnpref_get(swigCPtr, this);
  }

  public void setOperands(op_t value) {
    IdaJavaJNI.insn_t_Operands_set(swigCPtr, this, op_t.getCPtr(value), value);
  }

  public op_t getOperands() {
    long cPtr = IdaJavaJNI.insn_t_Operands_get(swigCPtr, this);
    return (cPtr == 0) ? null : new op_t(cPtr, false);
  }

  public void setFlags(char value) {
    IdaJavaJNI.insn_t_flags_set(swigCPtr, this, value);
  }

  public char getFlags() {
    return IdaJavaJNI.insn_t_flags_get(swigCPtr, this);
  }

  public boolean is_macro() {
    return IdaJavaJNI.insn_t_is_macro(swigCPtr, this);
  }

  public op_t getOperand(int index) {
    long cPtr = IdaJavaJNI.insn_t_getOperand(swigCPtr, this, index);
    return (cPtr == 0) ? null : new op_t(cPtr, false);
  }

  public boolean setOperand(int index, op_t op) {
    return IdaJavaJNI.insn_t_setOperand(swigCPtr, this, index, op_t.getCPtr(op), op);
  }

}
