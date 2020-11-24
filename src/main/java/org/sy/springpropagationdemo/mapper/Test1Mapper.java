package org.sy.springpropagationdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sy.springpropagationdemo.entity.Test1;

@Mapper
public interface Test1Mapper {

    Test1 selectById(String id);

    int insert(Test1 bean);

}
