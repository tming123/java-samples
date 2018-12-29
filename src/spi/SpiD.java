package spi;

import org.junit.Test;

public class SpiD {

    @Test
    public void test() throws ClassNotFoundException {
        Class.forName("spi.MyMsg");
        Class.forName("spi.YourMsg");
        IMsg my = new MsgManage().getMsgConnection("my");
        IMsg your = new MsgManage().getMsgConnection("your");
        my.send("你好，世界");
        your.send("你好，世界");
    }
}
