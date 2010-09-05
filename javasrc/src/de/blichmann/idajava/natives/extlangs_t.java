/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class extlangs_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public extlangs_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(extlangs_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_extlangs_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public extlangs_t() {
    this(IdaJavaJNI.new_extlangs_t__SWIG_0(), true);
  }

  public extlangs_t(extlangs_t x) {
    this(IdaJavaJNI.new_extlangs_t__SWIG_1(extlangs_t.getCPtr(x), x), true);
  }

  public void push_back(extlang_t x) {
    IdaJavaJNI.extlangs_t_push_back__SWIG_0(swigCPtr, this, extlang_t.getCPtr(x), x);
  }

  public SWIGTYPE_p_p_extlang_t push_back() {
    return new SWIGTYPE_p_p_extlang_t(IdaJavaJNI.extlangs_t_push_back__SWIG_1(swigCPtr, this), false);
  }

  public void pop_back() {
    IdaJavaJNI.extlangs_t_pop_back(swigCPtr, this);
  }

  public long size() {
    return IdaJavaJNI.extlangs_t_size(swigCPtr, this);
  }

  public boolean empty() {
    return IdaJavaJNI.extlangs_t_empty(swigCPtr, this);
  }

  public extlang_t __aref__(long idx) {
    long cPtr = IdaJavaJNI.extlangs_t___aref____SWIG_0(swigCPtr, this, idx);
    return (cPtr == 0) ? null : new extlang_t(cPtr, false);
  }

  public extlang_t at(long idx) {
    long cPtr = IdaJavaJNI.extlangs_t_at__SWIG_0(swigCPtr, this, idx);
    return (cPtr == 0) ? null : new extlang_t(cPtr, false);
  }

  public extlang_t front() {
    long cPtr = IdaJavaJNI.extlangs_t_front__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new extlang_t(cPtr, false);
  }

  public extlang_t back() {
    long cPtr = IdaJavaJNI.extlangs_t_back__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new extlang_t(cPtr, false);
  }

  public void qclear() {
    IdaJavaJNI.extlangs_t_qclear(swigCPtr, this);
  }

  public void clear() {
    IdaJavaJNI.extlangs_t_clear(swigCPtr, this);
  }

  public extlangs_t __assign__(extlangs_t x) {
    return new extlangs_t(IdaJavaJNI.extlangs_t___assign__(swigCPtr, this, extlangs_t.getCPtr(x), x), false);
  }

  public void resize(long s, extlang_t x) {
    IdaJavaJNI.extlangs_t_resize__SWIG_0(swigCPtr, this, s, extlang_t.getCPtr(x), x);
  }

  public void resize(long s) {
    IdaJavaJNI.extlangs_t_resize__SWIG_1(swigCPtr, this, s);
  }

  public void grow(extlang_t x) {
    IdaJavaJNI.extlangs_t_grow__SWIG_0(swigCPtr, this, extlang_t.getCPtr(x), x);
  }

  public void grow() {
    IdaJavaJNI.extlangs_t_grow__SWIG_1(swigCPtr, this);
  }

  public long capacity() {
    return IdaJavaJNI.extlangs_t_capacity(swigCPtr, this);
  }

  public void reserve(long cnt) {
    IdaJavaJNI.extlangs_t_reserve(swigCPtr, this, cnt);
  }

  public void move(SWIGTYPE_p_p_extlang_t dst, SWIGTYPE_p_p_extlang_t src, long cnt) {
    IdaJavaJNI.extlangs_t_move(swigCPtr, this, SWIGTYPE_p_p_extlang_t.getCPtr(dst), SWIGTYPE_p_p_extlang_t.getCPtr(src), cnt);
  }

  public void truncate() {
    IdaJavaJNI.extlangs_t_truncate(swigCPtr, this);
  }

  public void swap(extlangs_t r) {
    IdaJavaJNI.extlangs_t_swap(swigCPtr, this, extlangs_t.getCPtr(r), r);
  }

  public SWIGTYPE_p_p_extlang_t extract() {
    long cPtr = IdaJavaJNI.extlangs_t_extract(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_extlang_t(cPtr, false);
  }

  public void inject(SWIGTYPE_p_p_extlang_t s, long len) {
    IdaJavaJNI.extlangs_t_inject(swigCPtr, this, SWIGTYPE_p_p_extlang_t.getCPtr(s), len);
  }

  public boolean __eq__(extlangs_t r) {
    return IdaJavaJNI.extlangs_t___eq__(swigCPtr, this, extlangs_t.getCPtr(r), r);
  }

  public boolean __ne__(extlangs_t r) {
    return IdaJavaJNI.extlangs_t___ne__(swigCPtr, this, extlangs_t.getCPtr(r), r);
  }

  public SWIGTYPE_p_p_extlang_t begin() {
    long cPtr = IdaJavaJNI.extlangs_t_begin__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_extlang_t(cPtr, false);
  }

  public SWIGTYPE_p_p_extlang_t end() {
    long cPtr = IdaJavaJNI.extlangs_t_end__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_extlang_t(cPtr, false);
  }

  public SWIGTYPE_p_p_extlang_t insert(SWIGTYPE_p_p_extlang_t it, extlang_t x) {
    long cPtr = IdaJavaJNI.extlangs_t_insert(swigCPtr, this, SWIGTYPE_p_p_extlang_t.getCPtr(it), extlang_t.getCPtr(x), x);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_extlang_t(cPtr, false);
  }

  public SWIGTYPE_p_p_extlang_t erase(SWIGTYPE_p_p_extlang_t it) {
    long cPtr = IdaJavaJNI.extlangs_t_erase__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_extlang_t.getCPtr(it));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_extlang_t(cPtr, false);
  }

  public SWIGTYPE_p_p_extlang_t erase(SWIGTYPE_p_p_extlang_t first, SWIGTYPE_p_p_extlang_t last) {
    long cPtr = IdaJavaJNI.extlangs_t_erase__SWIG_1(swigCPtr, this, SWIGTYPE_p_p_extlang_t.getCPtr(first), SWIGTYPE_p_p_extlang_t.getCPtr(last));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_extlang_t(cPtr, false);
  }

  public SWIGTYPE_p_p_extlang_t find(extlang_t x) {
    long cPtr = IdaJavaJNI.extlangs_t_find__SWIG_0(swigCPtr, this, extlang_t.getCPtr(x), x);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_extlang_t(cPtr, false);
  }

  public boolean has(extlang_t x) {
    return IdaJavaJNI.extlangs_t_has(swigCPtr, this, extlang_t.getCPtr(x), x);
  }

  public boolean add_unique(extlang_t x) {
    return IdaJavaJNI.extlangs_t_add_unique(swigCPtr, this, extlang_t.getCPtr(x), x);
  }

  public boolean del(extlang_t x) {
    return IdaJavaJNI.extlangs_t_del(swigCPtr, this, extlang_t.getCPtr(x), x);
  }

}
