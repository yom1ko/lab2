package com.company;

public class Point3d extends Point2d  {
    private double zCoord;
    public Point3d (double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    public Point3d () {
        //Вызовите конструктор с тремя параметрами и определите источник.
        this(0, 0,0);
    }
    public double getZ () {
        return zCoord;
    }
    public void setZ (double val) {
        zCoord = val;
    } // Установка значения координаты z.
    public boolean equals3d (Point3d secondObj) {  // Сравнение объектов
        boolean equals3d = false;
        if ((this.getX() == secondObj.getX()) && (this.getY() == secondObj.getY()) && (this.getZ() == secondObj.getZ()))
            equals3d = true;
        return equals3d;
    }
    public double distanceTo (Point3d secondObj) {
        double distance = Math.sqrt(Math.pow(secondObj.getX() - this.getX(), 2) + Math.pow(secondObj.getY() - this.getY(), 2) + Math.pow(secondObj.getZ() - this.getZ(), 2));
        return distance;
    }
}
