package com.mindtree.ticketbooking.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ticketbooking.dto.SearchDto;
import com.mindtree.ticketbooking.entities.Day;
import com.mindtree.ticketbooking.entities.Train;
import com.mindtree.ticketbooking.repository.TrainRepository;
import com.mindtree.ticketbooking.service.TrainService;

@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	private TrainRepository trainRepo;

	@Override
	public List<Train> getAllTrains() {
		return trainRepo.findAll();
	}

	@Override
	public Map<String, List<Train>> getTrains(SearchDto searchDto) {
		
		List<Train> trains=trainRepo.findAll().stream()
				.filter(e->e.getSource().equals(searchDto.getSource())
				&&e.getDestination().equals(searchDto.getDestination()))
				.collect(Collectors.toList());
		Map<String,List<Train>> trainList=new HashMap<String, List<Train>>();
		for (Train train : trains) {
			for (Day day : train.getDays()) {
				if(trainList.containsKey(day.getDay())) {
					List<Train> trns=trainList.get(day.getDay());
					trns.add(train);
					trainList.replace(day.getDay(),trns);
				}
				else
				{
					List<Train> trns=new ArrayList<Train>();
					trns.add(train);

					trainList.put(day.getDay(),trns);
				}
				
			}
			
		}
		
		return trainList;
	}

	@Override
	public Train getTrains(Long id) {
		
		return trainRepo.findById(id).get();
	}

	@Override
	public Map<String, List<Train>> getTrains() {
		
		Map<String,List<Train>> trainList=new HashMap<String, List<Train>>();
		for (Train train : trainRepo.findAll()) {
			String str=train.getSource()+"--"+train.getDestination();
				if(trainList.containsKey(str)) {
					List<Train> trns=trainList.get(str);
					trns.add(train);
					trainList.replace(str,trns);
				}
				else
				{
					List<Train> trns=new ArrayList<Train>();
					trns.add(train);
					trainList.put(str,trns);
				}
				
			}
		
		
		return trainList;
	}

}
