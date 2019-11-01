package com.zjm.spring.security.oauth2.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjm.spring.security.oauth2.server.entity.TbRole;
import com.zjm.spring.security.oauth2.server.mapper.TbRoleMapper;
import com.zjm.spring.security.oauth2.server.service.ITbRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
@Service
public class TbRoleServiceImpl extends ServiceImpl<TbRoleMapper, TbRole> implements ITbRoleService {

}
