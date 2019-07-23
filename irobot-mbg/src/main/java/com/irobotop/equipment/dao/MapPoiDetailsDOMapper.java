package com.irobotop.equipment.dao;

import com.irobotop.equipment.bean.MapPoiDetailsDO;
import com.irobotop.equipment.bean.MapPoiDetailsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapPoiDetailsDOMapper {
    int countByExample(MapPoiDetailsDOExample example);

    int deleteByExample(MapPoiDetailsDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MapPoiDetailsDO record);

    int insertSelective(MapPoiDetailsDO record);

    List<MapPoiDetailsDO> selectByExample(MapPoiDetailsDOExample example);

    MapPoiDetailsDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MapPoiDetailsDO record, @Param("example") MapPoiDetailsDOExample example);

    int updateByExample(@Param("record") MapPoiDetailsDO record, @Param("example") MapPoiDetailsDOExample example);

    int updateByPrimaryKeySelective(MapPoiDetailsDO record);

    int updateByPrimaryKey(MapPoiDetailsDO record);
}