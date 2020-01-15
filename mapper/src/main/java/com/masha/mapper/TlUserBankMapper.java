package com.masha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.masha.model.TlUserBank;
import com.masha.model.TlUserBankExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TlUserBankMapper extends BaseMapper<TlUserBank> {
    long countByExample(TlUserBankExample example);

    int deleteByExample(TlUserBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TlUserBank record);

    int insertSelective(TlUserBank record);

    List<TlUserBank> selectByExample(TlUserBankExample example);

    TlUserBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TlUserBank record, @Param("example") TlUserBankExample example);

    int updateByExample(@Param("record") TlUserBank record, @Param("example") TlUserBankExample example);

    int updateByPrimaryKeySelective(TlUserBank record);

    int updateByPrimaryKey(TlUserBank record);
}
