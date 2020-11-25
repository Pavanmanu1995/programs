package com.mindtree.universityCollege.Utility;

import java.util.Comparator;

import com.mindtree.universityCollege.Entity.Collage;


public class SortStudents implements Comparator<Collage> {

	@Override
	public int compare(Collage c1, Collage c2) {
				if (c1.getTotalStudent() < c2.getTotalStudent()) {
					return 1;
				} else if (c1.getTotalStudent() > c2.getTotalStudent()) {
					return -1;
				} else
					return 0;
	}
	}

