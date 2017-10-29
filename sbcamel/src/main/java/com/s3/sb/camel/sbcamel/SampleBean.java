package com.s3.sb.camel.sbcamel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("someBean")
public class SampleBean {

    @Value("${greeting}")
    private String say;

    public String saySomething() {
        return say;
    }

	@Override
	public String toString() {
		return "SampleBean [say=" + say + "]";
	}

}