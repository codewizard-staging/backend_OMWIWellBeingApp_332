package com.app.OMWIWellBeingApp.function;

import com.app.OMWIWellBeingApp.model.Service;
import com.app.OMWIWellBeingApp.model.Practitioner;
import com.app.OMWIWellBeingApp.model.Appointment;
import com.app.OMWIWellBeingApp.model.User;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.OMWIWellBeingApp.repository.PractitionerRepository;
import com.app.OMWIWellBeingApp.repository.AppointmentRepository;
import com.app.OMWIWellBeingApp.repository.UserRepository;
import com.app.OMWIWellBeingApp.repository.ServiceRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
