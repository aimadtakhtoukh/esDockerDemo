package test.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "test", type =  "test")
public class Test {

    @Id
    private String id;
    private String test;

    public Test() {}

    public Test(String id, String test) {
        this.id = id;
        this.test = test;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
