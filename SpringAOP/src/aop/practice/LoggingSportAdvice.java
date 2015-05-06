package aop.practice;



import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingSportAdvice {
	final static Logger logger = Logger.getLogger(LoggingSportAdvice.class);
	
	@After("allSportObjectGetters()")
	public void loggingAdvice(){
//		System.out.println("Called before Sport object.");
		LoggingSportAdvice log = new LoggingSportAdvice();
		log.runMe("dom");
	}
	@Before("allSportObjectGetters()")
	public void secondAdvice(){
		System.out.println("Called again, before Sport object");
		
	}
	@Pointcut("execution(* get())")
	public void allSportObjectGetters(){}
	
	public void runMe(String parameter){
		 
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
 
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
 
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
 
	}

}
