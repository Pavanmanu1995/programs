package com.mindtree.movieactor1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.movieactor1.entity.Actor;
import com.mindtree.movieactor1.repository.ActorRepository;
@Service
public class ActorServiceImpl implements ActorService {
	
	@Autowired
	private ActorRepository actorRepository;

	@Override
	public List<Actor> getActorDetails() {
		List<Actor> actor=new ArrayList<Actor>();
		actor=this.actorRepository.findAll();
		
		return actor;
	}

	@Override
	public Actor insetDataToActor(Actor actor) {
		Actor actor1=null;
		actor1=this.actorRepository.save(actor);
		return actor1;
	}

	@Override
	public Optional<Actor> getActorInMovie(long movieId) {
		return this.actorRepository.findById(movieId);
	}

}
