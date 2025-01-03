package com.infogain.api.booking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BookingResponse {
  private long bookingid;
  private Booking booking;
}
