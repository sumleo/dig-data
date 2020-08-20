/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 19 22:13:39 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Addresses;
import custom_classes.Cities;
import custom_classes.FirstNames;
import custom_classes.LastNames;
import custom_classes.LongFirstNames;
import custom_classes.LongTelephones;
import main.ClassUnderTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTest_ESTest extends ClassUnderTest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTest.goToAddNewPetOwnerInformationContainerPage()V: Line 366
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 4. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarAddEditPetContainerPage()V: Line 240
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 7. main.ClassUnderTest.goToHomeThroughNavbarOwnersListContainerPage()V: Line 663
   * Goal 8. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 9. main.ClassUnderTest.goToOwnersListAddEditOwnerContainerPage()V: Line 555
   * Goal 10. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 11. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 12. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 13. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 14. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 15. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 16. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   * Goal 17. main.ClassUnderTest.searchFilterOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 745
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToOwnersListAddEditOwnerContainerPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      LastNames lastNames0 = LastNames.BLACK;
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.GEORGE;
      Addresses addresses0 = Addresses.LIBERTY;
      Cities cities0 = Cities.MCFARLAND;
      LongTelephones longTelephones0 = LongTelephones.PHONE3;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      FirstNames firstNames1 = FirstNames.GEORGE;
      classUnderTest0.searchFilterOwnersListContainerPage(firstNames1, lastNames0);
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      LastNames lastNames1 = LastNames.BLACK;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames1);
      classUnderTest0.goToAddNewPetOwnerInformationContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditPetContainerPage();
  }

  //Test case number: 1
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTest.goToEditOwnerOwnerInformationContainerPage()V: Line 380
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 4. main.ClassUnderTest.goToHomeThroughLogoVeterinariansContainerPage()V: Line 296
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 7. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 8. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 9. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 10. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 11. main.ClassUnderTest.goToVeterinariansOwnersListContainerPage()V: Line 714
   * Goal 12. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 13. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 14. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 15. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 16. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      LongTelephones longTelephones0 = LongTelephones.PHONE3;
      LongFirstNames longFirstNames0 = LongFirstNames.EDUARDO;
      LastNames lastNames0 = LastNames.FRANKLIN;
      Cities cities0 = Cities.WINDSOR;
      Addresses addresses0 = Addresses.FRIENDLY;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames0);
      classUnderTest0.goToEditOwnerOwnerInformationContainerPage();
  }

  //Test case number: 2
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTest.goToHomeThroughLogoAddEditOwnerContainerPage()V: Line 527
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 4. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 7. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 8. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 9. main.ClassUnderTest.goToOwnersListOwnersListContainerPage()V: Line 700
   * Goal 10. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 11. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 12. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 13. main.ClassUnderTest.goToVeterinariansOwnersListContainerPage()V: Line 714
   * Goal 14. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 15. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 16. main.ClassUnderTest.registerNewOwnerOwnerInformationContainerPage()V: Line 513
   * Goal 17. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 18. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 19. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.GEORGE;
      LastNames lastNames0 = LastNames.BLACK;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.MONONA;
      LongTelephones longTelephones0 = LongTelephones.PHONE3;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames0);
      classUnderTest0.registerNewOwnerOwnerInformationContainerPage();
  }

  //Test case number: 3
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.goToHomeThroughLogoAddEditOwnerContainerPage()V: Line 527
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoVeterinariansContainerPage()V: Line 296
   * Goal 4. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 7. main.ClassUnderTest.goToOwnersListAddEditOwnerContainerPage()V: Line 555
   * Goal 8. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 9. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 10. main.ClassUnderTest.registerNewOwnerAddEditOwnerContainerPage()V: Line 583
   * Goal 11. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 12. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToOwnersListAddEditOwnerContainerPage();
  }

  //Test case number: 4
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.goToHomeThroughLogoAddEditOwnerContainerPage()V: Line 527
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 4. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 6. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 7. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 8. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 9. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 10. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 11. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 12. main.ClassUnderTest.registerOwnerWithLongFirstNameAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 631
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.LONG;
      Cities cities0 = Cities.MONONA;
      LongTelephones longTelephones0 = LongTelephones.PHONE1;
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LastNames lastNames0 = LastNames.BLACK;
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      Addresses addresses0 = Addresses.CARDINAL;
      classUnderTest0.registerOwnerWithLongFirstNameAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
  }
}
