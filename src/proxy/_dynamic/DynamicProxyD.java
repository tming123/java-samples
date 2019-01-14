package proxy._dynamic;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 实现动态代理包括三步：
 * (1). 新建委托类；
 * (2). 实现InvocationHandler接口，这是负责连接代理类和委托类的中间类必须实现的接口；
 * (3). 通过Proxy类新建代理类对象。
 */
public class DynamicProxyD {
    @Test
    public void test() {
        // create proxy instance
        TimingInvocationHandler timingInvocationHandler = new TimingInvocationHandler(new OperateImpl());
        Operate operate = (Operate) (Proxy.newProxyInstance(Operate.class.getClassLoader(), new Class[]{Operate.class},
                timingInvocationHandler));

        // call method of proxy instance
        operate.operateMethod1();
        operate.operateMethod2();
        operate.operateMethod3();
    }
}
