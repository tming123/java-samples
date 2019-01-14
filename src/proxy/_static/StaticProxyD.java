package proxy._static;

import org.junit.Test;

/**
 * 代理类在程序运行前已经存在的代理方式称为静态代理。
 */
public class StaticProxyD {

    @Test
    public void test() {
        ClassB classB = new ClassB(new ClassA());
        classB.operateMethod1();
    }
}
