package com.app.OMWIWellBeingApp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.OMWIWellBeingApp.model.Service;
import com.app.OMWIWellBeingApp.model.Practitioner;
import com.app.OMWIWellBeingApp.model.Appointment;
import com.app.OMWIWellBeingApp.model.User;

@Entity(name = "Servicepractitioners")
@Table(schema = "\"omwiwellbeingapp_733\"", name = "\"Servicepractitioners\"")
@Data
public class Servicepractitioners{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ServiceId\"")
	private String serviceId;

    
    @Column(name = "\"AppointmentId\"")
    private String appointmentId;
 
}