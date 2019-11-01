package com.zjm.spring.security.oauth2.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjm.spring.security.oauth2.server.entity.TbRolePermission;
import com.zjm.spring.security.oauth2.server.mapper.TbRolePermissionMapper;
import com.zjm.spring.security.oauth2.server.service.ITbRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色权限表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
@Service
public class TbRolePermissionServiceImpl extends ServiceImpl<TbRolePermissionMapper, TbRolePermission> implements ITbRolePermissionService {

}
