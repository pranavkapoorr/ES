package com.pranavkapoorr.es.api.configuration;

import org.elasticsearch.node.NodeBuilder;
import org.springframework.context.annotation.*;
import org.springframework.data.elasticsearch.core.*;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.pranavkapoorr.es.api.repository")
public class ESConfiguration {
	@Bean
	public NodeBuilder nodeBuilder() {
		return new NodeBuilder();
	}
	@Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
    }
}
