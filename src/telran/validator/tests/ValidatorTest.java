package telran.validator.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.validator.tools.Validator;

class ValidatorTest {

	@Test
	void testCheckCreditCard() {
		assertTrue(Validator.checkCreditCard("12345678"));
		assertTrue(Validator.checkCreditCard("1234567890"));
		assertTrue(Validator.checkCreditCard("1234567890987654"));
		assertFalse(Validator.checkCreditCard("1234567"));
		assertFalse(Validator.checkCreditCard("12345678909876543"));
		assertFalse(Validator.checkCreditCard("123456789a987654"));
	}

	@Test
	void testCheckDateFormatEU() {

		assertTrue(Validator.checkDateFormatEU("20.02.2002"));
		assertFalse(Validator.checkDateFormatEU("33.02.2002"));
		assertFalse(Validator.checkDateFormatEU("20.13.2002"));
	}

	@Test
	void testCheckDateFormatUS() {
		assertTrue(Validator.checkDateFormatUS("2002-02-20"));
		assertFalse(Validator.checkDateFormatUS("2002-02-33"));
		assertFalse(Validator.checkDateFormatUS("2002-13-20"));
	}

	@Test
	void testCheckPhoneNumber() {
		assertTrue(Validator.checkPhoneNumber("+99(99)9999-9999"));
		assertFalse(Validator.checkPhoneNumber("1232134"));
	}

	@Test
	void testCheckLessEquals255() {
		assertTrue(Validator.checkLessEquals255("112"));
		assertTrue(Validator.checkLessEquals255("192"));
		assertFalse(Validator.checkLessEquals255("260"));
	}

}
