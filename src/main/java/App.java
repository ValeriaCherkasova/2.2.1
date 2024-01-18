import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld.getMessage());
        HelloWorld beanHelloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld == beanHelloWorld2);

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat bean2Cat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat == bean2Cat);
    }
}