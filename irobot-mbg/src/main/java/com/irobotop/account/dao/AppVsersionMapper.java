package com.irobotop.account.dao;

import com.irobotop.account.bean.AppVsersion;
import com.irobotop.account.bean.AppVsersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppVsersionMapper {
    int countByExample(AppVsersionExample example);

    int deleteByExample(AppVsersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppVsersion record);

    int insertSelective(AppVsersion record);

    List<AppVsersion> selectByExample(AppVsersionExample example);

    AppVsersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppVsersion record, @Param("example") AppVsersionExample example);

    int updateByExample(@Param("record") AppVsersion record, @Param("example") AppVsersionExample example);

    int updateByPrimaryKeySelective(AppVsersion record);

    int updateByPrimaryKey(AppVsersion record);
}