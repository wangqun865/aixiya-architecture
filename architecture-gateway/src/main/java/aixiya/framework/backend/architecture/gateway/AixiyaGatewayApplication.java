package aixiya.framework.backend.architecture.gateway;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author wangqun865@163.com
 */
@SpringBootApplication
public class AixiyaGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AixiyaGatewayApplication.class)
                .web(WebApplicationType.REACTIVE)
                .run(args);
    }
}
