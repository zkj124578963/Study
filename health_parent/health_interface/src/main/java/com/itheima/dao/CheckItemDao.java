package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;

import java.util.List;

public interface CheckItemDao {
    /**
     * 持久化Dao层
     *
     * @param checkItem
     */

    public void add(CheckItem checkItem);

    public Page<CheckItem> selectByCondition(String queryString);

    public long countByid(int id);

    public void edit(CheckItem checkItem);

    public void deleteById(int id);

    public CheckItem findById(int id);

    public List<CheckItem> findAll();
}
