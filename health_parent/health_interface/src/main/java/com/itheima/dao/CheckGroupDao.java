package com.itheima.dao;

import com.itheima.pojo.CheckGroup;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface CheckGroupDao {
    public void add(@RequestBody CheckGroup checkGroup);

    public void setCheckGroupAndCheckItem(Map<String, Integer> map);
}
