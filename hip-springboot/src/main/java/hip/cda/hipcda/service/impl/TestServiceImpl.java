package hip.cda.hipcda.service.impl;

import hip.cda.hipcda.common.Result;
import hip.cda.hipcda.entity.TestEntity;
import hip.cda.hipcda.mapper.TestMapper;
import hip.cda.hipcda.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;

    // @CachePut(更新和删除使用) @CacheEvict(清空缓存使用)
    @Cacheable(value="sysCache",key="#key")
    @Override
    public Result findById(String key) {
        Result result = Result.success();
        TestEntity entity = testMapper.findById(key);
        result.addValue("data",entity);

        return result;
    }
}
