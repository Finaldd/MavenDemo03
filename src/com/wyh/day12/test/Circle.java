package com.wyh.day12.test;

/*
 一个成员变量，radius（私有，浮点型）;//存放圆的半径；
两个构造方法
Circle（）              //将半径设为0
Circle（double  r ）    //创建Circle对象时将半径初始化为r
三个成员方法
double getArea（）      //获取圆的面积
double getPerimeter（）  //获取圆的周长
void show（）           //将圆的半径、周长、面积输出到屏幕

 */
public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //求圆的面积
    public double getArea() {
        return 3.14 * radius * radius;
    }

    //求圆的周长
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public void show() {
        System.out.printf("半径为：" + radius + "，周长为：" + getPerimeter() + ",面积为：" + getArea());
    }
}
