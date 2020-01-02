package com.masha.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.masha.model.TlOrder;
import com.masha.service.IOrderService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class OrderService  implements IOrderService{

    @Override
    public List<TlOrder> getTlOerderList(String param) {
        return null;
    }

    @Override
    public TlOrder getTlOrderById(Integer orderId) {
        return null;
    }

    @Override
    public boolean save(TlOrder entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<TlOrder> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<TlOrder> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return false;
    }

    @Override
    public boolean remove(Wrapper<TlOrder> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(TlOrder entity) {
        return false;
    }

    @Override
    public boolean update(TlOrder entity, Wrapper<TlOrder> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<TlOrder> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(TlOrder entity) {
        return false;
    }

    @Override
    public TlOrder getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<TlOrder> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<TlOrder> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public TlOrder getOne(Wrapper<TlOrder> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<TlOrder> queryWrapper) {
        return null;
    }

    @Override
    public int count(Wrapper<TlOrder> queryWrapper) {
        return 0;
    }

    @Override
    public List<TlOrder> list(Wrapper<TlOrder> queryWrapper) {
        return null;
    }

    @Override
    public IPage<TlOrder> page(IPage<TlOrder> page, Wrapper<TlOrder> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<TlOrder> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<TlOrder> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<TlOrder> page, Wrapper<TlOrder> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<TlOrder> getBaseMapper() {
        return null;
    }
}
