package com.ctrip.framework.apollo.portal.component;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Joseph
 * @Created 2021/3/15 15:30
 */
@Configuration
public class RestTemplateConfig {

//    @Autowired
//    private HttpMessageConverters httpMessageConverters;
//    @Autowired
//    private PortalConfig portalConfig;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
//        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
//
//        RestTemplate restTemplate = new RestTemplate(httpMessageConverters.getConverters());
//        HttpComponentsClientHttpRequestFactory requestFactory =
//                new HttpComponentsClientHttpRequestFactory(httpClient);
//        requestFactory.setConnectTimeout(portalConfig.connectTimeout());
//        requestFactory.setReadTimeout(portalConfig.readTimeout());
//
//        restTemplate.setRequestFactory(requestFactory);
//        return restTemplate;
        return new RestTemplate();
    }
}
