package springCoreConcept;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Hello World");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("studentConfig.xml");
        Student student1=(Student) context.getBean("student1");
        Student student2=(Student) context.getBean("student2");
        Student student3=(Student) context.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student1==student2);
	}

}
