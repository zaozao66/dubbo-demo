import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/provider.xml");
        System.out.println("start");
        context.start();
        System.out.println("finish");
        System.in.read(); // 按任意键退出
    }
}
