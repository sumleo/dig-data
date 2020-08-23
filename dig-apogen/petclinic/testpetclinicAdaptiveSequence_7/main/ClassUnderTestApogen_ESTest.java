/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 22 17:48:31 GMT 2020
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
   * 8 covered goals:
   * Goal 1. main.ClassUnderTestApogen.editOwnerEditOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 297
   * Goal 2. main.ClassUnderTestApogen.goToEditOwnerOwnerInformationPage()V: Line 128
   * Goal 3. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 4. main.ClassUnderTestApogen.goToIndexVetsPage()V: Line 27
   * Goal 5. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 6. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 7. main.ClassUnderTestApogen.goToVetsIndexPage()V: Line 246
   * Goal 8. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      LastNames lastNames0 = LastNames.RODRIQUEZ;
      Addresses addresses0 = Addresses.FRIENDLY;
      Cities cities0 = Cities.MONONA;
      Telephones telephones0 = Telephones.PHONE4;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      FirstNames firstNames1 = FirstNames.EDUARDO;
      LastNames lastNames1 = LastNames.RODRIQUEZ;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames1);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      LastNames lastNames2 = LastNames.DAVIS;
      Addresses addresses1 = Addresses.COMMERCE;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames1, lastNames2, addresses1, cities0, telephones0);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToVetsIndexPage();
      classUnderTestApogen0.goToIndexVetsPage();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      LastNames lastNames3 = LastNames.DAVIS;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames1, lastNames3, addresses0, cities0, telephones0);
  }

  //Test case number: 1
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.formVisitsPage(Lcustom_classes/Dates;Lcustom_classes/VisitDescriptions;)V: Line 57
   * Goal 2. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 3. main.ClassUnderTestApogen.goToEditPetThroghEditLinkOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 145
   * Goal 4. main.ClassUnderTestApogen.goToNewOwnerWelcomePage()V: Line 325
   * Goal 5. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 6. main.ClassUnderTestApogen.goToVisitsOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 200
   * Goal 7. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   * Goal 8. main.ClassUnderTestApogen.searchFilterOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 95
   * Goal 9. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 10. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToNewOwnerWelcomePage();
      FirstNames firstNames0 = FirstNames.HAROLD;
      LastNames lastNames0 = LastNames.FRANKLIN;
      Addresses addresses0 = Addresses.FRIENDLY;
      Cities cities0 = Cities.WINDSOR;
      Telephones telephones0 = Telephones.PHONE3;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      FirstNames firstNames1 = FirstNames.HAROLD;
      classUnderTestApogen0.searchFilterOwnersPage(firstNames1, lastNames0);
      FirstNames firstNames2 = FirstNames.HAROLD;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames2, lastNames0);
      PetNames petNames0 = PetNames.ROSY;
      Dates dates0 = Dates.DATE1;
      VisitDescriptions visitDescriptions0 = VisitDescriptions.FOUR;
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetTypes petTypes0 = PetTypes.SNAKE;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates0, petTypes0);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames1 = PetNames.JEWEL;
      PetTypes petTypes1 = PetTypes.BIRD;
      classUnderTestApogen0.submitNewPetPage(petNames1, dates0, petTypes1);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames2 = PetNames.BASIL;
      Dates dates1 = Dates.DATE1;
      classUnderTestApogen0.submitNewPetPage(petNames2, dates1, petTypes0);
      classUnderTestApogen0.goToVisitsOwnerInformationPage(petNames0);
      Dates dates2 = Dates.DATE1;
      classUnderTestApogen0.formVisitsPage(dates2, visitDescriptions0);
      PetNames petNames3 = PetNames.BASIL;
      classUnderTestApogen0.goToEditPetThroghEditLinkOwnerInformationPage(petNames3);
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 2. main.ClassUnderTestApogen.goToEditPetThroughNameOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 166
   * Goal 3. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 4. main.ClassUnderTestApogen.goToIndexVetsPage()V: Line 27
   * Goal 5. main.ClassUnderTestApogen.goToIndexWelcomePage()V: Line 311
   * Goal 6. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 7. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 8. main.ClassUnderTestApogen.goToOwnersIndexPage()V: Line 232
   * Goal 9. main.ClassUnderTestApogen.goToVetsIndexPage()V: Line 246
   * Goal 10. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   * Goal 11. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 12. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToIndexWelcomePage();
      classUnderTestApogen0.goToVetsIndexPage();
      classUnderTestApogen0.goToIndexVetsPage();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      LastNames lastNames0 = LastNames.DAVIS;
      Addresses addresses0 = Addresses.LIBERTY;
      Cities cities0 = Cities.MADISON;
      Telephones telephones0 = Telephones.PHONE4;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames0);
      PetNames petNames0 = PetNames.JEWEL;
      Dates dates0 = Dates.DATE4;
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetTypes petTypes0 = PetTypes.HAMSTER;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates0, petTypes0);
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames0);
      Dates dates1 = Dates.DATE1;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates1, petTypes0);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToOwnersIndexPage();
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToIndexVetsPage()V: Line 27
   * Goal 2. main.ClassUnderTestApogen.goToOwnersWelcomePage()V: Line 339
   * Goal 3. main.ClassUnderTestApogen.goToVetsIndexPage()V: Line 246
   * Goal 4. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToVetsIndexPage();
      classUnderTestApogen0.goToIndexVetsPage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToOwnersWelcomePage();
  }
}
