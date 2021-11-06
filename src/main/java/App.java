import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld message1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(message1.getMessage());
        HelloWorld message2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(message2.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getName());
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getName());

        System.out.println(message1 == message2);
        System.out.println(cat1 == cat2);
    }
}