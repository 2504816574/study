package com.ashen.producer.synchronization;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.concurrent.ExecutionException;


/**
 * Created with IntelliJ IDEA.
 *
 * @author: 250481
 * @date: 2021/05/27/18:50
 * @description:
 *
 * Producer AP
 * 同步发送 API
 * 不带回调函数的 API
 */
public class SynchronousProducer {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Properties props = new Properties();
        //kafka 集群，broker-list
        props.put("bootstrap.servers", "192.168.0.102:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        Producer<String, String> producer = new KafkaProducer<>(props);

        for (int i = 0; i < 10; i++) {
            producer.send(new ProducerRecord<>("first", "hello--" + i)).get();

        }
        producer.close();

    }
}
