package hello.hellospring.mapper;

import hello.hellospring.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestMapper {
    List<TestDTO> selectTest();
}
