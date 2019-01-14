package proxy._static;

/**
 * 代理类
 */
public class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    public void operateMethod1() {
        classA.operateMethod1();
    }

    public void operateMethod2() {
        classA.operateMethod2();
    }

    // not export operateMethod3()
}
