package com.ashen.consumer.automatically;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 250481
 * @date: 2021/05/28/9:04
 * @description: 自动提交 offset
 */
public class AutoSubmit {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //连接的集群
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.0.101:9092");


        //开启自动提交
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");

        //自动提交的延迟
        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");


        //key.value的反序列化
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringDeserializer");

        //消费者组
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "bigdata");

        //重置消费者offset
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);

        //订阅主题
        kafkaConsumer.subscribe(Arrays.asList("first", "second"));

        //获取数据
        ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(100);


        while (true) {
            //解析并打印
            for (ConsumerRecord<String, String> consumerRecord : consumerRecords) {
                System.out.println(consumerRecord.key() + "----" + consumerRecord.value());
            }

        }
    }
}



