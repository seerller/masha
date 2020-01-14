package com.masha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.masha.model.TlShopShareUser;
import com.masha.model.TlShopShareUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TlShopShareUserMapper extends BaseMapper<TlShopShareUser> {
    long countByExample(TlShopShareUserExample example);

    int deleteByExample(TlShopShareUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TlShopShareUser record);

    int insertSelective(TlShopShareUser record);

    List<TlShopShareUser> selectByExample(TlShopShareUserExample example);

    TlShopShareUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TlShopShareUser record, @Param("example") TlShopShareUserExample example);

    int updateByExample(@Param("record") TlShopShareUser record, @Param("example") TlShopShareUserExample example);

    int updateByPrimaryKeySelective(TlShopShareUser record);

    int updateByPrimaryKey(TlShopShareUser record);
}
