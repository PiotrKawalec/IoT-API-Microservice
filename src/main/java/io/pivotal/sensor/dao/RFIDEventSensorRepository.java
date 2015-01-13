package io.pivotal.sensor.dao;

import java.util.Date;

import io.pivotal.sensor.model.RFIDEvent;

import org.springframework.data.repository.CrudRepository;


public interface RFIDEventSensorRepository extends CrudRepository<RFIDEvent, Long> {


	Iterable<RFIDEvent> findByRfid(String rfid);
	
	Iterable<RFIDEvent> findByRfidAndEventTimeBetween(String rfid, Date startDate, Date endDate);
}
