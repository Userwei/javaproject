package com.company.demo01.demo5.demo01;

/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的抽象方法。

如何定义一个接口的格式：
public interface 接口名称{
    //  接口内容
}

备注：换成了关键字interface之后，编译生成的字码文件仍然是：.java-->.class。

接口包含的内容有：
1.常量
2.抽象方法
3.默认方法
4.静态方法
5.私有方法

接口使用步骤：
1.接口不能直接使用，必须有一个“实现类”来“实现”该接口。
格式：
public class 实现类名称 implements 接口名称{
    //  ...
}
2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
实现：去掉abstract关键字，加上方法体大括号。
3.创建实现类的对象，进行使用。

注意事项：
如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。

* */
public class Demo01Interface {

    public static void main(String[] args) {
        //错误写法！
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();

        //  创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();

    }
}
