package com.mindtree.CollageUniversity.utility;

import java.util.Comparator;

import com.mindtree.CollageUniversity.entity.College;

public class SortTotalStudent implements Comparator<College> {

	@Override
	public int compare(College c1, College c2) {
		if (c1.getTotalStudents() < c2.getTotalStudents()) {
			return 1;
		} else if (c1.getTotalStudents() > c2.getTotalStudents()) {
			return -1;
		} else
			return 0;
	}
	

}
