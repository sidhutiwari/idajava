/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class rect_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public rect_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(rect_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_rect_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLeft(int value) {
    IdaJavaJNI.rect_t_left_set(swigCPtr, this, value);
  }

  public int getLeft() {
    return IdaJavaJNI.rect_t_left_get(swigCPtr, this);
  }

  public void setTop(int value) {
    IdaJavaJNI.rect_t_top_set(swigCPtr, this, value);
  }

  public int getTop() {
    return IdaJavaJNI.rect_t_top_get(swigCPtr, this);
  }

  public void setRight(int value) {
    IdaJavaJNI.rect_t_right_set(swigCPtr, this, value);
  }

  public int getRight() {
    return IdaJavaJNI.rect_t_right_get(swigCPtr, this);
  }

  public void setBottom(int value) {
    IdaJavaJNI.rect_t_bottom_set(swigCPtr, this, value);
  }

  public int getBottom() {
    return IdaJavaJNI.rect_t_bottom_get(swigCPtr, this);
  }

  public rect_t() {
    this(IdaJavaJNI.new_rect_t__SWIG_0(), true);
  }

  public rect_t(int l, int t, int r, int b) {
    this(IdaJavaJNI.new_rect_t__SWIG_1(l, t, r, b), true);
  }

  public rect_t(point_t p0, point_t p1) {
    this(IdaJavaJNI.new_rect_t__SWIG_2(point_t.getCPtr(p0), p0, point_t.getCPtr(p1), p1), true);
  }

  public int width() {
    return IdaJavaJNI.rect_t_width(swigCPtr, this);
  }

  public int height() {
    return IdaJavaJNI.rect_t_height(swigCPtr, this);
  }

  public void move_to(point_t p) {
    IdaJavaJNI.rect_t_move_to(swigCPtr, this, point_t.getCPtr(p), p);
  }

  public void move_by(point_t p) {
    IdaJavaJNI.rect_t_move_by(swigCPtr, this, point_t.getCPtr(p), p);
  }

  public point_t center() {
    return new point_t(IdaJavaJNI.rect_t_center(swigCPtr, this), true);
  }

  public point_t topleft() {
    return new point_t(IdaJavaJNI.rect_t_topleft(swigCPtr, this), true);
  }

  public point_t bottomright() {
    return new point_t(IdaJavaJNI.rect_t_bottomright(swigCPtr, this), true);
  }

  public void grow(int delta) {
    IdaJavaJNI.rect_t_grow(swigCPtr, this, delta);
  }

  public void intersect(rect_t r) {
    IdaJavaJNI.rect_t_intersect(swigCPtr, this, rect_t.getCPtr(r), r);
  }

  public void make_union(rect_t r) {
    IdaJavaJNI.rect_t_make_union(swigCPtr, this, rect_t.getCPtr(r), r);
  }

  public boolean empty() {
    return IdaJavaJNI.rect_t_empty(swigCPtr, this);
  }

  public boolean is_intersection_empty(rect_t r) {
    return IdaJavaJNI.rect_t_is_intersection_empty(swigCPtr, this, rect_t.getCPtr(r), r);
  }

  public boolean contains(point_t p) {
    return IdaJavaJNI.rect_t_contains(swigCPtr, this, point_t.getCPtr(p), p);
  }

  public int area() {
    return IdaJavaJNI.rect_t_area(swigCPtr, this);
  }

  public boolean __eq__(rect_t r) {
    return IdaJavaJNI.rect_t___eq__(swigCPtr, this, rect_t.getCPtr(r), r);
  }

  public boolean __ne__(rect_t r) {
    return IdaJavaJNI.rect_t___ne__(swigCPtr, this, rect_t.getCPtr(r), r);
  }

}
