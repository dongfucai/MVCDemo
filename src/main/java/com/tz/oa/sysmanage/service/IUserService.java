package com.tz.oa.sysmanage.service;

import com.tz.oa.sysmanage.entity.User;

public interface IUserService {
    public User loginUser(String loginName, String password);
    public int  insert(String loginName,String password);
    public int logintest(String loginName,String password);
    public int  selectbyname(String name);

}
