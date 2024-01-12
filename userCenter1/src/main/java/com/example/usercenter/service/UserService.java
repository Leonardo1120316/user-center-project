package com.example.usercenter.service;

import com.example.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author DELL
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-01-10 14:19:22
*/
public interface UserService extends IService<User> {
    /**\
     *
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
   long userRegister(String userAccount,String userPassword,String checkPassword);

    /**
     *
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
   User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafeUser(User user);
}
