package com.zxq.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zxq.entity.Module;
import com.zxq.entity.User;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author 孙志强
 * @since 2020-04-13
 */
public interface UserService extends IService<User> {
    User queryByUserName(String username);

    List<String> getRoleCodeList(Long userId);
    List<String> queryAllPerms(Long userId);

    List<Module> findMenuListByUserId(Long userId);
}
