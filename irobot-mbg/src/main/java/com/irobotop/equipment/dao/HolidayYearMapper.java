package com.irobotop.equipment.dao;

import com.irobotop.equipment.bean.HolidayYear;
import com.irobotop.equipment.bean.HolidayYearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HolidayYearMapper {
    int countByExample(HolidayYearExample example);

    int deleteByExample(HolidayYearExample example);

    int insert(HolidayYear record);

    int insertSelective(HolidayYear record);

    List<HolidayYear> selectByExample(HolidayYearExample example);

    int updateByExampleSelective(@Param("record") HolidayYear record, @Param("example") HolidayYearExample example);

    int updateByExample(@Param("record") HolidayYear record, @Param("example") HolidayYearExample example);
}