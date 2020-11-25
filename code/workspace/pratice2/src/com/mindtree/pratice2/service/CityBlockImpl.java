package com.mindtree.pratice2.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mindtree.pratice2.entity.Block;
import com.mindtree.pratice2.entity.City;

public class CityBlockImpl implements ICityBlock {

	@Override
	public Map<City, Set<Block>> sortData(Map<City, Set<Block>> cityblock) {
		for(Map.Entry<City, Set<Block>> entry:cityblock.entrySet())
		{
			List<Block> blocks = new LinkedList<Block>(entry.getValue());
			Collections.sort(blocks, new Comparator<Block>() {

				@Override
				public int compare(Block o1, Block o2) {
					// TODO Auto-generated method stub
					return o2.getBlockName().compareTo(o1.getBlockName());
				}
			});
			Set<Block> block =new LinkedHashSet<Block>(blocks);
			cityblock.put(entry.getKey(), block);
		}
		return cityblock;
	}

}
