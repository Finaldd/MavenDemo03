package com.wyh.day12.test;


/*
    出租车类:
属性包括：车型，车牌，所属出租公司；方法包括：启动，停止
家用轿车类：
属性包括：车型，车牌，车主姓名；方法包括：启动，停止
要求
分析出租车和家用轿车的公共成员，提取出父类—汽车类
利用继承机制，实现出租车类和家用轿车类
编写测试类，分别测试汽车类，出租车类和家用轿车类对象的相关方法
定义名为car的包存放汽车类，出租车类，家用轿车类和测试类

 */

class Car{
    private String carType;
    private String carBrand;

    public Car(String carType, String carBrand) {
        this.carType = carType;
        this.carBrand = carBrand;
    }

    public Car() {
    }

    //getXxx()setXxx()

    //启动
    public void start(){
        System.out.println("车子启动");
    }

    //停止
    public void stop(){
        System.out.println("车子停止");
    }
}

class MaiBaHei extends Car{
    private String consName;

    public MaiBaHei(String carType, String carBrand,String consName) {
        super(carType, carBrand);
        this.consName = consName;
    }
}

class Taxi extends Car{
    private String company;

    public Taxi(String carType, String carBrand, String company) {
        super(carType, carBrand);
        this.company = company;
    }
}


public class CarTest {
    public static void main(String[] args) {
        //创建一个家用轿车
        MaiBaHei maiBaHei = new MaiBaHei("奔驰", "皖A8888", "小虎");
        maiBaHei.start();
        maiBaHei.stop();
    }
}
