package demo;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//using new keyword - tight coupling
//		Doctor doctor = new Doctor("MBBS");
//		doctor.assist();
		
		//but we need loose coupling to remove dependency and also ease out unit testing (test in small components)
		//solution to this Spring Framework; 
		//we give control to spring to create objects and this called Inversion of Control and to apply this we use Dependency Injections
		
		
		//Spring will create all these objects/beans; Spring will load all the beans in the container 
		//from these container we can load these beans
		
		//DI via XML Configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");	
		
		Doctor doctor2 = context.getBean(Doctor.class);
		doctor2.assist();
//		System.out.println(doctor2.getQualification());	//setting the argument of object inside the spring.xml 
//		System.out.println(doctor2.getSpecialization());	//setting the property of object inside the spring.xml 
		
		Nurse nurse = (Nurse) context.getBean("nurse");  //getBean() can use both class name & id of the bean defined in spring.xml
		nurse.assist();
		
		Staff staff = (Staff) context.getBean("doctor");	//we can use interface also directly
		staff.assist();
		
		
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfig.class);

		Doctor doctor3 = (Doctor) context.getBean(Doctor.class);	//using java based configuration 
		doctor3.setQualification("MBBS");
		doctor3.assist();
		System.out.println(doctor3);
		
		
		Doctor doctor4 = (Doctor) context.getBean(Doctor.class);	//using java based configuration 
		//doctor4.setQualification("MBBS");
		doctor4.assist();
		System.out.println(doctor4);
		
				
	}

}
