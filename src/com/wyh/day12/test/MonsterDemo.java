package com.wyh.day12.test;

/*
蛇怪类:
属性包括：怪物名字，生命值，攻击力
方法包括：攻击，移动（曲线移动），补血（当生命值<10时，可以补加20生命值）
蜈蚣精类：
属性包括：怪物名字，生命值，攻击力
方法包括：攻击，移动（飞行移动）
要求
分析蛇怪和蜈蚣精的公共成员，提取出父类—怪物类
利用继承机制，实现蛇怪类和蜈蚣精类
攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
编写测试类，分别测试蛇怪和蜈蚣精的对象及相关方法
定义名为mon的包存怪物类，蛇怪类，蜈蚣精类和测试类

 */
abstract class Monster {
    private String name;
    private int hp;
    private int attack;

    public Monster() {
    }

    public Monster(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void startAttack() {
        System.out.println(name + "展开攻击");
    }

    public abstract void move();
}

class Snack extends Monster {

    @Override
    public void move() {
        System.out.println("我是蛇怪，我走S型路线");
    }

    //补血（当生命值<10时，可以补加20生命值）
    public void addHp() {
        System.out.println("实施大蛇补血术。。。。。，当前生命值是：" + getHp());
    }
}


public class MonsterDemo {
}
