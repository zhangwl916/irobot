package com.allianity.mapper;

import com.allianity.entity.LotteryWin;
import com.allianity.entity.LotteryWinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryWinMapper {
    int countByExample(LotteryWinExample example);

    int deleteByExample(LotteryWinExample example);

    int deleteByPrimaryKey(String id);

    int insert(LotteryWin record);

    int insertSelective(LotteryWin record);

    List<LotteryWin> selectByExample(LotteryWinExample example);

    LotteryWin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LotteryWin record, @Param("example") LotteryWinExample example);

    int updateByExample(@Param("record") LotteryWin record, @Param("example") LotteryWinExample example);

    int updateByPrimaryKeySelective(LotteryWin record);

    int updateByPrimaryKey(LotteryWin record);
}