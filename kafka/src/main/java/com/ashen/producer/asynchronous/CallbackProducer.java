package com.ashen.producer.asynchronous;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 250481
 * @date: 2021/05/27/18:08
 * @description:
 *      Producer API
 *      异步发送 API
 *      带回调函数的 API
 */
public class CallbackProducer {
    public static void main(String[] args) {
        //1.创建Kafka配置信息
        Properties properties = new Properties();

        //2.kafka 集群，broker-list
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.0.102:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        //9.创建生产者对象
        Producer<String, String> producer = new KafkaProducer<>(properties);

        //10.发送数据
        for (int i = 0; i < 10; i++) {
            producer.send(new ProducerRecord<>("first", "ashen", "hello"+i), new Callback() {
                //回调函数，该方法会在 Producer 收到 ack 时调用，为异步调用
                @Override
                public void onCompletion(RecordMetadata metadata,
                                         Exception exception) {
                    if (exception == null) {
                        System.out.println(metadata.partition()+"---"+metadata.offset());
                    } else {
                        exception.printStackTrace();
                    }
                }
            });
        }
        producer.close();

    }
}
