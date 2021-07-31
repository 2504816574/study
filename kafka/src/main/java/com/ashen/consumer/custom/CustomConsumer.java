package com.ashen.consumer.custom;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 250481
 * @date: 2021/05/28/16:34
 * @description: 自定义提交offset
 */
public class CustomConsumer {

    private static Map<TopicPartition, Long> currentOffset = new HashMap<>();

    public static void main(String[] args) {
        Properties properties = new Properties();
        //连接的集群
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.0.101:9092");

        //开启自动提交
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");


        //key.value的反序列化
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");

        //消费者组
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "bigdata");

        //创建一个消费者
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        //消费者订阅主题
        consumer.subscribe(Arrays.asList("first"), new ConsumerRebalanceListener() {

            //该方法会在 Rebalance 之前调用
            @Override
            public void
            onPartitionsRevoked(Collection<TopicPartition> partitions) {
                commitOffset(currentOffset);
            }

            //该方法会在 Rebalance 之后调用
            @Override
            public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
                currentOffset.clear();
                for (TopicPartition partition : partitions) {
                    consumer.seek(partition, getOffset(partition));
                    //定位到最近提交的 offset 位置继续消费
                }
            }
        });
        while (true) {
            //消费者拉取数据
            ConsumerRecords<String, String> records = consumer.poll(100);

            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("offset = %d, key = %s, value = % s % n ", record.offset(), record.key(), record.value());
                currentOffset.put(new TopicPartition(record.topic(),
                        record.partition()), record.offset());
            }
            //异步提交
            commitOffset(currentOffset);
        }
    }

    //获取某分区的最新 offset
    private static long getOffset(TopicPartition partition) {
        return 0;
    }

    //提交该消费者所有分区的 offset
    private static void commitOffset(Map<TopicPartition, Long> currentOffset) {
    }

}

