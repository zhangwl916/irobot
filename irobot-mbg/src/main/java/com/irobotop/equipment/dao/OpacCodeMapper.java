package com.irobotop.equipment.dao;

import com.irobotop.equipment.bean.OpacCode;
import com.irobotop.equipment.bean.OpacCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpacCodeMapper {
    int countByExample(OpacCodeExample example);

    int deleteByExample(OpacCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpacCode record);

    int insertSelective(OpacCode record);

    List<OpacCode> selectByExample(OpacCodeExample example);

    OpacCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpacCode record, @Param("example") OpacCodeExample example);

    int updateByExample(@Param("record") OpacCode record, @Param("example") OpacCodeExample example);

    int updateByPrimaryKeySelective(OpacCode record);

    int updateByPrimaryKey(OpacCode record);
}