package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.Address;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.Customer;
import com.example.demo.repository.CustomerNative;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.Posts;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	PostRepository postRepository;
	
	@Disabled
	@Test
	public void 고객_등록() {
		// given
		String name = "홍길동";
		String phone = "011";
		Customer customer = Customer.builder().name(name).phone(phone).build();
		customerRepository.save(customer);
		// when
		List<Customer> customerList = (List<Customer>) customerRepository.findAll();
		// then
		assertEquals(customerList.get(0).getName(), name);
		log.info("조회된	고객	이름:	{}", customerList.get(0).getName());
	}

	//@Disabled
	@Test
	public void 고객_수정() {
		// given- 초기 데이터 저장
		String name = "홍길동";
		String phone = "011";
		Customer saved = customerRepository.save(Customer.builder().name(name).phone(phone).build());
		// when - 고객 정보 수정
		Customer customer = customerRepository.findById(saved.getId()).orElse(new Customer());
		customer.updateNameAndEmail("둘리", "woongs254@naver.com");
		Customer updated = customerRepository.save(customer);
		// then
		assertEquals(updated.getName(), customer.getName());
		log.info("수정된	고객	이름:	{}", updated.getName());
	}

	@Disabled
	@Test
	public void 이름_조회() {
		// given
		String name = "둘리";

		// when
		List<Customer> list = customerRepository.findByName(name);
		List<Customer> list2 = customerRepository.findByNameLike("%둘%");
		List<Customer> list3 = customerRepository.findByNameOrEmail("둘리", "%woong%");

		list2.stream().forEach(cust -> System.out.println(cust.getName()));
		list3.stream().forEach(cust -> System.out.println("이름: " + cust.getName() + " 이메일: " + cust.getEmail()));
		// then
		assertEquals(list.get(0).getName(), name);
	}

	@Disabled
	@Test
	public void 네이티브_쿼리() {
		List<Object[]> list = customerRepository.findAllnative("011", "둘리");
		// 이름 폰번호 출력
		for (Object[] lists : list) {
			System.out.println(lists[0] + ":" + lists[1]);
		}

		// List<VO> 결과받기
		List<CustomerNative> list2 = customerRepository.findAllnativeVO("011", "둘리");
		for (CustomerNative lists : list2) {
			System.out.println(lists.getId() + ":" + lists.getName());
		}
	}

	// JPQL
	@Disabled
	@Test
	public void jqpl_test() {
		List<Customer> list = customerRepository.findAllquery();
		list.stream().forEach(cust -> System.out.println(cust.getId() + " " + cust.getName()));
	}
	
	@Disabled
	@Test
	public void 일대일() {
//		given(준비)
		Customer customerEntity = Customer.builder().name("길동").phone("019").email("woongs254@naver.com").build();
		Customer saved = customerRepository.save(customerEntity);
		
		addressRepository.save( Address.builder()
								.zipcode("01000")
								.address("서울")
								.customer(customerEntity)
								.build());
		addressRepository.save( Address.builder()
								.zipcode("04121")
								.address("부산")
								.customer(customerEntity)
								.build());
		
		// when(실행)
		Customer customer = customerRepository.findById(saved.getId()).get();
		customer.getAddress().forEach(addr -> System.out.println(addr.getZipcode()+":"+addr.getAddress()));
		// then(검증)
		assertEquals("04121", customer.getAddress().get(0).getZipcode());

	}
	
	@Test
	public void 게시글저장_불러오기() {
		//given
		String title = "테스트게시글";
		String content = "테스트 본문";
		
		postRepository.save(Posts.builder()).title(title).content(content).author("wjdwldnd254@naver.com").build());
	}
}
