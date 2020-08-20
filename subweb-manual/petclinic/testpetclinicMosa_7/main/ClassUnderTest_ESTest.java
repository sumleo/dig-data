/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 19 21:41:31 GMT 2020
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
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.goToAddNewPetOwnerInformationContainerPage()V: Line 366
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 4. main.ClassUnderTest.goToHomeThroughLogoVeterinariansContainerPage()V: Line 296
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 7. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 8. main.ClassUnderTest.goToOwnersListAddEditPetContainerPage()V: Line 254
   * Goal 9. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 10. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 11. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 12. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LastNames lastNames0 = LastNames.RODRIQUEZ;
      Cities cities0 = Cities.MADISON;
      LongFirstNames longFirstNames0 = LongFirstNames.GEORGE;
      Addresses addresses0 = Addresses.LIBERTY;
      LongTelephones longTelephones0 = LongTelephones.PHONE1;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames0);
      classUnderTest0.goToAddNewPetOwnerInformationContainerPage();
      classUnderTest0.goToOwnersListAddEditPetContainerPage();
  }

  //Test case number: 1
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTest.goToEditOwnerOwnerInformationContainerPage()V: Line 380
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 4. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 6. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 7. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 8. main.ClassUnderTest.goToOwnersListOwnersListContainerPage()V: Line 700
   * Goal 9. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 10. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 11. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 12. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 13. main.ClassUnderTest.registerNewOwnerAddEditOwnerContainerPage()V: Line 583
   * Goal 14. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 15. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 16. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      LastNames lastNames0 = LastNames.FRANKLIN;
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.GEORGE;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.MONONA;
      LongTelephones longTelephones0 = LongTelephones.PHONE1;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      LongFirstNames longFirstNames1 = LongFirstNames.BETTY;
      LastNames lastNames1 = LastNames.FRANKLIN;
      Addresses addresses1 = Addresses.LIBERTY;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames1, lastNames1, addresses1, cities0, longTelephones0);
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames0 = FirstNames.BETTY;
      LastNames lastNames2 = LastNames.FRANKLIN;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames2);
      classUnderTest0.goToEditOwnerOwnerInformationContainerPage();
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
  }

  //Test case number: 2
  /*
   * 20 covered goals:
   * Goal 1. main.ClassUnderTest.goToHomeThroughLogoAddEditOwnerContainerPage()V: Line 527
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnerInformationContainerPage()V: Line 437
   * Goal 4. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 7. main.ClassUnderTest.goToHomeThroughNavbarOwnersListContainerPage()V: Line 663
   * Goal 8. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 9. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 10. main.ClassUnderTest.goToOwnersListAddEditOwnerContainerPage()V: Line 555
   * Goal 11. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 12. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 13. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 14. main.ClassUnderTest.goToVeterinariansOwnersListContainerPage()V: Line 714
   * Goal 15. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 16. main.ClassUnderTest.registerNewOwnerAddEditOwnerContainerPage()V: Line 583
   * Goal 17. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 18. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 19. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 20. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.BETTY;
      LastNames lastNames0 = LastNames.RODRIQUEZ;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.MONONA;
      LongTelephones longTelephones0 = LongTelephones.PHONE1;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToOwnersListAddEditOwnerContainerPage();
      FirstNames firstNames0 = FirstNames.BETTY;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames0);
      LongTelephones longTelephones1 = LongTelephones.PHONE2;
      classUnderTest0.goToHomeThroughLogoOwnerInformationContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      Cities cities1 = Cities.MONONA;
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      LongFirstNames longFirstNames1 = LongFirstNames.GEORGE;
      LastNames lastNames1 = LastNames.DAVIS;
      Addresses addresses1 = Addresses.CARDINAL;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames1, lastNames1, addresses1, cities1, longTelephones1);
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
  }

  //Test case number: 3
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTest.goToHomeThroughLogoAddEditOwnerContainerPage()V: Line 527
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughLogoOwnersListContainerPage()V: Line 649
   * Goal 4. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 6. main.ClassUnderTest.goToHomeThroughNavbarOwnerInformationContainerPage()V: Line 451
   * Goal 7. main.ClassUnderTest.goToHomeThroughNavbarOwnersListContainerPage()V: Line 663
   * Goal 8. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 9. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 10. main.ClassUnderTest.goToOwnersListOwnersListContainerPage()V: Line 700
   * Goal 11. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 12. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 13. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 14. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 15. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 16. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 17. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarOwnersListContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LastNames lastNames0 = LastNames.BLACK;
      Cities cities0 = Cities.WINDSOR;
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.EDUARDO;
      LastNames lastNames1 = LastNames.BLACK;
      Addresses addresses0 = Addresses.FRIENDLY;
      LongTelephones longTelephones0 = LongTelephones.PHONE2;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames1, addresses0, cities0, longTelephones0);
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames1);
      classUnderTest0.goToHomeThroughNavbarOwnerInformationContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames0);
  }

  //Test case number: 4
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTest.goToHomeThroughLogoAddEditOwnerContainerPage()V: Line 527
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 3. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 4. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 6. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 7. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 8. main.ClassUnderTest.goToOwnersListOwnersListContainerPage()V: Line 700
   * Goal 9. main.ClassUnderTest.goToOwnersListVeterinariansContainerPage()V: Line 324
   * Goal 10. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 11. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 12. main.ClassUnderTest.goToVeterinariansOwnerInformationContainerPage()V: Line 479
   * Goal 13. main.ClassUnderTest.goToVeterinariansOwnersListContainerPage()V: Line 714
   * Goal 14. main.ClassUnderTest.registerNewOwnerAddEditOwnerContainerPage()V: Line 583
   * Goal 15. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 16. main.ClassUnderTest.registerNewOwnerOwnersListContainerPage()V: Line 728
   * Goal 17. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 18. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   * Goal 19. main.ClassUnderTest.searchFilterOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 745
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      LastNames lastNames0 = LastNames.FRANKLIN;
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.GEORGE;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.MADISON;
      LongTelephones longTelephones0 = LongTelephones.PHONE3;
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      Cities cities1 = Cities.MONONA;
      LongTelephones longTelephones1 = LongTelephones.PHONE1;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities1, longTelephones1);
      classUnderTest0.goToOwnersListOwnersListContainerPage();
      FirstNames firstNames1 = FirstNames.GEORGE;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames1, lastNames0);
      classUnderTest0.goToVeterinariansOwnerInformationContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      LongFirstNames longFirstNames1 = LongFirstNames.EDUARDO;
      LastNames lastNames1 = LastNames.FRANKLIN;
      Addresses addresses1 = Addresses.COMMERCE;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames1, lastNames1, addresses1, cities0, longTelephones0);
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      classUnderTest0.searchFilterOwnersListContainerPage(firstNames0, lastNames1);
      classUnderTest0.registerNewOwnerOwnersListContainerPage();
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToOwnersListVeterinariansContainerPage();
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames1, lastNames0);
  }

  //Test case number: 5
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.goToHomeThroughLogoAddEditOwnerContainerPage()V: Line 527
   * Goal 2. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 3. main.ClassUnderTest.goToOwnerInformationOwnersListContainerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 681
   * Goal 4. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 5. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 6. main.ClassUnderTest.goToVeterinariansOwnersListContainerPage()V: Line 714
   * Goal 7. main.ClassUnderTest.goToVeterinariansVeterinariansContainerPage()V: Line 338
   * Goal 8. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 9. main.ClassUnderTest.registerNewOwnerOwnerInformationContainerPage()V: Line 513
   * Goal 10. main.ClassUnderTest.registerNewOwnerVeterinariansContainerPage()V: Line 352
   * Goal 11. main.ClassUnderTest.registerOwnerAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 605
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToOwnersListHomeContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.EDUARDO;
      Addresses addresses0 = Addresses.LIBERTY;
      LongTelephones longTelephones0 = LongTelephones.PHONE3;
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughLogoAddEditOwnerContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LastNames lastNames0 = LastNames.RODRIQUEZ;
      Cities cities0 = Cities.WINDSOR;
      classUnderTest0.registerOwnerAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses0, cities0, longTelephones0);
      classUnderTest0.goToVeterinariansOwnersListContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToVeterinariansVeterinariansContainerPage();
      classUnderTest0.registerNewOwnerVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      LastNames lastNames1 = LastNames.RODRIQUEZ;
      classUnderTest0.goToOwnerInformationOwnersListContainerPage(firstNames0, lastNames1);
      classUnderTest0.registerNewOwnerOwnerInformationContainerPage();
  }

  //Test case number: 6
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.goToHomeThroughLogoHomeContainerPage()V: Line 27
   * Goal 2. main.ClassUnderTest.goToHomeThroughLogoVeterinariansContainerPage()V: Line 296
   * Goal 3. main.ClassUnderTest.goToHomeThroughNavbarAddEditOwnerContainerPage()V: Line 541
   * Goal 4. main.ClassUnderTest.goToHomeThroughNavbarHomeContainerPage()V: Line 41
   * Goal 5. main.ClassUnderTest.goToHomeThroughNavbarVeterinariansContainerPage()V: Line 310
   * Goal 6. main.ClassUnderTest.goToOwnersListHomeContainerPage()V: Line 55
   * Goal 7. main.ClassUnderTest.goToVeterinariansAddEditOwnerContainerPage()V: Line 569
   * Goal 8. main.ClassUnderTest.goToVeterinariansHomeContainerPage()V: Line 69
   * Goal 9. main.ClassUnderTest.registerNewOwnerAddEditOwnerContainerPage()V: Line 583
   * Goal 10. main.ClassUnderTest.registerNewOwnerHomeContainerPage()V: Line 83
   * Goal 11. main.ClassUnderTest.registerOwnerWithLongFirstNameAddEditOwnerContainerPage(Lcustom_classes/LongFirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/LongTelephones;)V: Line 631
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LongFirstNames longFirstNames0 = LongFirstNames.LONG;
      LastNames lastNames0 = LastNames.DAVIS;
      Addresses addresses0 = Addresses.COMMERCE;
      Addresses addresses1 = Addresses.LIBERTY;
      Cities cities0 = Cities.MADISON;
      Cities cities1 = Cities.MADISON;
      LongTelephones longTelephones0 = LongTelephones.PHONE2;
      classUnderTest0.registerOwnerWithLongFirstNameAddEditOwnerContainerPage(longFirstNames0, lastNames0, addresses1, cities1, longTelephones0);
      classUnderTest0.registerNewOwnerAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughNavbarAddEditOwnerContainerPage();
      classUnderTest0.registerNewOwnerHomeContainerPage();
      LastNames lastNames1 = LastNames.BLACK;
      LongTelephones longTelephones1 = LongTelephones.PHONE3;
      classUnderTest0.registerOwnerWithLongFirstNameAddEditOwnerContainerPage(longFirstNames0, lastNames1, addresses0, cities0, longTelephones1);
      classUnderTest0.goToVeterinariansAddEditOwnerContainerPage();
      classUnderTest0.goToHomeThroughLogoVeterinariansContainerPage();
      classUnderTest0.goToVeterinariansHomeContainerPage();
      classUnderTest0.goToHomeThroughNavbarVeterinariansContainerPage();
      classUnderTest0.goToHomeThroughNavbarHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToHomeThroughLogoHomeContainerPage();
      classUnderTest0.goToOwnersListHomeContainerPage();
  }
}
