package com.masha.mapper;

import com.masha.model.TlOrderBack;
import com.masha.model.TlOrderBackExample;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface TlOrderBackMapper extends BaseMapper<TlOrderBack> {
    long countByExample(TlOrderBackExample example);

    int deleteByExample(TlOrderBackExample example);

    int deleteByPrimaryKey(Integer orderBackId);

    int insert(TlOrderBack record);

    int insertSelective(TlOrderBack record);

    List<TlOrderBack> selectByExampleWithBLOBs(TlOrderBackExample example);

    List<TlOrderBack> selectByExample(TlOrderBackExample example);

    TlOrderBack selectByPrimaryKey(Integer orderBackId);

    int updateByExampleSelective(@Param("record") TlOrderBack record, @Param("example") TlOrderBackExample example);

    int updateByExampleWithBLOBs(@Param("record") TlOrderBack record, @Param("example") TlOrderBackExample example);

    int updateByExample(@Param("record") TlOrderBack record, @Param("example") TlOrderBackExample example);

    int updateByPrimaryKeySelective(TlOrderBack record);

    int updateByPrimaryKeyWithBLOBs(TlOrderBack record);

    int updateByPrimaryKey(TlOrderBack record);
}
