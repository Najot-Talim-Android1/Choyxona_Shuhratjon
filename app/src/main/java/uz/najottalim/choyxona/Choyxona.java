package uz.najottalim.choyxona;

import java.util.ArrayList;

public class Choyxona {
    private int room1;
    private int room2;
    private String osh;
    private String qozonKabob;
    private String numberOfPeople;
    private String date;
    private static ArrayList<Choyxona> addBooking = new ArrayList<>();
//    private static ArrayList<BookingListActivity> bookingList = new ArrayList<>();

    public Choyxona(String osh, String numberOfPeople, int room1, String date) {
        this.room1 = room1;
        this.osh = osh;
        this.numberOfPeople = numberOfPeople;
        this.date = date;

    }

    public Choyxona(int room2, String osh, String numberOfPeople, String date) {
        this.room1 = room2;
        this.osh = osh;
        this.numberOfPeople = numberOfPeople;
        this.date = date;

    }

    public Choyxona(String qozonKabob, int room2, String numberOfPeople, String date) {
        this.room2 = room2;
        this.qozonKabob = qozonKabob;
        this.numberOfPeople = numberOfPeople;
        this.date = date;

    }

    public Choyxona(String qozonKabob, String numberOfPeople, String date, int room1) {
        this.room1 = room1;
        this.qozonKabob = qozonKabob;
        this.numberOfPeople = numberOfPeople;
        this.date = date;

    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static ArrayList<Choyxona> getAddBooking() {
        return addBooking;
    }

    public static void setAddBooking(ArrayList<Choyxona> addBooking) {
        Choyxona.addBooking = addBooking;
    }

    public int getRoom1() {
        return room1;
    }

    public void setRoom1(int room1) {
        this.room1 = room1;
    }

    public int getRoom2() {
        return room2;
    }

    public void setRoom2(int room2) {
        this.room2 = room2;
    }

    public String getosh() {
        return osh;
    }

    public void setosh(String osh) {
        this.osh = osh;
    }

    public String getqozonKabob() {
        return qozonKabob;
    }

    public void setqozonKabob(String qozonKabob) {
        this.qozonKabob = qozonKabob;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}












