package com.tz.oa.sysmanage.service.Impl;

import com.tz.oa.sysmanage.entity.User;
import com.tz.oa.sysmanage.entity.UserExample;
import com.tz.oa.sysmanage.mapper.UserMapper;
import com.tz.oa.sysmanage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User loginUser(String loginName, String password){

        UserExample userExample=new UserExample();

        UserExample.Criteria criteria1=userExample.createCriteria();


        criteria1.andNameEqualTo(loginName);
        criteria1.andPasswordEqualTo(password);

        //        criteria1.andUsernameLike("%" + loginName + "%");
//        criteria1.andUsernameEqualTo("张三");
//        criteria1.andPasswordEqualTo("123");
        List<User> userList=userMapper.selectByExample(userExample);

        if (userList.isEmpty()) {
            return null;
        }else{
            if (userList.get(0).getPassword().equals(password)){
                return userList.get(0);
            }else{
                return null;

            }
        }

    }
    @Override
    public int  insert(String loginName,String password){

        User u1= new User();
        u1.setName(loginName);
        u1.setPassword(password);

        return userMapper.insert(u1);
    }

    public int logintest(String loginName,String password){
        User u1= new User();
        u1.setName(loginName);
        u1.setPassword(password);

        return userMapper.selectbynamepassword(u1);
    }

    public int  selectbyname(String name){
        User u1= new User();
        u1.setName(name);
        return userMapper.selectbyname(u1);
    }

}
