/*
 * 文件名：GenericDao.java
 * 版权：Copyright by http://nercel.ccnu.edu.cn/
 * 描述：
 * 修改人：longyunxiang
 * 修改时间：2016年1月5日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yllyx.clubs.dao;

import java.util.List;

public interface IBasicDao<T, PK>
{
    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);
    PK merge(T entity);
    void saveOrUpdate(T entity);

    void delete(T entity);

    void flush();
}
