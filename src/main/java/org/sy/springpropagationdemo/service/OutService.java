package org.sy.springpropagationdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sy.springpropagationdemo.entity.Test1;
import org.sy.springpropagationdemo.entity.Test2;

@Service
public class OutService {

    @Autowired
    private Test1Service test1Service;

    @Autowired
    private Test2Service test2Service;

    @Transactional
    public void transactionalTest() {
        Test1 test1 = new Test1(1,"t1");
        Test2 test2 = new Test2(1,"t2");

        test1Service.addRequired(test1);
        test2Service.addRequiredException(test2);
    }

    public void noTransactionalTest() {
        Test1 test1 = new Test1(1,"t1");
        Test2 test2 = new Test2(1,"t2");

        test1Service.addRequired(test1);
        test2Service.addRequiredException(test2);
    }

}
