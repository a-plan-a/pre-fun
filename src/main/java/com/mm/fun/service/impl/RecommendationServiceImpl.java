package com.mm.fun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.fun.bean.Recommendation;
import com.mm.fun.bean.RecommendationMapper;
import com.mm.fun.service.RecommendationService;

@Service
public class RecommendationServiceImpl implements RecommendationService {

	@Autowired
	private RecommendationMapper mapper;

	@Override
	public int insert(Recommendation commend) {
		mapper.insert(commend);
		return 0;
	}

	public List<Recommendation> select(String categoryNO) {
		return mapper.select(categoryNO);
	}
}
