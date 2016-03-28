/*
 * 文件名：IUserDao.java
 * 版权：Copyright by http://nercel.ccnu.edu.cn/
 * 描述：
 * 修改人：longyunxiang
 * 修改时间：2016年3月28日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yllyx.clubs.dao.user;

import com.yllyx.clubs.dao.IBasicDao;
import com.yllyx.clubs.entity.User;

public interface IUserDao extends IBasicDao<User, String>
{

    boolean invalidByNamePasswd(String name, String passwd);

}
