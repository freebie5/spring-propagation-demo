package org.sy.springpropagationdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.sy.springpropagationdemo.entity.Test1;
import org.sy.springpropagationdemo.mapper.Test1Mapper;

@Service
public class Test1Service {

    @Autowired
    private Test1Mapper test1Mapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(Test1 test1) {
        test1Mapper.insert(test1);
    }

}
