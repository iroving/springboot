package hip.cda.hipcda.mapper;

import hip.cda.hipcda.entity.TestEntity;

//@Mapper
public interface TestMapper {
    public TestEntity findById(String id);
}
