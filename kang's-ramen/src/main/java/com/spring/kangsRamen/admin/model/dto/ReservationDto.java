package com.spring.kangsRamen.admin.model.dto;

import java.time.LocalDate;

public class ReservationDto {

	private int reservation_code;
	private String date;
	private String time;
	private int adult;
	private int child;
	private String seat;
	private int karaiRamen;
	private int shoyu;
	private int miso;
	private int tonkotsu;
	private int price;
	private String payment_key;
	private LocalDate reservation_date;

	public int getReservation_code() {
		return reservation_code;
	}

	public void setReservation_code(int reservation_code) {
		this.reservation_code = reservation_code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getAdult() {
		return adult;
	}

	public void setAdult(int adult) {
		this.adult = adult;
	}

	public int getChild() {
		return child;
	}

	public void setChild(int child) {
		this.child = child;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public int getKaraiRamen() {
		return karaiRamen;
	}

	public void setKaraiRamen(int karaiRamen) {
		this.karaiRamen = karaiRamen;
	}

	public int getShoyu() {
		return shoyu;
	}

	public void setShoyu(int shoyu) {
		this.shoyu = shoyu;
	}

	public int getMiso() {
		return miso;
	}

	public void setMiso(int miso) {
		this.miso = miso;
	}

	public int getTonkotsu() {
		return tonkotsu;
	}

	public void setTonkotsu(int tonkotsu) {
		this.tonkotsu = tonkotsu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPayment_key() {
		return payment_key;
	}

	public void setPayment_key(String payment_key) {
		this.payment_key = payment_key;
	}

	public String getReservation_date() {
		return reservation_date.toString();
	}

	public void setReservation_date(LocalDate create_date) {
		this.reservation_date = create_date;
	}

	@Override
	public String toString() {
		return "ReservationDto [reservation_code=" + reservation_code + ", date=" + date + ", time=" + time + ", adult="
				+ adult + ", child=" + child + ", seat=" + seat + ", karaiRamen=" + karaiRamen + ", shoyu=" + shoyu
				+ ", miso=" + miso + ", tonkotsu=" + tonkotsu + ", price=" + price + ", payment_key=" + payment_key
				+ ", create_date=" + reservation_date + "]";
	}
}
