package api;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ApiTest {

	@Test
	void testOK() {
		Api api = new Api();
		assertThat(api).isNotNull();
	}
}
