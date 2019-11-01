package com.zjm.spring.security.oauth2.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjm.spring.security.oauth2.server.entity.TbUser;
import com.zjm.spring.security.oauth2.server.mapper.TbUserMapper;
import com.zjm.spring.security.oauth2.server.service.ITbUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

    public TbUser getUserByName(String username){
        QueryWrapper<TbUser> tbUserQueryWrapper = new QueryWrapper<>();
        tbUserQueryWrapper.eq("username",username);
        return getOne(tbUserQueryWrapper);
    }
}
