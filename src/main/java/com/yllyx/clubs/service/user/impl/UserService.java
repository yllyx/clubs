/*
 * 文件名：UserService.java
 * 版权：Copyright by http://nercel.ccnu.edu.cn/
 * 描述：
 * 修改人：longyunxiang
 * 修改时间：2016年3月27日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yllyx.clubs.service.user.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yllyx.clubs.entity.User;
import com.yllyx.clubs.logic.user.IUserLogic;
import com.yllyx.clubs.service.user.IUserService;

@Path("UserService")
@Service
public class UserService implements IUserService
{

    @Autowired
    IUserLogic userLogic;

    @Override
    @GET
    @Path("getByUserId")
    @Produces(MediaType.APPLICATION_JSON)
    public int getByUserId(String userId)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean addUser(User user)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean invalidByName(String name)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean invalidByNamePasswd(String name, String passwd)
    {
        return userLogic.invalidByNamePasswd(name, passwd);
    }

    @Override
    public boolean invalidByEmail(String email)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean invalidByEmailPasswd(String email, String passwd)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean invalidByTelphone(String telphone)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean invalidByTelphonePasswd(String telphone, String passwd)
    {
        // TODO Auto-generated method stub
        return false;
    }

}
