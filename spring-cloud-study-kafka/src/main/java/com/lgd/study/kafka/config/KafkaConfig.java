//package com.lgd.study.kafka.config;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.config.KafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.listener.ContainerProperties;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @program: spring-cloud-study
// * @description:
// * @author: lgd
// * @create: 2021-05-24 22:27
// **/
//@Configuration
//public class KafkaConfig {
//
//    @Value("${spring.kafka.consumer.concurrent}")
//    Integer concurrent;
//
//    @Bean
//    public KafkaListenerContainerFactory<?> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, String> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        factory.setConcurrency(concurrent);
//        factory.setBatchListener(true);
//        factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
//        factory.getContainerProperties().setPollTimeout(30000);
//        return factory;
//    }
//    /**
//     * kafka消费配置
//     *
//     * @return
//     */
//    private Map<String, Object> consumerCrowdConfigs() {
//        Map<String, Object> propsMap = new HashMap<>();
//        return propsMap;
//    }
//    private ConsumerFactory<String, String> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(consumerCrowdConfigs());
//    }
//
//}
