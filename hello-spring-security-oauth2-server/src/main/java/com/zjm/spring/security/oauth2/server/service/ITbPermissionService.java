package com.zjm.spring.security.oauth2.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjm.spring.security.oauth2.server.entity.TbPermission;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
public interface ITbPermissionService extends IService<TbPermission> {
    public List<TbPermission> getByUserId(Long id);
}
