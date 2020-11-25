package com.mindtree.movieactor1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mindtree.movieactor1.entity.Actor;

@Service
public interface ActorService {

	List<Actor> getActorDetails();

	Actor insetDataToActor(Actor actor);

	Optional<Actor> getActorInMovie(long movieId);

}
