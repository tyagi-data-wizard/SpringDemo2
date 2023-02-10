package demo;

import java.lang.invoke.StringConcatFactory;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
	
	private String qualification;
//	private String specialization;
//	
//
	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
//
//
//	public Doctor(String qualification) {
//		//super();
//		this.qualification = qualification;
//	}
//
//
//	public String getSpecialization() {
//		return specialization;
//	}
//
//
//	public void setSpecialization(String specialization) {
//		this.specialization = specialization;
//	}


	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}


	public void assist() {
		System.out.println("Doctor is assisting");
	}

	//this will be called as soon as the bean is created; this modifies the behavior of the lifecycle
	public void setBeanName(String name) {
		System.out.println("Set Bean Method is called");
		
	}
	
	
	
	
	
	@PostConstruct
	public void postConstruct()
	{
		System.out.println("Post Construct method is called");
	}
}
