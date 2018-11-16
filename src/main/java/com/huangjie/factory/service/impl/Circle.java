package com.huangjie.factory.service.impl;

import com.huangjie.factory.service.Shape;

/**
 * @author huangjie
 * @date 2018/11/16 0016.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
