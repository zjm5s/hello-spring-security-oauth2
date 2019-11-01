package com.zjm.spring.security.oauth2.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjm.spring.security.oauth2.server.entity.TbPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-11-01
 */
public interface TbPermissionMapper extends BaseMapper<TbPermission> {
    List<TbPermission> getByUserId(@Param("id") Long id);
}
