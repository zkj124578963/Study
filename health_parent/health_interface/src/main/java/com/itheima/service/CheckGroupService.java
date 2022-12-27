package com.itheima.service;

import com.itheima.entity.Result;
import com.itheima.pojo.CheckGroup;

public interface CheckGroupService {
    public Result add(CheckGroup checkGroup, Integer[] checkitemIds);
}
