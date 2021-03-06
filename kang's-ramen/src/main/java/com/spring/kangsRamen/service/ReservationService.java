package com.spring.kangsRamen.service;

import java.util.List;

import com.spring.kangsRamen.model.json.PaymentVo;
import com.spring.kangsRamen.model.json.ReservationVo;

public interface ReservationService {

	public int InsertReservation(ReservationVo reservationVo);
	public List<ReservationVo> getAllReservation(int id);
	public ReservationVo getOneReservation(int reservation_code);
	public int updateReservation(ReservationVo reservationVo);
	public int deleteReservation(int reservation_code);
	public int insertPayment(PaymentVo paymentVo);
	public int deletePayment(int reservation_code);
	public List<ReservationVo> getAllCanceledReservation(int id);
}
