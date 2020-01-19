package com.herusantoso.apachecamel.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.camel.component.jms.JmsComponent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class ActiveMQConfig {

    @Value("${spring.activemq.broker-url}")
    private String brokerUrl;

    @Value("${queue.club}")
    private String clubQueue;

    @Value("${queue.indonesia_club}")
    private String indonesiaClubQueue;

    @Value("${queue.spain_club}")
    private String spainClubQueue;

    @Value("${queue.other_club}")
    private String otherClubQueue;

    @Bean
    public Queue clubQueue() {
        return new ActiveMQQueue(clubQueue);
    }

    @Bean
    public Queue indonesiaClubQueue() {
        return new ActiveMQQueue(indonesiaClubQueue);
    }

    @Bean
    public Queue spainClubQueue() {
        return new ActiveMQQueue(spainClubQueue);
    }

    @Bean
    public Queue otherClubQueue() {
        return new ActiveMQQueue(otherClubQueue);
    }

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setBrokerURL(brokerUrl);
        return factory;
    }

    @Bean
    public JmsComponent jms() {
        JmsComponent jms = new JmsComponent();
        jms.setConnectionFactory(activeMQConnectionFactory());
        return jms;
    }

}
