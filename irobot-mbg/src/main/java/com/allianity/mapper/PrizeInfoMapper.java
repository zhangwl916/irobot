package com.allianity.mapper;

import com.allianity.entity.PrizeInfo;
import com.allianity.entity.PrizeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeInfoMapper {
    int countByExample(PrizeInfoExample example);

    int deleteByExample(PrizeInfoExample example);

    int insert(PrizeInfo record);

    int insertSelective(PrizeInfo record);

    List<PrizeInfo> selectByExample(PrizeInfoExample example);

    int updateByExampleSelective(@Param("record") PrizeInfo record, @Param("example") PrizeInfoExample example);

    int updateByExample(@Param("record") PrizeInfo record, @Param("example") PrizeInfoExample example);
}