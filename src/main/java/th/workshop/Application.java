package th.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by DellLaptop on 15/08/2015.
 */
@SpringBootApplication
public class Application {

    private Application(){
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

}
