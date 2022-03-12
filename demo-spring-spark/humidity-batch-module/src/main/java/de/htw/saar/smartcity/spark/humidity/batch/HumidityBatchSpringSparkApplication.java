package de.htw.saar.smartcity.spark.humidity.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages =  {"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.humidity.batch"})
@EntityScan({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.humidity.batch"})
@EnableJpaRepositories({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.humidity.batch"})
public class HumidityBatchSpringSparkApplication {

    public static void main(String[] args) {

        SpringApplication.run(HumidityBatchSpringSparkApplication.class, args);
    }

}
