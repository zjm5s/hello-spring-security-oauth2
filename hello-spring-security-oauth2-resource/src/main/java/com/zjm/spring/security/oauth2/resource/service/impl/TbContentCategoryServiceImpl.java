package com.zjm.spring.security.oauth2.resource.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjm.spring.security.oauth2.resource.entity.TbContentCategory;
import com.zjm.spring.security.oauth2.resource.mapper.TbContentCategoryMapper;
import com.zjm.spring.security.oauth2.resource.service.ITbContentCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 内容分类 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
@Service
public class TbContentCategoryServiceImpl extends ServiceImpl<TbContentCategoryMapper, TbContentCategory> implements ITbContentCategoryService {

}
