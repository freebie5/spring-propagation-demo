package org.sy.springpropagationdemo.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.sy.springpropagationdemo.entity.Test1;
import org.sy.springpropagationdemo.entity.Test2;
import org.sy.springpropagationdemo.mapper.Test1Mapper;

@Service
public class OutService {

    @Autowired
    private Test1Service test1Service;

    @Autowired
    private Test2Service test2Service;

    @Autowired
    private Test1Mapper test1Mapper;

    //外围开启事务
    @Transactional(propagation = Propagation.REQUIRED)
    public void transactionalTestA() {
        Test1 test1 = new Test1(1,"张三");
        Test2 test2 = new Test2(1,"李四");

        test1Service.addRequired(test1);
        test2Service.addRequired(test2);

        throw new RuntimeException();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void transactionalTestB() {
        Test1 test1 = new Test1(1,"张三");
        Test2 test2 = new Test2(1,"李四");

        test1Service.addRequired(test1);
//        test1Mapper.insert(test1);
        test2Service.addRequiredException(test2);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void transactionalTestC() {
        Test1 test1 = new Test1(1,"张三");
        Test2 test2 = new Test2(1,"李四");

        test1Service.addRequired(test1);
        try{
            test2Service.addRequiredException(test2);
        } catch (Exception e) {
            System.out.println("插入异常");
        }
    }

//====================================================================

    //外围没有开启事务
    public void noTransactionalTestA() {
        Test1 test1 = new Test1(1,"张三");
        Test2 test2 = new Test2(1,"李四");

        test1Service.addRequired(test1);
        test2Service.addRequired(test2);

        throw new RuntimeException();
    }
    public void noTransactionalTestB() {
        Test1 test1 = new Test1(1,"张三");
        Test2 test2 = new Test2(1,"李四");

        test1Service.addRequired(test1);
        test2Service.addRequiredException(test2);
    }

}
