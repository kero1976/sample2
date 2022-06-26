package api2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SampleTest {

	@Test
	void testOK() {
		Sample sample = new Sample();
		assertThat(sample).isNotNull();
	}
}
