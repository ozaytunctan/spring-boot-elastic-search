package com.ozaytunctan.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.ozaytunctan.elastic.model.LogMessage;

@Repository
public interface LogMessageRepository extends ElasticsearchRepository<LogMessage, Integer>{

	
}
