package com.masha.mapper;

import com.masha.model.TlOrder;
import com.masha.model.TlOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TlOrderMapper {
    long countByExample(TlOrderExample example);

    int deleteByExample(TlOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(TlOrder record);

    int insertSelective(TlOrder record);

    List<TlOrder> selectByExampleWithBLOBs(TlOrderExample example);

    List<TlOrder> selectByExample(TlOrderExample example);

    TlOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") TlOrder record, @Param("example") TlOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") TlOrder record, @Param("example") TlOrderExample example);

    int updateByExample(@Param("record") TlOrder record, @Param("example") TlOrderExample example);

    int updateByPrimaryKeySelective(TlOrder record);

    int updateByPrimaryKeyWithBLOBs(TlOrder record);

    int updateByPrimaryKey(TlOrder record);
}