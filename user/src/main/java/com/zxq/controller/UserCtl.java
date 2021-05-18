package com.zxq.controller;

import com.zxq.entity.User;
import com.zxq.utils.shiro.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zxq
 * @DESCRIPTION
 * @create 2021/5/13
 */
@RestController
public class UserCtl {

    @RequiresPermissions("user:add")
    @RequiresRoles({"000"})
    @RequestMapping("/user")
    public ModelAndView detail(){
        User user = ShiroUtils.getUser();
        ModelAndView mv = new ModelAndView("/user");
        mv.addObject("user", user);
        return mv;
    }
}
