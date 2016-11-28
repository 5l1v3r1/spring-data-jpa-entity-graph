package com.cosium.spring.data.jpa.entity.graph.repository;

import javax.inject.Inject;

import com.cosium.spring.data.jpa.entity.graph.BaseTest;
import com.cosium.spring.data.jpa.entity.graph.domain.EntityGraphUtils;
import com.cosium.spring.data.jpa.entity.graph.repository.sample.Product;
import com.cosium.spring.data.jpa.entity.graph.repository.sample.ProductRepository;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 28/11/16.
 *
 * @author Reda.Housni-Alaoui
 */
@DatabaseSetup(BaseTest.DATASET)
@DatabaseTearDown
public class JpaEntityGraphCustomRepositoryTest extends BaseTest {

	@Inject
	private ProductRepository productRepository;

	@Test
	@Transactional
	public void given_products_when_calling_customvoidmethod_with_eg_then_it_should_work(){
		productRepository.customMethod(EntityGraphUtils.fromName(Product.PRODUCT_BRAND_EG));
	}

}