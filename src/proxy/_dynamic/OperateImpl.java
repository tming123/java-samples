package proxy._dynamic;

/**
 * OperateImpl是委托类，动态代理要求委托类必须实现某个接口，比如这里委托类OperateImpl实现了Operate
 */
public class OperateImpl implements Operate {
    @Override
    public void operateMethod1() {
        System.out.println("OperateImpl operateMethod1");
    }

    @Override
    public void operateMethod2() {
        System.out.println("OperateImpl operateMethod2");
    }

    @Override
    public void operateMethod3() {
        System.out.println("OperateImpl operateMethod3");
    }
}
