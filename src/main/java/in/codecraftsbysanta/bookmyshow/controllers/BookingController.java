package in.codecraftsbysanta.bookmyshow.controllers;

import in.codecraftsbysanta.bookmyshow.dtos.CreateBookingRequestDTO;
import in.codecraftsbysanta.bookmyshow.dtos.CreateBookingResponseDTO;
import in.codecraftsbysanta.bookmyshow.dtos.ResponseStatus;
import in.codecraftsbysanta.bookmyshow.services.BookingService;
import in.codecraftsbysanta.bookmyshow.models.Booking;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public CreateBookingResponseDTO createBooking(CreateBookingRequestDTO requestDto) {
        CreateBookingResponseDTO responseDto = new CreateBookingResponseDTO();

        try {
            Booking booking = bookingService.createBooking(requestDto.getUserId(),
                    requestDto.getShowSeatIds(),
                    requestDto.getShowId());

            responseDto.setBookingId(booking.getId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
