package com.example.test.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "test")  //表名
public class MongoTest  implements Serializable {
    @Id
    private String id;//对应芒果数据库中的长id
    private Integer ids;
    private Integer age;
    private String name;
}
