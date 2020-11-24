package org.sy.springpropagationdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sy.springpropagationdemo.entity.Test2;

@Mapper
public interface Test2Mapper {

    Test2 selectById(String id);

    int insert(Test2 bean);

}
