/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 22 17:40:17 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Addresses;
import custom_classes.Cities;
import custom_classes.Dates;
import custom_classes.FirstNames;
import custom_classes.LastNames;
import custom_classes.PetNames;
import custom_classes.PetTypes;
import custom_classes.Telephones;
import custom_classes.VisitDescriptions;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTestApogen.editOwnerEditOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 297
   * Goal 2. main.ClassUnderTestApogen.formVisitsPage(Lcustom_classes/Dates;Lcustom_classes/VisitDescriptions;)V: Line 57
   * Goal 3. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 4. main.ClassUnderTestApogen.goToEditOwnerOwnerInformationPage()V: Line 128
   * Goal 5. main.ClassUnderTestApogen.goToEditPetThroghEditLinkOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 145
   * Goal 6. main.ClassUnderTestApogen.goToEditPetThroughNameOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 166
   * Goal 7. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 8. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 9. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 10. main.ClassUnderTestApogen.goToOwnersWelcomePage()V: Line 339
   * Goal 11. main.ClassUnderTestApogen.goToVisitsOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 200
   * Goal 12. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   * Goal 13. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 14. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      LastNames lastNames0 = LastNames.FRANKLIN;
      Addresses addresses0 = Addresses.COMMERCE;
      Cities cities0 = Cities.WINDSOR;
      Telephones telephones0 = Telephones.PHONE3;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      FirstNames firstNames1 = FirstNames.GEORGE;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames1, lastNames0);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames0 = PetNames.LEO;
      Dates dates0 = Dates.DATE1;
      PetTypes petTypes0 = PetTypes.DOG;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates0, petTypes0);
      classUnderTestApogen0.goToEditPetThroghEditLinkOwnerInformationPage(petNames0);
      Dates dates1 = Dates.DATE3;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates1, petTypes0);
      PetNames petNames1 = PetNames.ROSY;
      Dates dates2 = Dates.DATE4;
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames2 = PetNames.JEWEL;
      Dates dates3 = Dates.DATE1;
      PetTypes petTypes1 = PetTypes.HAMSTER;
      classUnderTestApogen0.submitNewPetPage(petNames2, dates3, petTypes1);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames3 = PetNames.JEWEL;
      classUnderTestApogen0.submitNewPetPage(petNames3, dates0, petTypes0);
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames2);
      Dates dates4 = Dates.DATE3;
      classUnderTestApogen0.submitNewPetPage(petNames1, dates4, petTypes1);
      PetNames petNames4 = PetNames.ROSY;
      classUnderTestApogen0.goToVisitsOwnerInformationPage(petNames4);
      Dates dates5 = Dates.DATE3;
      VisitDescriptions visitDescriptions0 = VisitDescriptions.TWO;
      classUnderTestApogen0.formVisitsPage(dates5, visitDescriptions0);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      FirstNames firstNames2 = FirstNames.BETTY;
      Addresses addresses1 = Addresses.LIBERTY;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames2, lastNames0, addresses1, cities0, telephones0);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      FirstNames firstNames3 = FirstNames.BETTY;
      Cities cities1 = Cities.MCFARLAND;
      Telephones telephones1 = Telephones.PHONE2;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames3, lastNames0, addresses1, cities1, telephones1);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames5 = PetNames.JEWEL;
      classUnderTestApogen0.submitNewPetPage(petNames5, dates0, petTypes0);
      classUnderTestApogen0.goToEditPetThroghEditLinkOwnerInformationPage(petNames3);
      PetNames petNames6 = PetNames.BASIL;
      PetTypes petTypes2 = PetTypes.BIRD;
      classUnderTestApogen0.submitNewPetPage(petNames6, dates2, petTypes2);
      classUnderTestApogen0.goToEditPetThroghEditLinkOwnerInformationPage(petNames2);
      PetNames petNames7 = PetNames.LEO;
      classUnderTestApogen0.submitNewPetPage(petNames7, dates5, petTypes0);
      PetNames petNames8 = PetNames.BASIL;
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames8);
      Dates dates6 = Dates.DATE4;
      classUnderTestApogen0.submitNewPetPage(petNames2, dates6, petTypes1);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      FirstNames firstNames4 = FirstNames.GEORGE;
      LastNames lastNames1 = LastNames.DAVIS;
      Addresses addresses2 = Addresses.LIBERTY;
      Cities cities2 = Cities.MCFARLAND;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames4, lastNames1, addresses2, cities2, telephones1);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToOwnersWelcomePage();
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToIndexVetsPage()V: Line 27
   * Goal 2. main.ClassUnderTestApogen.goToOwnersIndexPage()V: Line 232
   * Goal 3. main.ClassUnderTestApogen.goToVetsIndexPage()V: Line 246
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToVetsIndexPage();
      classUnderTestApogen0.goToIndexVetsPage();
      classUnderTestApogen0.goToOwnersIndexPage();
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToIndexWelcomePage()V: Line 311
   * Goal 2. main.ClassUnderTestApogen.goToOwnersIndexPage()V: Line 232
   * Goal 3. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToIndexWelcomePage();
      classUnderTestApogen0.goToOwnersIndexPage();
  }

  //Test case number: 3
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 2. main.ClassUnderTestApogen.goToEditPetThroughNameOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 166
   * Goal 3. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 4. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 5. main.ClassUnderTestApogen.goToNewOwnerWelcomePage()V: Line 325
   * Goal 6. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 7. main.ClassUnderTestApogen.goToOwnersWelcomePage()V: Line 339
   * Goal 8. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   * Goal 9. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 10. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToNewOwnerWelcomePage();
      FirstNames firstNames0 = FirstNames.BETTY;
      LastNames lastNames0 = LastNames.RODRIQUEZ;
      Addresses addresses0 = Addresses.LIBERTY;
      Cities cities0 = Cities.WINDSOR;
      Telephones telephones0 = Telephones.PHONE1;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      Dates dates0 = Dates.DATE1;
      FirstNames firstNames1 = FirstNames.BETTY;
      LastNames lastNames1 = LastNames.RODRIQUEZ;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames1, lastNames1);
      PetNames petNames0 = PetNames.ROSY;
      PetTypes petTypes0 = PetTypes.CAT;
      PetNames petNames1 = PetNames.LEO;
      Dates dates1 = Dates.DATE1;
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      Dates dates2 = Dates.DATE1;
      PetTypes petTypes1 = PetTypes.BIRD;
      classUnderTestApogen0.submitNewPetPage(petNames1, dates2, petTypes1);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      classUnderTestApogen0.submitNewPetPage(petNames0, dates1, petTypes1);
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames0);
      PetNames petNames2 = PetNames.LEO;
      classUnderTestApogen0.submitNewPetPage(petNames2, dates0, petTypes0);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames2 = FirstNames.EDUARDO;
      Addresses addresses1 = Addresses.FRIENDLY;
      Cities cities1 = Cities.MONONA;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames2, lastNames0, addresses1, cities1, telephones0);
      FirstNames firstNames3 = FirstNames.EDUARDO;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames3, lastNames0);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToOwnersWelcomePage();
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 2. main.ClassUnderTestApogen.searchFilterOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 95
   * Goal 3. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      LastNames lastNames0 = LastNames.DAVIS;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.WINDSOR;
      Telephones telephones0 = Telephones.PHONE4;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      FirstNames firstNames1 = FirstNames.EDUARDO;
      classUnderTestApogen0.searchFilterOwnersPage(firstNames1, lastNames0);
  }
}
