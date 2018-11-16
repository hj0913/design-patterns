package com.huangjie.factory.service.impl;

import com.huangjie.factory.service.Shape;

/**
 * Created by huangjie on 2018/11/16 0016.
 * @author huangjie
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
