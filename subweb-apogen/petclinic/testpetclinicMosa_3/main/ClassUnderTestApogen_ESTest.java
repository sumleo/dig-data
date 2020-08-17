/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 17 14:09:27 GMT 2020
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
   * Goal 6. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 7. main.ClassUnderTestApogen.goToIndexVetsPage()V: Line 27
   * Goal 8. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 9. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 10. main.ClassUnderTestApogen.goToOwnersIndexPage()V: Line 232
   * Goal 11. main.ClassUnderTestApogen.goToVetsIndexPage()V: Line 246
   * Goal 12. main.ClassUnderTestApogen.goToVisitsOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 200
   * Goal 13. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 14. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToVetsIndexPage();
      classUnderTestApogen0.goToIndexVetsPage();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.HAROLD;
      LastNames lastNames0 = LastNames.BLACK;
      Addresses addresses0 = Addresses.LIBERTY;
      Cities cities0 = Cities.MADISON;
      Telephones telephones0 = Telephones.PHONE2;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      LastNames lastNames1 = LastNames.BLACK;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames1);
      PetNames petNames0 = PetNames.JEWEL;
      PetNames petNames1 = PetNames.BASIL;
      Dates dates0 = Dates.DATE3;
      PetTypes petTypes0 = PetTypes.DOG;
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      Dates dates1 = Dates.DATE4;
      classUnderTestApogen0.submitNewPetPage(petNames1, dates1, petTypes0);
      PetNames petNames2 = PetNames.BASIL;
      classUnderTestApogen0.goToEditPetThroghEditLinkOwnerInformationPage(petNames2);
      classUnderTestApogen0.submitNewPetPage(petNames0, dates1, petTypes0);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames3 = PetNames.ROSY;
      PetTypes petTypes1 = PetTypes.BIRD;
      classUnderTestApogen0.submitNewPetPage(petNames3, dates0, petTypes1);
      VisitDescriptions visitDescriptions0 = VisitDescriptions.FOUR;
      Dates dates2 = Dates.DATE4;
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      classUnderTestApogen0.submitNewPetPage(petNames1, dates2, petTypes1);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      FirstNames firstNames1 = FirstNames.EDUARDO;
      Cities cities1 = Cities.MCFARLAND;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames1, lastNames0, addresses0, cities1, telephones0);
      PetNames petNames4 = PetNames.ROSY;
      classUnderTestApogen0.goToVisitsOwnerInformationPage(petNames4);
      Dates dates3 = Dates.DATE3;
      classUnderTestApogen0.formVisitsPage(dates3, visitDescriptions0);
      PetNames petNames5 = PetNames.ROSY;
      classUnderTestApogen0.goToEditPetThroghEditLinkOwnerInformationPage(petNames5);
      PetNames petNames6 = PetNames.ROSY;
      classUnderTestApogen0.submitNewPetPage(petNames6, dates1, petTypes0);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      Addresses addresses1 = Addresses.CARDINAL;
      Cities cities2 = Cities.MONONA;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames0, lastNames1, addresses1, cities2, telephones0);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToOwnersIndexPage();
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 2. main.ClassUnderTestApogen.goToEditPetThroughNameOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 166
   * Goal 3. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 4. main.ClassUnderTestApogen.goToIndexWelcomePage()V: Line 311
   * Goal 5. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 6. main.ClassUnderTestApogen.goToNewOwnerWelcomePage()V: Line 325
   * Goal 7. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 8. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   * Goal 9. main.ClassUnderTestApogen.searchFilterOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 95
   * Goal 10. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 11. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.GEORGE;
      LastNames lastNames0 = LastNames.DAVIS;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.MONONA;
      Telephones telephones0 = Telephones.PHONE4;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames0);
      PetNames petNames0 = PetNames.BASIL;
      PetNames petNames1 = PetNames.LEO;
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      Dates dates0 = Dates.DATE1;
      PetTypes petTypes0 = PetTypes.CAT;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates0, petTypes0);
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames0);
      Dates dates1 = Dates.DATE1;
      PetTypes petTypes1 = PetTypes.HAMSTER;
      classUnderTestApogen0.submitNewPetPage(petNames1, dates1, petTypes1);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToIndexWelcomePage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToNewOwnerWelcomePage();
      FirstNames firstNames1 = FirstNames.BETTY;
      LastNames lastNames1 = LastNames.FRANKLIN;
      Cities cities1 = Cities.MADISON;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames1, lastNames1, addresses0, cities1, telephones0);
      FirstNames firstNames2 = FirstNames.GEORGE;
      classUnderTestApogen0.searchFilterOwnersPage(firstNames2, lastNames0);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToIndexWelcomePage()V: Line 311
   * Goal 2. main.ClassUnderTestApogen.goToOwnersWelcomePage()V: Line 339
   * Goal 3. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToIndexWelcomePage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToOwnersWelcomePage();
  }
}
