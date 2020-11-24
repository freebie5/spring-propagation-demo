package org.sy.springpropagationdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.sy.springpropagationdemo.entity.Test2;
import org.sy.springpropagationdemo.mapper.Test2Mapper;

@Service
public class Test2Service {

    @Autowired
    private Test2Mapper test2Mapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(Test2 test2) {
        test2Mapper.insert(test2);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequiredException(Test2 test2) {
        test2Mapper.insert(test2);
        throw new RuntimeException();
    }

}
