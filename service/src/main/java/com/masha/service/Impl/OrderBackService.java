package com.masha.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.masha.model.TlOrderBack;
import com.masha.service.IOrderBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class OrderBackService  implements IOrderBackService {

    @Autowired
    OrderBackService orderBackService;


    @Override
    public boolean save(TlOrderBack entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<TlOrderBack> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<TlOrderBack> entityList, int batchSize) {
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
    public boolean remove(Wrapper<TlOrderBack> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(TlOrderBack entity) {
        return false;
    }

    @Override
    public boolean update(TlOrderBack entity, Wrapper<TlOrderBack> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<TlOrderBack> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(TlOrderBack entity) {
        return false;
    }

    @Override
    public TlOrderBack getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<TlOrderBack> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<TlOrderBack> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public TlOrderBack getOne(Wrapper<TlOrderBack> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<TlOrderBack> queryWrapper) {
        return null;
    }

    @Override
    public int count(Wrapper<TlOrderBack> queryWrapper) {
        return 0;
    }

    @Override
    public List<TlOrderBack> list(Wrapper<TlOrderBack> queryWrapper) {
        return null;
    }

    @Override
    public IPage<TlOrderBack> page(IPage<TlOrderBack> page, Wrapper<TlOrderBack> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<TlOrderBack> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<TlOrderBack> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<TlOrderBack> page, Wrapper<TlOrderBack> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<TlOrderBack> getBaseMapper() {
        return null;
    }

    @Override
    public void add_back(String content , String back_img , Short type) {

    }
}
