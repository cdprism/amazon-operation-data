package org.shancm.advertisement;

import org.mybatis.spring.annotation.MapperScan;
import org.shancm.advertisement.bean.DruidDataSourceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(DruidDataSourceProperties.class)
@SpringBootApplication
@MapperScan("org/shancm/advertisement/mapper")
public class AdvertisementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvertisementApplication.class, args);
    }

}
