package demo;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoControllerTest {

    @Test
    void returnAValidDemoResponse() {
        final PresentationController controller = new PresentationController();
        final ResponseEntity<PresentationResponse> response = controller.details();

        assertEquals(response.getBody(), PresentationResponse.of("Java versions - a migration strategy"));
    }
}
