/*
 * 文件名：UserController.java
 * 版权：Copyright by http://nercel.ccnu.edu.cn/
 * 描述：
 * 修改人：longyunxiang
 * 修改时间：2016年3月28日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yllyx.clubs.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yllyx.clubs.service.user.IUserService;

@Controller
@RequestMapping("user")
public class UserController
{
    @Autowired
    IUserService userService;

    @RequestMapping("invalidByNamePasswd")
    @ResponseBody
    public boolean invalidByNamePasswd(String name, String passwd)
    {
        return userService.invalidByNamePasswd(name, passwd);
    }
}
