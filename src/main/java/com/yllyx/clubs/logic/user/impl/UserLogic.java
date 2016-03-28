/*
 * 文件名：UserLogic.java
 * 版权：Copyright by http://nercel.ccnu.edu.cn/
 * 描述：
 * 修改人：longyunxiang
 * 修改时间：2016年3月28日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yllyx.clubs.logic.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yllyx.clubs.dao.user.IUserDao;
import com.yllyx.clubs.logic.user.IUserLogic;

@Component
public class UserLogic implements IUserLogic
{

    @Autowired
    IUserDao userDao;

    @Override
    public boolean invalidByNamePasswd(String name, String passwd)
    {

        return userDao.invalidByNamePasswd(name, passwd);
    }

}
