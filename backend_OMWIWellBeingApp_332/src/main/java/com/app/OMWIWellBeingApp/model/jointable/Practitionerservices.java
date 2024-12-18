package com.app.OMWIWellBeingApp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.OMWIWellBeingApp.model.Service;
import com.app.OMWIWellBeingApp.model.Practitioner;
import com.app.OMWIWellBeingApp.model.Appointment;
import com.app.OMWIWellBeingApp.model.User;

@Entity(name = "Practitionerservices")
@Table(schema = "\"omwiwellbeingapp_733\"", name = "\"Practitionerservices\"")
@Data
public class Practitionerservices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PractitionerId\"")
	private String practitionerId;

    
    @Column(name = "\"ServiceId\"")
    private String serviceId;
 
}