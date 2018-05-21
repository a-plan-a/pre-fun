package com.mm.fun.service;

import java.util.List;

import com.mm.fun.bean.Recommendation;

public interface RecommendationService {

	int insert(Recommendation commend);

	List<Recommendation> select(String categoryNO);

}
