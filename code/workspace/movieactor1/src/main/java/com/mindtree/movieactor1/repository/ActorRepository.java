package com.mindtree.movieactor1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.movieactor1.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {

}
