/*
 * 文件名：IUser.java
 * 版权：Copyright by http://nercel.ccnu.edu.cn/
 * 描述：
 * 修改人：longyunxiang
 * 修改时间：2016年3月27日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yllyx.clubs.service.user;

import com.yllyx.clubs.entity.User;

public interface IUserService
{
    int getByUserId(String userId);

    boolean addUser(User user);

    boolean invalidByName(String name);

    boolean invalidByNamePasswd(String name, String passwd);

    boolean invalidByEmail(String email);

    boolean invalidByEmailPasswd(String email, String passwd);

    boolean invalidByTelphone(String telphone);

    boolean invalidByTelphonePasswd(String telphone, String passwd);
}
