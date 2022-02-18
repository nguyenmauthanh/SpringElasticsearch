package com.example.springelasticsearch.repository;

import com.example.springelasticsearch.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, Long> {
}
