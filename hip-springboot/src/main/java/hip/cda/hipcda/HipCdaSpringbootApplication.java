package hip.cda.hipcda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(value = "hip.cda.hipcda.mapper")
@SpringBootApplication
@EnableCaching
public class HipCdaSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HipCdaSpringbootApplication.class, args);
    }
}
