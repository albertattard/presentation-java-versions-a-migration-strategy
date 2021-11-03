package demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentationController {

    @GetMapping("/")
    public ResponseEntity<PresentationResponse> details() {
        return ResponseEntity.ok(PresentationResponse.of("Java versions - a migration strategy"));
    }
}
