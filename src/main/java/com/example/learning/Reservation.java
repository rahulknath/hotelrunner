package com.example.learning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private String reason;
    private String hr_number;
    private String provider_number;
    private String channel;
    private String channel_display;
    private String state;
    private boolean modified;
    private String guest;
    private String cancel_reason;
    private String completed_at;
    private String updated_at;
    private double sub_total;
    private double extras_total;
    private double adjustments_total;
    private double tax_total;
    private double total;
    private String currency;
    private String checkin_date;
    private String checkout_date;
    private String note;
    private String payment;
    private double paid_amount;
    private boolean requires_response;
    private Address address;
    private List<Room> rooms;

    // Getters and setters for the above fields
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {
        private String city;
        private String state;
        private String country;
        private String country_code;
        private String phone;
        private String email;
        private String street;
        private String street_2;

        // Getters and setters for the address fields
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Room {
        private String state;
        private String rate_code;
        private String inv_code;
        private boolean non_refundable;
        private double price;
        private int nights;
        private int total_guest;
        private int total_adult;
        private List<String> child_ages;
        private String name;
        private String checkin_date;
        private String checkout_date;
        private String extra_info;
        private List<DailyPrice> daily_prices;
        private List<String> extras;

        // Getters and setters for the room fields
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DailyPrice {
        private String date;
        private double price;

        // Getters and setters for the daily price fields
    }
}
