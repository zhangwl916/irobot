package com.irobot.mbg.dao;

import com.irobotop.shop.bean.ResourceDO;
import com.irobotop.shop.bean.ResourceDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ResourceDOMapper {
    int countByExample(ResourceDOExample example);

    int deleteByExample(ResourceDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResourceDO record);

    int insertSelective(ResourceDO record);

    List<ResourceDO> selectByExample(ResourceDOExample example);

    ResourceDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResourceDO record, @Param("example") ResourceDOExample example);

    int updateByExample(@Param("record") ResourceDO record, @Param("example") ResourceDOExample example);

    int updateByPrimaryKeySelective(ResourceDO record);

    int updateByPrimaryKey(ResourceDO record);
}