package com.mindtree.universityCollege.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.universityCollege.Entity.Collage;

@Service
public interface CollageService {

	Object addDataToCollage(Collage collage, int uId);

	List<Collage> listOfStudentsGreaterThan2();


}
