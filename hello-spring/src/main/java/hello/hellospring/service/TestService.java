package hello.hellospring.service;

import hello.hellospring.dto.TestDTO;
import hello.hellospring.mapper.TestMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestService {

    private static TestMapper testMapper;

    public List<TestDTO> getTestData()
    {

        return testMapper.selectTest();
    }
}
