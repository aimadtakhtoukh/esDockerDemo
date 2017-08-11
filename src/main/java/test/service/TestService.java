package test.service;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.entity.Test;
import test.repository.TestRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/test/")
public class TestService {

    private final TestRepository testRepository;
    private final Client client;

    @Autowired
    public TestService(TestRepository testRepository, Client client) {
        this.testRepository = testRepository;
        this.client = client;
    }

    @PostMapping
    public Test save(@RequestBody Test test) {
        return testRepository.save(test);
    }

    @GetMapping
    public List<Test> findAll() {
        return StreamSupport.stream(testRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
