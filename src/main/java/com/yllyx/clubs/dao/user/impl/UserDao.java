/*
 * 文件名：UserDao.java
 * 版权：Copyright by http://nercel.ccnu.edu.cn/
 * 描述：
 * 修改人：longyunxiang
 * 修改时间：2016年3月28日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yllyx.clubs.dao.user.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yllyx.clubs.dao.BasicDao;
import com.yllyx.clubs.dao.user.IUserDao;
import com.yllyx.clubs.entity.User;

@Repository
public class UserDao extends BasicDao<User, String> implements IUserDao
{

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 获取当前线程的session
     * 
     * @return
     */
    private Session getCurrentSession()
    {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public boolean invalidByNamePasswd(String name, String passwd)
    {
        boolean ret = true;
        String sql = "from User u where u.name = :name and u.passwd = :passwd";
        Query query = this.getCurrentSession().createQuery(sql);

        query.setParameter("name", name);
        query.setParameter("passwd", passwd);
        User user = (User)query.uniqueResult();
        if (user == null)
        {
            ret = false;
        }
        return ret;
    }

}
