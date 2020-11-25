package com.mindtree.ticketbooking.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mindtree.ticketbooking.dto.SearchDto;
import com.mindtree.ticketbooking.entities.Train;


@Service
public interface TrainService {
	List<Train> getAllTrains();

	Map<String, List<Train>> getTrains(SearchDto searchDto);

	Train getTrains(Long id);

	Map<String, List<Train>> getTrains();
}
