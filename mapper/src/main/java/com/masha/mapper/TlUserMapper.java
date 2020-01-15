package com.masha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.masha.model.TlUser;
import com.masha.model.TlUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TlUserMapper extends BaseMapper<TlUser> {
    long countByExample(TlUserExample example);

    int deleteByExample(TlUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TlUser record);

    int insertSelective(TlUser record);

    List<TlUser> selectByExample(TlUserExample example);

    TlUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TlUser record, @Param("example") TlUserExample example);

    int updateByExample(@Param("record") TlUser record, @Param("example") TlUserExample example);

    int updateByPrimaryKeySelective(TlUser record);

    int updateByPrimaryKey(TlUser record);
}
