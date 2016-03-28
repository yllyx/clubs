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

import com.yllyx.clubs.service.user.IUserService;

@Path("UserService")
public class UserService implements IUserService
{

    @Override
    @GET
    @Path("getByUserId")
    @Produces(MediaType.APPLICATION_JSON)
    public int getByUserId(String userId)
    {
        // TODO Auto-generated method stub
        return 0;
    }

}
