package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.SkuFullReductionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 商品满减信息
 * 
 * @author fengjin
 * @email fengjin@atguigu.com
 * @date 2020-05-16 19:36:58
 */
@Repository
@Mapper
public interface SkuFullReductionMapper extends BaseMapper<SkuFullReductionEntity> {
	
}
