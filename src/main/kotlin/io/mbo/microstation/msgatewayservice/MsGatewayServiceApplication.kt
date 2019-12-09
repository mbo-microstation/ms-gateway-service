package io.mbo.microstation.msgatewayservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.cloud.netflix.zuul.EnableZuulServer

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
 class MsGatewayServiceApplication

fun main(args: Array<String>) {
	runApplication<MsGatewayServiceApplication>(*args)
}