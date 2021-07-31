package com.ashen.interceptor;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 250481
 * @date: 2021/05/28/19:13
 * @description: producer 主程序
 */
public class InterceptorProducer {
    public static void main(String[] args) {
        //1.创建Kafka配置信息
        Properties properties = new Properties();

        //2.kafka 集群，broker-list
        properties.put("bootstrap.servers", "192.168.0.102:9092");

        //3.ack应答级别
        properties.put("acks", "all");

        //4.重试次数
        properties.put("retries", 1);

        //5.批次大小 16k
        properties.put("batch.size", 16384);

        //6.等待时间
        properties.put("linger.ms", 1);

        //7.RecordAccumulator 缓冲区大小
        properties.put("buffer.memory", 33554432);

        //8.key,value的序列化类
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        // 2 构建拦截链
        List<String> interceptors = new ArrayList<>();
        interceptors.add("com.ashen.interceptor.TimeInterceptor");
        interceptors.add("com.ashen.interceptor.CounterInterceptor");
        properties.put(ProducerConfig.INTERCEPTOR_CLASSES_CONFIG, interceptors);


        //9.创建生产者对象
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        //10.发送数据
        for (int i = 0; i < 10; i++) {
            producer.send(new ProducerRecord<>("first", "hello--" + i));
        }

        //11.关闭资源
        producer.close();
    }
}
