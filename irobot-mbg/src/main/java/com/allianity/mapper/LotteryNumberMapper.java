package com.allianity.mapper;

import com.allianity.entity.LotteryNumber;
import com.allianity.entity.LotteryNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryNumberMapper {
    int countByExample(LotteryNumberExample example);

    int deleteByExample(LotteryNumberExample example);

    int insert(LotteryNumber record);

    int insertSelective(LotteryNumber record);

    List<LotteryNumber> selectByExample(LotteryNumberExample example);

    int updateByExampleSelective(@Param("record") LotteryNumber record, @Param("example") LotteryNumberExample example);

    int updateByExample(@Param("record") LotteryNumber record, @Param("example") LotteryNumberExample example);
}