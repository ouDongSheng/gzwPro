package com.gzw.auth.controller;

//@Configuration
public class RouterFunctionConfiguration {
    private static final String ALLOWED_HEADERS = "blade-auth,	Content-Type,	Aut horization";
    private static final String ALLOWED_METHODS = "*";
    private static final String ALLOWED_ORIGIN = "*";
    private static final String ALLOWED_EXPOSE = "*";
    private static final String MAX_AGE = "18000L";

//    @Bean
//    public WebFilter corsFilter() {
//        return (ServerWebExchange ctx, WebFilterChain chain) -> {
//            ServerHttpRequest request = ctx.getRequest();
//            if (CorsUtils.isCorsRequest((HttpServletRequest)request)) {
//                ServerHttpResponse response = ctx.getResponse();
//                HttpHeaders headers = response.getHeaders();
//                headers.add("Access-Control-Allow-Headers", ALLOWED_HEADERS);
//                headers.add("Access-Control-Allow-Methods", ALLOWED_METHODS);
//                headers.add("Access-Control-Allow-Origin", ALLOWED_ORIGIN);
//                headers.add("Access-Control-Expose-Headers", ALLOWED_EXPOSE);
//                headers.add("Access-Control-Max-Age", MAX_AGE);
//                headers.add("Access-Control-Allow-Credentials", "true");
//                if (request.getMethod() == HttpMethod.OPTIONS) {
//                    response.setStatusCode(HttpStatus.OK);
//                    return Mono.empty();
//                }
//            }
//            return chain.filter(ctx);
//        };
//    }
}
