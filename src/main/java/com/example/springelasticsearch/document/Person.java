package com.example.springelasticsearch.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@Document(indexName = "person")
@Setting(settingPath = "static/es-settings.json")
public class Person {

    @Id
    @Field(type = FieldType.Keyword)
    private Long id;

    @Field(type =  FieldType.Text)
    private String name;


}
