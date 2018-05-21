package com.mm.fun;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mm.fun.bean.Recommendation;
import com.mm.fun.bean.RecommendationMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PreFunApplicationTests {

	@Autowired
	private RecommendationMapper mapper;

	@Test
	public void contextLoads() {
		List<Recommendation> list = mapper.select("001");
		System.out.println(">>>>> "+list.size());
		assertEquals(2, list.size());
		
	}

}
