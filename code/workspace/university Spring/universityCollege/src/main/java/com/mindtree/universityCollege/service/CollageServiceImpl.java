package com.mindtree.universityCollege.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.universityCollege.Entity.Collage;
import com.mindtree.universityCollege.Entity.University;
import com.mindtree.universityCollege.Utility.SortStudents;
import com.mindtree.universityCollege.repository.CollageRepo;

@Service
public class CollageServiceImpl implements CollageService {
	
	@Autowired
	CollageRepo collageRepo;

	@Override
	public Object addDataToCollage(Collage collage, int uId) {
		List<Collage> collageList = collageRepo.findAll();
		Collage collages=null;

		for (Collage collage1 : collageList) {
			if (collage1.getCollageId()==collageId) {
				collages=this.collageRepo.save(collage);
				
			}
		}
		
		return collages;
	}

	@Override
	public List<Collage> listOfStudentsGreaterThan2() {
		List<Collage> collage = this.collageRepo.findAll();
		List<Collage> collages = new ArrayList<Collage>();
		for (int i = 0; i < collage.size(); i++)
			if (collage.get(i).getTotalStudent()>2) {
				collages.add(collage.get(i));
			}
		return collages;
	}

	
		

}
