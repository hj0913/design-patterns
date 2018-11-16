package com.huangjie.factory.service;

import com.huangjie.factory.service.impl.Circle;
import com.huangjie.factory.service.impl.Rectangle;
import com.huangjie.factory.service.impl.Square;

/**
 * @author: huangjie
 * @Date: 2018/11/16 0016 13:11
 */
public class ShapeFactory {

    /**
     * @param shapeType
     * @return Shape
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }


        return null;
    }
}
