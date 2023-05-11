package study.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalsTest {

  @Test
  @DisplayName("Must validate a maximum grade")
  void maximumGrade() {

    var actualMessage = Conditionals.validateApproval(10, 10);

    var expectedMessage = "WOW! CONGRATULATIONS! YOU ARE APPROVE!";

    assertEquals(expectedMessage, actualMessage);
  }
}