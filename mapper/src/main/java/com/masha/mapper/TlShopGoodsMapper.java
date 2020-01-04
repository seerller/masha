package com.masha.mapper;

import com.masha.model.TlShopGoods;
import com.masha.model.TlShopGoodsExample;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface TlShopGoodsMapper extends BaseMapper<TlShopGoods>{
    long countByExample(TlShopGoodsExample example);

    int deleteByExample(TlShopGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(TlShopGoods record);

    int insertSelective(TlShopGoods record);

    List<TlShopGoods> selectByExampleWithBLOBs(TlShopGoodsExample example);

    List<TlShopGoods> selectByExample(TlShopGoodsExample example);

    TlShopGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") TlShopGoods record, @Param("example") TlShopGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") TlShopGoods record, @Param("example") TlShopGoodsExample example);

    int updateByExample(@Param("record") TlShopGoods record, @Param("example") TlShopGoodsExample example);

    int updateByPrimaryKeySelective(TlShopGoods record);

    int updateByPrimaryKeyWithBLOBs(TlShopGoods record);

    int updateByPrimaryKey(TlShopGoods record);
}
