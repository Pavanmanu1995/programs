package com.mindtree.bookingportal.service.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bookingportal.entity.BookingPortal;
import com.mindtree.bookingportal.entity.MovieTicket;
import com.mindtree.bookingportal.exception.customs.BookingPortalNotFoundException;
import com.mindtree.bookingportal.exception.customs.BookingPortalServiceException;
import com.mindtree.bookingportal.exception.customs.MovieTicketAlreadyBookedException;
import com.mindtree.bookingportal.repository.BookingPortalRepository;
import com.mindtree.bookingportal.repository.MovieTicketRepository;
import com.mindtree.bookingportal.service.ITicketService;

@Service
@Transactional
public class TicketServiceImpl implements ITicketService {

	@Autowired
	MovieTicketRepository ticketRepo;
	
	@Autowired
	BookingPortalRepository portalRepo;
	
	
	@Override
	public BookingPortal bookTicket(MovieTicket ticketDetails, String bookingPortalName) throws BookingPortalServiceException {
		BookingPortal bookingPortal1 = portalRepo.findByBookingPortalName(bookingPortalName)
				.orElseThrow(() -> new BookingPortalNotFoundException("Booking Portal Not Found"));

		for (MovieTicket movieTicket1 : bookingPortal1.getTicketList()) {
			if (movieTicket1.getMovieName().equalsIgnoreCase(ticketDetails.getMovieName()))
				throw new MovieTicketAlreadyBookedException("Movie Ticket Is Already Booked");
		}
		bookingPortal1.getTicketList().add(ticketDetails);
		ticketDetails.setBookingPortal(bookingPortal1);
		ticketRepo.save(ticketDetails);
		return ticketRepo.findByMovieName(ticketDetails.getMovieName()).get();
	}

}
