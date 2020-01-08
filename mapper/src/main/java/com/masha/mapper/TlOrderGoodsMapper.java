package com.masha.mapper;

import com.masha.model.TlOrderGoods;
import com.masha.model.TlOrderGoodsExample;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface TlOrderGoodsMapper extends BaseMapper<TlOrderGoods> {
    long countByExample(TlOrderGoodsExample example);

    int deleteByExample(TlOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TlOrderGoods record);

    int insertSelective(TlOrderGoods record);

    List<TlOrderGoods> selectByExample(TlOrderGoodsExample example);

    TlOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TlOrderGoods record, @Param("example") TlOrderGoodsExample example);

    int updateByExample(@Param("record") TlOrderGoods record, @Param("example") TlOrderGoodsExample example);

    int updateByPrimaryKeySelective(TlOrderGoods record);

    int updateByPrimaryKey(TlOrderGoods record);
}
