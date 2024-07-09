import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProtoTest {
    @Test
    void shouldNotHaveOneOfNoOptional() {
        assertTrue(Example.SearchRequest2.getDescriptor().getOneofs().isEmpty());
    }

    @Test
    void shouldNotHaveOneOfOptional() {
        // Is failing because of the optional field
        assertTrue(Example.SearchRequest.getDescriptor().getOneofs().isEmpty());
    }
}
