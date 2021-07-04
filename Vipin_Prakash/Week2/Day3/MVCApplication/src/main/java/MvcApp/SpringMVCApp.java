package MvcApp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMVCApp {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringMVCApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
