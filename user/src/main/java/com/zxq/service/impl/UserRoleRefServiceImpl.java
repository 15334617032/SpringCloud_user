package com.zxq.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxq.dao.UserRoleRefMapper;
import com.zxq.entity.UserRoleRef;
import com.zxq.service.UserRoleRefService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author 孙志强
 * @since 2020-04-13
 */
@Service
public class UserRoleRefServiceImpl extends ServiceImpl<UserRoleRefMapper, UserRoleRef> implements UserRoleRefService {

}
