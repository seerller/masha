package com.masha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.masha.model.TlAddress;
import com.masha.model.TlAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TlAddressMapper extends BaseMapper<TlAddress> {
    long countByExample(TlAddressExample example);

    int deleteByExample(TlAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TlAddress record);

    int insertSelective(TlAddress record);

    List<TlAddress> selectByExample(TlAddressExample example);

    TlAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TlAddress record, @Param("example") TlAddressExample example);

    int updateByExample(@Param("record") TlAddress record, @Param("example") TlAddressExample example);

    int updateByPrimaryKeySelective(TlAddress record);

    int updateByPrimaryKey(TlAddress record);
}
