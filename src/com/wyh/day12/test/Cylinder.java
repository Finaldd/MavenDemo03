package com.wyh.day12.test;

/*
编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
一个成员变量，double hight  （私有，浮点型）;  //圆柱体的高；
构造方法
//创建Cylinder对象时将半径初始化为r,高度初始化为h
Cylinder（double r,double h）
成员方法
double getVolume（）            //获取圆柱体的体积
void showVolume（）             //将圆柱体的体积输出到屏幕

 */
public class Cylinder extends Circle {
    private double hight;

    public Cylinder(double radius, double hight) {
        super(radius);
        this.hight = hight;
    }

    //获取圆柱体的体积
    public double getVolume() {
        return getArea() * hight;
    }

    //将圆柱体的体积输出到屏幕
    public void showVolume() {
        System.out.println("圆柱体的体积为：" + getVolume());
    }
}

class Demo{
    public static void main(String[] args) {
        //创建一个圆柱体对象
        Cylinder cylinder = new Cylinder(10.0, 10.0);
        cylinder.showVolume();
        cylinder.show();
    }
}
