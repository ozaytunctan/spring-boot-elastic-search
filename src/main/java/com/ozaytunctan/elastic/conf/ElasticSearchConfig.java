package com.ozaytunctan.elastic.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@Configuration
@EnableElasticsearchRepositories(basePackages= {"com.ozaytunctan.elastic.repository.*"})
public class ElasticSearchConfig {

	
}