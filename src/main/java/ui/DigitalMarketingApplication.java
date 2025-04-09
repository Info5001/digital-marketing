/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;

import com.github.javafaker.Faker;
import com.github.tomaslanger.chalk.Chalk;

import model.Business.Business;
import model.Business.ConfigureABusiness;

/**
 *
 * @author kal bugrara
 */
public class DigitalMarketingApplication {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    System.out.println(Chalk.on("Welcome to Digital Marketing Model!").bgMagenta().white());
    System.out.println(Chalk.on("You can use Chalk to color the output").bgRed().yellow());

    Business business = ConfigureABusiness.createABusinessAndLoadALotOfData("Amazon", 50, 10, 30,
        100,
        10);

  }
}
