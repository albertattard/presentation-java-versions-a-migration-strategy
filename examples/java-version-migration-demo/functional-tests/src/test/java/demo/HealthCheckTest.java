package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
class HealthCheckTest {

    private static final String IMAGE_NAME = "app:local";
    private static final int APP_PORT = 8080;

    private final RestTemplate restTemplate = createRestTemplate();

    @Container
    private final GenericContainer<?> app = createAppContainer();

    @Test
    void returnStatusUp() {
        /* Given */
        assertTrue(app.isRunning());

        /* When */
        final ResponseEntity<HealthCheckResponse> response = actuatorHealth();

        /* Then */
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody(), HealthCheckResponse.of("UP"));
    }

    private ResponseEntity<HealthCheckResponse> actuatorHealth() {
        return restTemplate.getForEntity(address("actuator/health"), HealthCheckResponse.class);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class HealthCheckResponse {
        private String status;

        private static HealthCheckResponse of(final String status) {
            return new HealthCheckResponse(status);
        }
    }

    private String address(final String path) {
        return String.format("http://%s:%s/%s", app.getContainerIpAddress(), app.getMappedPort(APP_PORT), path);
    }

    private static GenericContainer<?> createAppContainer() {
        return new GenericContainer<>(IMAGE_NAME).withExposedPorts(APP_PORT);
    }

    private static RestTemplate createRestTemplate() {
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(Collections.singletonList(new MappingJackson2HttpMessageConverter()));
        return restTemplate;
    }
}
