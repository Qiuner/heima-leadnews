package com.heima.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.heima.model.user.pojos.ApUser;

@Mapper
public interface ApUserMapper extends BaseMapper<ApUser> {
}