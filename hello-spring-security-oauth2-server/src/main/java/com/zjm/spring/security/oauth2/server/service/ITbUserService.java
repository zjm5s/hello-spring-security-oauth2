package com.zjm.spring.security.oauth2.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjm.spring.security.oauth2.server.entity.TbUser;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
public interface ITbUserService extends IService<TbUser> {
    public TbUser getUserByName(String username);
}
