package com.mindtree.movieactor1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.movieactor1.entity.Actor;
import com.mindtree.movieactor1.service.ActorService;

@RestController
public class ActorContoller {
	
	@Autowired
	private ActorService actorService;
	
	@GetMapping("/actor/choice")
	public String choice()
	{
		System.out.println("helloooo");
		return "welcome to string";
	}
	
	@GetMapping("/get/actor/details")
	public List<Actor> getActorDetails()
	{
		List<Actor> actor=new ArrayList<Actor>();
		actor=this.actorService.getActorDetails();
		return actor;
	}
	
	@PostMapping("/insert/data/to/actor")
	public Actor insetDataToActor(@RequestBody Actor actor)
	{
		Actor actor1=null;
		actor1=this.actorService.insetDataToActor(actor);
		return actor1;
	}
	
	@GetMapping("get/all/the/actors/{movieId}")
	public Optional<Actor> getActorInMovie(@PathVariable long movieId)
	{
		return this.actorService.getActorInMovie(movieId);
	}

}
