package com.zjm.spring.security.oauth2.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjm.spring.security.oauth2.server.entity.TbUserRole;
import com.zjm.spring.security.oauth2.server.mapper.TbUserRoleMapper;
import com.zjm.spring.security.oauth2.server.service.ITbUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
@Service
public class TbUserRoleServiceImpl extends ServiceImpl<TbUserRoleMapper, TbUserRole> implements ITbUserRoleService {

}
