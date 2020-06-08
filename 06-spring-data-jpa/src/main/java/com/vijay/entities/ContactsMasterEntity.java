package com.vijay.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contacts_master")
public class ContactsMasterEntity {

	@Id
	@Column(name = "Contact_Id")
	private Integer contactId;
	@Column(name = "Contact_Name")
	private String contactName;
	@Column(name = "Contact_Number")
	private long contactNumber;

}
