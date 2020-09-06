package lk.ijse.dep.pos.jpa;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan("lk.ijse.dep.pos.jpa")
@Import(JpaConfig.class)
public class AppConfig {

}
