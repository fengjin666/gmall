package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 商品属性
 * 
 * @author fengjin
 * @email fengjin@atguigu.com
 * @date 2020-05-16 18:48:27
 */
@Repository
@Mapper
public interface AttrMapper extends BaseMapper<AttrEntity> {
	
}
