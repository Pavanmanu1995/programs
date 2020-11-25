package com.mindtree.ticketbooking.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.ticketbooking.dto.ErrorDto;
import com.mindtree.ticketbooking.dto.SearchDto;
import com.mindtree.ticketbooking.entities.Train;
import com.mindtree.ticketbooking.service.TrainService;




@Controller
public class TrainController {
	@Autowired
	private TrainService trainService;
	@RequestMapping("book")
	public ModelAndView searchTrain() {
		ModelAndView mav=new ModelAndView("booking");
		List<Train> trains=trainService.getAllTrains();
		mav.addObject("trains",trains);
		mav.addObject("searchDto", new SearchDto());
		return mav;
	}
	@RequestMapping("search")
	public ModelAndView getTrainAvailability(@ModelAttribute("searchDto") SearchDto searchDto) {
		ModelAndView mav=new ModelAndView("showtrain");
		Map<String,List<Train>> trainList=trainService.getTrains(searchDto);
		if(trainList.isEmpty())
			mav.addObject("error", new ErrorDto(" NoTrain available"));
		else
			mav.addObject("trainList", trainList);
		return mav;
		
	}
	@RequestMapping("check")
	public ModelAndView checkTrainList(@ModelAttribute("searchDto") SearchDto searchDto) {
		ModelAndView mav=new ModelAndView("checkTrain");
		Map<String,List<Train>> trainList=trainService.getTrains();
		mav.addObject("trainList", trainList);
		return mav;
		
	}
}
