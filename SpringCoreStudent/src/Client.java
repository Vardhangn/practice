import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		
		System.out.println(ctx.getBean("stud"));
//		System.out.println(ctx.getBean("stud2"));
	}

}
