package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author fengjin
 * @email fengjin@atguigu.com
 * @date 2020-05-16 19:47:01
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
