package com.zjm.spring.security.oauth2.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjm.spring.security.oauth2.server.entity.TbPermission;
import com.zjm.spring.security.oauth2.server.mapper.TbPermissionMapper;
import com.zjm.spring.security.oauth2.server.service.ITbPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
@Service
public class TbPermissionServiceImpl extends ServiceImpl<TbPermissionMapper, TbPermission> implements ITbPermissionService {
    public List<TbPermission> getByUserId(Long id){
        return getBaseMapper().getByUserId(id);
    }
}
