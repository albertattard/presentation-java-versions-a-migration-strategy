package demo;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PresentationResponse {

    String description;

    public static PresentationResponse of(final String description) {
        return new PresentationResponse(description);
    }
}
