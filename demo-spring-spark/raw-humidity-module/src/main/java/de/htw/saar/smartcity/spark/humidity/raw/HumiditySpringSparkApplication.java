package de.htw.saar.smartcity.spark.humidity.raw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages =  {"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.humidity.raw"})
@EntityScan({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.humidity.raw"})
@EnableJpaRepositories({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.humidity.raw"})
public class HumiditySpringSparkApplication {

    public static void main(String[] args) {

        SpringApplication.run(HumiditySpringSparkApplication.class, args);
    }

}
