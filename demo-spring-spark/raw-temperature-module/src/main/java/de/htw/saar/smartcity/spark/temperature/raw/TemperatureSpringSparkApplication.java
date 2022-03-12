package de.htw.saar.smartcity.spark.temperature.raw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages =  {"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.raw"})
@EntityScan({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.raw"})
@EnableJpaRepositories({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.raw"})
public class TemperatureSpringSparkApplication {

    public static void main(String[] args) {

        SpringApplication.run(TemperatureSpringSparkApplication.class, args);
    }

}
