package com.mindtree.trainApp.service;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.trainApp.entity.Train;

public class TrainServiceImplementation {
	List<Train> train=new ArrayList<Train>();
	public Train insertTrainDetails(Train train)
	{
		train.add(train);
		return train;
		
	}
	public List<Train> displayTrains()
	{
		return train;
		
	}

}
