package com.powernode.exception;

public class Circle {
    private double radius; // 半径
    private double dia; // 直径
    private static final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public Circle(double radius, double dia) throws RadiusException {
        // 判断参数的合法性
        if( radius <= 0 ) {
            throw new RadiusException("半径不能小于0");
        }

        if( dia <= 0 && dia != radius * 2 ) {
            throw new DiaException("直径不能为0");
        }
        this.radius = radius;
        this.dia = dia;
    }

    public Circle() {
    }
}
