package de.htw.saar.smartcity.spark.temperature.raw;

import com.google.common.collect.Lists;
import de.htw.saar.smartcity.aggregator.lib.handler.RawMeasurementHandler;
import de.htw.saar.smartcity.aggregator.lib.model.SensorMeasurement;
import de.htw.saar.smartcity.aggregator.lib.properties.SparkBasicApplicationProperties;
import de.htw.saar.smartcity.aggregator.lib.spark.RawSparkKafkaRunner;
import org.apache.arrow.flatbuf.Bool;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Component
public class SparkKafka extends RawSparkKafkaRunner {

    public SparkKafka(SparkBasicApplicationProperties applicationProperties, JavaStreamingContext jsc, RawMeasurementHandler rawMeasurementHandler) {
        super(applicationProperties, jsc, rawMeasurementHandler);
    }

    @Override
    protected String getKafkaGroupId() {
        return "SPARK_RAW_TEMPERATURE_GROUP";
    }
}
