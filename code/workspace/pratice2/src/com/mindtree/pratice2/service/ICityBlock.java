package com.mindtree.pratice2.service;

import java.util.Map;
import java.util.Set;

import com.mindtree.pratice2.entity.Block;
import com.mindtree.pratice2.entity.City;

public interface ICityBlock {

	 Map<City, Set<Block>> sortData(Map<City, Set<Block>> cityblock);
	

}
