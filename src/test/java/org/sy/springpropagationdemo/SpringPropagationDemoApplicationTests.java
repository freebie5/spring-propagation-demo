package org.sy.springpropagationdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.sy.springpropagationdemo.service.OutService;

@SpringBootTest
class SpringPropagationDemoApplicationTests {

    @Autowired
    private OutService outService;

    @Test
    public void test() {
//        outService.transactionalTestA();
        outService.transactionalTestB();
//        outService.transactionalTestC();
//        outService.noTransactionalTestA();
//        outService.noTransactionalTestB();
    }

}
