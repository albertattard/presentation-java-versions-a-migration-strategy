package demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppointmentTest {

    @Test
    void parseAppointmentDate() throws IOException {
        final String json = "{\"date\": \"2077-04-27T12:34:56Z\"}";

        final ObjectMapper mapper = new ObjectMapper()
                .registerModule(new JavaTimeModule());
        final Appointment appointment = mapper.readValue(json, Appointment.class);

        final LocalDateTime date = LocalDateTime.of(2077, 4, 27, 12, 34, 56);
        final Appointment expected = Appointment.builder()
                .date(date.atOffset(ZoneOffset.UTC)).build();
        assertEquals(expected, appointment);
    }
}
