package com.pranavkapoorr.es.api.repository;

import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.pranavkapoorr.es.api.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String>{
	List<Customer> findByFirstname(String firstName);
}
