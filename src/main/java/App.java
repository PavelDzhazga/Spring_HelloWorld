import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        POJOCat cat = (POJOCat) applicationContext.getBean("cat");
        POJOCat cat2 = (POJOCat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

        System.out.println();

        System.out.println(bean == bean2);
        System.out.println(cat == cat2);
    }
}