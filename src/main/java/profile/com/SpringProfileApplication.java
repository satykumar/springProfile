package profile.com;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileApplication implements CommandLineRunner{

    @Autowired
    private DataSource dataSource;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringProfileApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("dfatasource value"+dataSource);
        
    }
}
