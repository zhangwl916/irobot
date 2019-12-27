package com.allianity.mapper;

import com.allianity.entity.LotteryRecord;
import com.allianity.entity.LotteryRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryRecordMapper {
    int countByExample(LotteryRecordExample example);

    int deleteByExample(LotteryRecordExample example);

    int insert(LotteryRecord record);

    int insertSelective(LotteryRecord record);

    List<LotteryRecord> selectByExample(LotteryRecordExample example);

    int updateByExampleSelective(@Param("record") LotteryRecord record, @Param("example") LotteryRecordExample example);

    int updateByExample(@Param("record") LotteryRecord record, @Param("example") LotteryRecordExample example);
}