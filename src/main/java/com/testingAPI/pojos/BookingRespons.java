package org.example.PayloadManagement.easyGsonWay;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookingRespons {

    //AS we have copied the Response of given payload with generated ID from postman and
    // pasted in https://www.jsonschema2pojo.org/ and copied (BookingRespons) and pasted in created class.
    @SerializedName("bookingid")
    @Expose
    private Integer bookingid;
    @SerializedName("booking")
    @Expose
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

}
