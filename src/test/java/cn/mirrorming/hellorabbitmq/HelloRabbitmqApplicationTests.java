package cn.mirrorming.hellorabbitmq;

import cn.mirrorming.hellorabbitmq.provider.RabbitProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloRabbitmqApplication.class)
public class HelloRabbitmqApplicationTests {

    @Autowired
    private RabbitProvider rabbitProvider;

    @Test
    public void contextLoads() {        for (int i = 0; i < 50; i++) {
            rabbitProvider.send();
        }
    }

}
