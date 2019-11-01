package com.zjm.spring.security.oauth2.resource.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjm.spring.security.oauth2.resource.entity.TbContent;
import com.zjm.spring.security.oauth2.resource.mapper.TbContentMapper;
import com.zjm.spring.security.oauth2.resource.service.ITbContentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
@Service
public class TbContentServiceImpl extends ServiceImpl<TbContentMapper, TbContent> implements ITbContentService {

}
