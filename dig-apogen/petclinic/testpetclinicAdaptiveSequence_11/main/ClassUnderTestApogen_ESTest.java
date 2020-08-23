/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 22 18:30:28 GMT 2020
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
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.editOwnerEditOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 297
   * Goal 2. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 3. main.ClassUnderTestApogen.goToEditOwnerOwnerInformationPage()V: Line 128
   * Goal 4. main.ClassUnderTestApogen.goToEditPetThroghEditLinkOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 145
   * Goal 5. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 6. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 7. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 8. main.ClassUnderTestApogen.goToOwnersIndexPage()V: Line 232
   * Goal 9. main.ClassUnderTestApogen.searchFilterOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 95
   * Goal 10. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 11. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      LastNames lastNames0 = LastNames.DAVIS;
      Addresses addresses0 = Addresses.LIBERTY;
      Cities cities0 = Cities.MONONA;
      Telephones telephones0 = Telephones.PHONE4;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames0);
      Dates dates0 = Dates.DATE1;
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      FirstNames firstNames1 = FirstNames.EDUARDO;
      Addresses addresses1 = Addresses.CARDINAL;
      Telephones telephones1 = Telephones.PHONE4;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames1, lastNames0, addresses1, cities0, telephones1);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      Cities cities1 = Cities.WINDSOR;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames1, lastNames0, addresses0, cities1, telephones1);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames0 = PetNames.LEO;
      PetTypes petTypes0 = PetTypes.DOG;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates0, petTypes0);
      PetNames petNames1 = PetNames.LEO;
      classUnderTestApogen0.goToEditPetThroghEditLinkOwnerInformationPage(petNames1);
      PetNames petNames2 = PetNames.JEWEL;
      Dates dates1 = Dates.DATE1;
      PetTypes petTypes1 = PetTypes.DOG;
      classUnderTestApogen0.submitNewPetPage(petNames2, dates1, petTypes1);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToOwnersIndexPage();
      FirstNames firstNames2 = FirstNames.EDUARDO;
      classUnderTestApogen0.searchFilterOwnersPage(firstNames2, lastNames0);
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.formVisitsPage(Lcustom_classes/Dates;Lcustom_classes/VisitDescriptions;)V: Line 57
   * Goal 2. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 3. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 4. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 5. main.ClassUnderTestApogen.goToNewOwnerWelcomePage()V: Line 325
   * Goal 6. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 7. main.ClassUnderTestApogen.goToVisitsOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 200
   * Goal 8. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   * Goal 9. main.ClassUnderTestApogen.searchFilterOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 95
   * Goal 10. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 11. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToNewOwnerWelcomePage();
      FirstNames firstNames0 = FirstNames.HAROLD;
      LastNames lastNames0 = LastNames.BLACK;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.MADISON;
      Telephones telephones0 = Telephones.PHONE2;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      classUnderTestApogen0.searchFilterOwnersPage(firstNames0, lastNames0);
      LastNames lastNames1 = LastNames.BLACK;
      classUnderTestApogen0.searchFilterOwnersPage(firstNames0, lastNames1);
      FirstNames firstNames1 = FirstNames.HAROLD;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames1, lastNames0);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames0 = PetNames.ROSY;
      Dates dates0 = Dates.DATE4;
      PetTypes petTypes0 = PetTypes.LIZARD;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates0, petTypes0);
      classUnderTestApogen0.goToVisitsOwnerInformationPage(petNames0);
      VisitDescriptions visitDescriptions0 = VisitDescriptions.THREE;
      classUnderTestApogen0.formVisitsPage(dates0, visitDescriptions0);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetTypes petTypes1 = PetTypes.SNAKE;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates0, petTypes1);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames2 = FirstNames.BETTY;
      LastNames lastNames2 = LastNames.FRANKLIN;
      Cities cities1 = Cities.WINDSOR;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames2, lastNames2, addresses0, cities1, telephones0);
  }

  //Test case number: 2
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTestApogen.editOwnerEditOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 297
   * Goal 2. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 3. main.ClassUnderTestApogen.goToEditOwnerOwnerInformationPage()V: Line 128
   * Goal 4. main.ClassUnderTestApogen.goToEditPetThroughNameOwnerInformationPage(Lcustom_classes/PetNames;)V: Line 166
   * Goal 5. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 6. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 7. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 8. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.HAROLD;
      LastNames lastNames0 = LastNames.RODRIQUEZ;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.MONONA;
      Telephones telephones0 = Telephones.PHONE2;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      LastNames lastNames1 = LastNames.RODRIQUEZ;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames1);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      Cities cities1 = Cities.MADISON;
      Telephones telephones1 = Telephones.PHONE3;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames0, lastNames0, addresses0, cities1, telephones1);
      PetNames petNames0 = PetNames.BASIL;
      Dates dates0 = Dates.DATE1;
      PetTypes petTypes0 = PetTypes.LIZARD;
      PetNames petNames1 = PetNames.JEWEL;
      PetNames petNames2 = PetNames.BASIL;
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetTypes petTypes1 = PetTypes.CAT;
      classUnderTestApogen0.submitNewPetPage(petNames1, dates0, petTypes1);
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames1);
      Dates dates1 = Dates.DATE4;
      PetTypes petTypes2 = PetTypes.BIRD;
      classUnderTestApogen0.submitNewPetPage(petNames2, dates1, petTypes2);
      PetNames petNames3 = PetNames.BASIL;
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames3);
      PetNames petNames4 = PetNames.BASIL;
      PetNames petNames5 = PetNames.ROSY;
      Dates dates2 = Dates.DATE4;
      PetTypes petTypes3 = PetTypes.BIRD;
      classUnderTestApogen0.submitNewPetPage(petNames5, dates2, petTypes3);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      Dates dates3 = Dates.DATE1;
      classUnderTestApogen0.submitNewPetPage(petNames4, dates3, petTypes3);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      Addresses addresses1 = Addresses.COMMERCE;
      Cities cities2 = Cities.MCFARLAND;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames0, lastNames1, addresses1, cities2, telephones0);
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames5);
      classUnderTestApogen0.submitNewPetPage(petNames0, dates3, petTypes0);
      classUnderTestApogen0.goToEditPetThroughNameOwnerInformationPage(petNames0);
      classUnderTestApogen0.submitNewPetPage(petNames2, dates3, petTypes1);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      Dates dates4 = Dates.DATE1;
      classUnderTestApogen0.submitNewPetPage(petNames3, dates4, petTypes3);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
  }

  //Test case number: 3
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.editOwnerEditOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 297
   * Goal 2. main.ClassUnderTestApogen.goToEditOwnerOwnerInformationPage()V: Line 128
   * Goal 3. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 4. main.ClassUnderTestApogen.goToIndexVetsPage()V: Line 27
   * Goal 5. main.ClassUnderTestApogen.goToNewOwnerIndexPage()V: Line 218
   * Goal 6. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 7. main.ClassUnderTestApogen.goToOwnersIndexPage()V: Line 232
   * Goal 8. main.ClassUnderTestApogen.goToVetsIndexPage()V: Line 246
   * Goal 9. main.ClassUnderTestApogen.searchFilterOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 95
   * Goal 10. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToNewOwnerIndexPage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      LastNames lastNames0 = LastNames.FRANKLIN;
      Addresses addresses0 = Addresses.FRIENDLY;
      Cities cities0 = Cities.MONONA;
      Telephones telephones0 = Telephones.PHONE2;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      LastNames lastNames1 = LastNames.FRANKLIN;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames1);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToVetsIndexPage();
      classUnderTestApogen0.goToIndexVetsPage();
      classUnderTestApogen0.goToOwnersIndexPage();
      classUnderTestApogen0.searchFilterOwnersPage(firstNames0, lastNames1);
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames1);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToOwnersIndexPage();
      FirstNames firstNames1 = FirstNames.EDUARDO;
      classUnderTestApogen0.searchFilterOwnersPage(firstNames1, lastNames1);
      classUnderTestApogen0.searchFilterOwnersPage(firstNames0, lastNames0);
      classUnderTestApogen0.searchFilterOwnersPage(firstNames0, lastNames0);
      Telephones telephones1 = Telephones.PHONE1;
      FirstNames firstNames2 = FirstNames.EDUARDO;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames2, lastNames0);
      classUnderTestApogen0.goToEditOwnerOwnerInformationPage();
      FirstNames firstNames3 = FirstNames.HAROLD;
      LastNames lastNames2 = LastNames.RODRIQUEZ;
      Addresses addresses1 = Addresses.COMMERCE;
      Cities cities1 = Cities.WINDSOR;
      classUnderTestApogen0.editOwnerEditOwnerPage(firstNames3, lastNames2, addresses1, cities1, telephones1);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToVetsIndexPage();
      classUnderTestApogen0.goToIndexVetsPage();
      classUnderTestApogen0.goToOwnersIndexPage();
  }

  //Test case number: 4
  /*
   * 9 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToAddNewPetOwnerInformationPage()V: Line 114
   * Goal 2. main.ClassUnderTestApogen.goToIndexOwnerInformationPage()V: Line 185
   * Goal 3. main.ClassUnderTestApogen.goToIndexWelcomePage()V: Line 311
   * Goal 4. main.ClassUnderTestApogen.goToNewOwnerWelcomePage()V: Line 325
   * Goal 5. main.ClassUnderTestApogen.goToOwnerInformationOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 74
   * Goal 6. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   * Goal 7. main.ClassUnderTestApogen.searchFilterOwnersPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;)V: Line 95
   * Goal 8. main.ClassUnderTestApogen.submitNewPetPage(Lcustom_classes/PetNames;Lcustom_classes/Dates;Lcustom_classes/PetTypes;)V: Line 42
   * Goal 9. main.ClassUnderTestApogen.submitOwnerFormNewOwnerPage(Lcustom_classes/FirstNames;Lcustom_classes/LastNames;Lcustom_classes/Addresses;Lcustom_classes/Cities;Lcustom_classes/Telephones;)V: Line 279
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToNewOwnerWelcomePage();
      FirstNames firstNames0 = FirstNames.EDUARDO;
      LastNames lastNames0 = LastNames.FRANKLIN;
      Addresses addresses0 = Addresses.CARDINAL;
      Cities cities0 = Cities.WINDSOR;
      Telephones telephones0 = Telephones.PHONE2;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames0, addresses0, cities0, telephones0);
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames0, lastNames0);
      classUnderTestApogen0.goToAddNewPetOwnerInformationPage();
      PetNames petNames0 = PetNames.LEO;
      Dates dates0 = Dates.DATE1;
      PetTypes petTypes0 = PetTypes.CAT;
      classUnderTestApogen0.submitNewPetPage(petNames0, dates0, petTypes0);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToNewOwnerWelcomePage();
      LastNames lastNames1 = LastNames.FRANKLIN;
      classUnderTestApogen0.submitOwnerFormNewOwnerPage(firstNames0, lastNames1, addresses0, cities0, telephones0);
      LastNames lastNames2 = LastNames.FRANKLIN;
      classUnderTestApogen0.searchFilterOwnersPage(firstNames0, lastNames2);
      FirstNames firstNames1 = FirstNames.EDUARDO;
      classUnderTestApogen0.goToOwnerInformationOwnersPage(firstNames1, lastNames0);
      classUnderTestApogen0.goToIndexOwnerInformationPage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToIndexWelcomePage();
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToIndexVetsPage()V: Line 27
   * Goal 2. main.ClassUnderTestApogen.goToOwnersWelcomePage()V: Line 339
   * Goal 3. main.ClassUnderTestApogen.goToVetsIndexPage()V: Line 246
   * Goal 4. main.ClassUnderTestApogen.goToWelcomeIndexPage()V: Line 260
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToVetsIndexPage();
      classUnderTestApogen0.goToIndexVetsPage();
      classUnderTestApogen0.goToWelcomeIndexPage();
      classUnderTestApogen0.goToOwnersWelcomePage();
  }
}
