package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.SpuDescEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * spu信息介绍
 * 
 * @author fengjin
 * @email fengjin@atguigu.com
 * @date 2020-05-16 18:48:26
 */
@Repository
@Mapper
public interface SpuDescMapper extends BaseMapper<SpuDescEntity> {
	
}
