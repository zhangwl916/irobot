package com.allianity.mapper;

import com.allianity.entity.PriceInfo;
import com.allianity.entity.PriceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceInfoMapper {
    int countByExample(PriceInfoExample example);

    int deleteByExample(PriceInfoExample example);

    int insert(PriceInfo record);

    int insertSelective(PriceInfo record);

    List<PriceInfo> selectByExample(PriceInfoExample example);

    int updateByExampleSelective(@Param("record") PriceInfo record, @Param("example") PriceInfoExample example);

    int updateByExample(@Param("record") PriceInfo record, @Param("example") PriceInfoExample example);
}