package org.impelsys.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
//import javax.annotation.Resource;

@Component
@PropertySource("classpath:car.properties")

public class Car {
	@Value("${type1}")
	String type;
	@Value("${model1}")
	String model;
	
//	@Autowired //constructor injection
//	@Qualifier("fordEngine")
	
	Engine mustangEngine;
	
	@Autowired //constructor injection
	Car(Engine e){
		System.out.println("Inside Constructor: ");
		mustangEngine =e;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public Engine getMustangEngine() {
		return mustangEngine;
	}
	@Resource
	public void setMustangEngine(Engine mustangEngine) {
		this.mustangEngine = mustangEngine;
	}
	
	
	
}
