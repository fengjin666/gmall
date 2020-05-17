package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fengjin
 * @email fengjin@atguigu.com
 * @date 2020-05-16 19:23:14
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
