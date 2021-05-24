package com.lgd.study.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * @program: spring-cloud-study
 * @description:
 * @author: lgd
 * @create: 2021-05-24 22:49
 **/
@RestController
public class KafkaController {


    @Autowired
    KafkaTemplate kafkaTemplate;


    @GetMapping("kafka")
    public String hello(String msg) throws ExecutionException, InterruptedException {
        ListenableFuture future = kafkaTemplate.send("mytopic", msg);
        future.get();
        return "success";
    }


}
