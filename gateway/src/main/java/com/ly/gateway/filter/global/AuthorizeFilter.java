package com.ly.gateway.filter.global;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author LY
 * @Title: com.ly.gateway.filter.global
 * @Description: 全局过滤器
 * @date 2023/5/6 17:28
 */
@Order(-1)
@Component
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 1.获取请求参数
        ServerHttpRequest request = exchange.getRequest();
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        // 2.获取参数中的authorization参数
        String authorization = queryParams.getFirst("authorization");
        // 3.判读参数值是否等于admmin
        if ("admin".equals(authorization)) {
            // 3.1.是，放行
            return chain.filter(exchange);
        }
        // 3.2.否，拦截
        // 3.2.1.设置状态码
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        // 3.2.2.拦截请求
        return exchange.getResponse().setComplete();
    }
}
