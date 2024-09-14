package in.codecraftsbysanta.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookingResponseDTO {
    private Long bookingId;
    private ResponseStatus responseStatus;
}
