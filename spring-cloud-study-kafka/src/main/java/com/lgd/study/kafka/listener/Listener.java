package com.lgd.study.kafka.listener;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @program: spring-cloud-study
 * @description:
 * @author: lgd
 * @create: 2021-05-24 22:55
 **/
@Component
@Slf4j
public class Listener {


    @KafkaListener(topics = "${spring.kafka.topic}"
            ,groupId = "one"
        )
    public void listener(List<String> records) {

        for (String record : records) {
            processData(record);
        }

    }

    private void processData(String record) {
      log.info("consumer消费消息>>>>{}",record);

    }


}
