package com.udea.lab2As;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.JsonNode;

@SpringBootTest
class Lab2AsApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health(){
		assertEquals("HEALTH CHECK OK", dataController.getHealth());
	}

	@Test
	void version(){
		assertEquals("VERSION IS 1.0.0", dataController.getVersion());
	}

	@Test
	void nationLength(){
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength(){
		Integer currenciesLength = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	public void testRandomCurrenciesCodeFormat(){
		DataController controller = new DataController();
		JsonNode response = controller.getRandomCurrencies();
		for(int i=0; i< response.size(); i++){
			JsonNode currency = response.get(i);
			String code = currency.get("code").asText();
			assertTrue(code.matches("[A-Z]{3}"));
		}
	}

	@Test
	public void testRandomNationsPerformance() {
		DataController controller = new DataController();
		long startTime = System.currentTimeMillis();

		controller.getRandomNations();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		assertTrue(executionTime < 2000);
	}

	@Test
	void aviationsLength(){
		Integer aviationsLength = dataController.getRandomAviations().size();
		assertEquals(20, aviationsLength);
	}


}
