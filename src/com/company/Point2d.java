package com.company;

import javax.management.ObjectName;

public class Point2d {
    protected double xCoord;
    protected double yCoord;
    public Point2d (double x, double y) { //Конструктор инциализации
        xCoord = x;
        yCoord = y;
    }
    public Point2d () {
        this(0, 0); //Конструктор с двумя параметрами
    }
    public double getX () {

        return xCoord; // Возвращение координаты x
    }
    public double getY () {

        return yCoord; // Возвращение координаты y
    }
    public void setX (double val) {    // сУстановка значения координаты x.

        xCoord = val;
    }
    public void setY (double val) {    // Установка значения координаты y.

        yCoord = val;
    }
    public boolean equals2d(Point2d secondObj) {     // Сравнение двух двумерных объектов
        boolean equals2d = false;
        if ((this.getX() == secondObj.getX()) && (this.getY() == secondObj.getY()))
            equals2d = true;
        return equals2d;
    }
}
