package com.s3.sb.camel.sbcamel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleCamelRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:hello?period={{timer.period}}").routeId("hello")
                .transform().method("someBean", "saySomething")
                .filter(simple("${body} contains 'AA'"))
                    .to("log:foo")
                .end()
                .to("log:out");
    }

}