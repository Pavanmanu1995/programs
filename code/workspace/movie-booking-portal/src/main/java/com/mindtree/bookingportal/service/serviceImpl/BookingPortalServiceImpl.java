package com.mindtree.bookingportal.service.serviceImpl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bookingportal.entity.BookingPortal;
import com.mindtree.bookingportal.exception.customs.BookingPortalAlreadyExistsException;
import com.mindtree.bookingportal.exception.customs.BookingPortalNotFoundException;
import com.mindtree.bookingportal.exception.customs.BookingPortalServiceException;
import com.mindtree.bookingportal.repository.BookingPortalRepository;
import com.mindtree.bookingportal.service.IBookingPortalService;
import com.mindtree.bookingportal.utility.SortTicket;

@Service
@Transactional
public class BookingPortalServiceImpl implements IBookingPortalService {

	@Autowired
	BookingPortalRepository portalRepo;

	@Override
	public BookingPortal addBookingPortal(BookingPortal portalDetails) throws BookingPortalServiceException {

		List<BookingPortal> portalList = portalRepo.findAll();
			if (portalRepo.findByBookingPortalName(portalDetails.getBookingPortalName()).isPresent()) {
				throw new BookingPortalAlreadyExistsException("booking portal is already present");
			}
		portalRepo.save(portalDetails);

		return portalDetails;
	}

	@Override
	public void deletePortal(int portalId) throws BookingPortalServiceException {

		BookingPortal portal = portalRepo.findById(portalId).orElse(null);

		if (portal == null) {
			throw new BookingPortalNotFoundException("No portal found with entered id");
		}

		portalRepo.deleteById(portalId);
	}

	@Override
	public List<BookingPortal> getAll() throws BookingPortalServiceException{
		List<BookingPortal> list = portalRepo.findAll();

		for (BookingPortal bookingPortal : list) {
			Collections.sort(bookingPortal.getTicketList(), new SortTicket());
			bookingPortal.toString();
		}

		
		return list;
	}

}
