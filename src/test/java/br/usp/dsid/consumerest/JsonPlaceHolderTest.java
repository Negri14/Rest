package br.usp.dsid.consumerest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JsonPlaceHolderTest {

	@Test
	void test() {
		JsonPlaceHolder jph = JsonPlaceHolder.builder().body("BD").build();
		System.out.println(jph);
	}

}
