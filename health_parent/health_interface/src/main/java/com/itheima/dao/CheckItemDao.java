package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;

public interface CheckItemDao {
    /**
     * 持久化Dao层
     *
     * @param checkItem
     */

    public void add(CheckItem checkItem);

    public Page<CheckItem> selectByCondition(String queryString);

    public long countByid(int id);

    public void deleteById(int id);
}
