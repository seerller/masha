package com.masha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.masha.model.TlShopCart;
import com.masha.model.TlShopCartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TlShopCartMapper extends BaseMapper<TlShopCart> {
    long countByExample(TlShopCartExample example);

    int deleteByExample(TlShopCartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(TlShopCart record);

    int insertSelective(TlShopCart record);

    List<TlShopCart> selectByExample(TlShopCartExample example);

    TlShopCart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") TlShopCart record, @Param("example") TlShopCartExample example);

    int updateByExample(@Param("record") TlShopCart record, @Param("example") TlShopCartExample example);

    int updateByPrimaryKeySelective(TlShopCart record);

    int updateByPrimaryKey(TlShopCart record);
}
