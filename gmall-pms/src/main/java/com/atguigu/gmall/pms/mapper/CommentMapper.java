package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author fengjin
 * @email fengjin@atguigu.com
 * @date 2020-05-16 18:48:27
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
