package study.java;

import java.math.BigDecimal;

public class Conditionals {

  static String validateApproval(double gradeOne, double gradeTwo) {

    var gradeAverage = (gradeOne + gradeTwo) / 2;

    String msg = "";

    if (gradeAverage == 10) {

      msg = msg.concat("WOW! CONGRATULATIONS! YOU ARE APPROVE!");
    } else if(gradeAverage >= 7) {

      msg = msg.concat("Ok! YOU ARE APPROVE!");
    } else if(gradeAverage < 7) {

      msg = msg.concat("OH, YOU MUST RETAKE THE TESTS AGAIN");
    } else {

      msg = msg.concat("INVALID GRADES, PLESE INSERT VALIDS GRADES");
    }

    return msg;
  }
}
