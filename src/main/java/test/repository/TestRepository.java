package test.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import test.entity.Test;

public interface TestRepository extends ElasticsearchRepository<Test, String> {

}
