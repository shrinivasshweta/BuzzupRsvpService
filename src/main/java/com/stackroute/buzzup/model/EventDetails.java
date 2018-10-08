package com.stackroute.buzzup.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document
public class EventDetails {

	@Id
	String id;
	String emailId; 
	double creatorPhoneNo;
	String eventName;	
	Date startDate;
	String startTime;
	Date endDate;
	String endTime;
	String city;
	String location;
	String poster;
	String type;
	String description;
	int numberOfGuests;
	boolean isCompleted;
	String artist;
	String[] recipientEmail;

}
