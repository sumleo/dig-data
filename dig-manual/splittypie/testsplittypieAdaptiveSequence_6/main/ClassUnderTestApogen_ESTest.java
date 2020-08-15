/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 15 02:19:49 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Currencies;
import custom_classes.Dates;
import custom_classes.Id;
import custom_classes.Participants;
import custom_classes.Price;
import custom_classes.Transactions;
import custom_classes.TripNames;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.cancelEditTransactionPage()V: Line 156
   * Goal 3. main.ClassUnderTestApogen.cancelNewTransactionPage()V: Line 119
   * Goal 4. main.ClassUnderTestApogen.closeConfirmationTransactionPage()V: Line 215
   * Goal 5. main.ClassUnderTestApogen.deleteEditTransactionPage()V: Line 171
   * Goal 6. main.ClassUnderTestApogen.formEditEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 309
   * Goal 7. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 8. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 9. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 10. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 11. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 12. main.ClassUnderTestApogen.goToEditTransactionPageTransactionsPage(Lcustom_classes/Id;)V: Line 496
   * Goal 13. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 14. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 15. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 16. main.ClassUnderTestApogen.quickAddAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 557
   * Goal 17. main.ClassUnderTestApogen.yesConfirmDeletionPage()V: Line 278
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.EUR;
      Participants participants0 = Participants.JOHN;
      Participants participants1 = Participants.LUKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      TripNames tripNames1 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames1);
      Participants participants2 = Participants.MATTEO;
      classUnderTestApogen0.formEditEventPage(currencies0, participants2, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      classUnderTestApogen0.cancelNewTransactionPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Transactions transactions0 = Transactions.LUNCH;
      int int0 = 460;
      Price price0 = new Price(int0);
      Dates dates0 = Dates.WINTER;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates0);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      int int1 = (-453);
      Id id0 = new Id(int1);
      classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      classUnderTestApogen0.deleteEditTransactionPage();
      classUnderTestApogen0.closeConfirmationTransactionPage();
      classUnderTestApogen0.cancelEditTransactionPage();
      TripNames tripNames2 = TripNames.ROME;
      classUnderTestApogen0.goToEditEventHomePage(tripNames2);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
  }

  //Test case number: 1
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 3. main.ClassUnderTestApogen.cancelEditTransactionPage()V: Line 156
   * Goal 4. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 5. main.ClassUnderTestApogen.closeAddTransactionPage()V: Line 532
   * Goal 6. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 7. main.ClassUnderTestApogen.formNewTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Participants;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 138
   * Goal 8. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 9. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 10. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 11. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 12. main.ClassUnderTestApogen.goToEditTransactionPageTransactionsPage(Lcustom_classes/Id;)V: Line 496
   * Goal 13. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 14. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 15. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 16. main.ClassUnderTestApogen.quickAddAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 557
   * Goal 17. main.ClassUnderTestApogen.yesConfirmationPage()V: Line 45
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.BARCELONA;
      TripNames tripNames1 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames2 = TripNames.ROME;
      Currencies currencies0 = Currencies.BGN;
      Participants participants0 = Participants.MARCO;
      Participants participants1 = Participants.MATTEO;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      int int0 = 1518;
      Id id0 = new Id(int0);
      Price price0 = new Price(id0.value);
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Transactions transactions0 = Transactions.LUNCH;
      Dates dates0 = Dates.SPRING;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates0);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.closeAddTransactionPage();
      classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      classUnderTestApogen0.cancelEditTransactionPage();
      classUnderTestApogen0.goToIndexPageHomePage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.yesConfirmationPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames2);
      Participants participants2 = Participants.MIKE;
      Participants participants3 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants2, participants3);
      classUnderTestApogen0.goToEditEventHomePage(tripNames0);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.closeAddTransactionPage();
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames0);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      classUnderTestApogen0.formNewTransactionPage(transactions0, participants3, price0, dates0);
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 2. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 3. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 4. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 5. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 6. main.ClassUnderTestApogen.goToHomePageIndexPage(Lcustom_classes/TripNames;)V: Line 404
   * Goal 7. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 8. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 9. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 10. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 11. main.ClassUnderTestApogen.yesConfirmDeletionPage()V: Line 278
   * Goal 12. main.ClassUnderTestApogen.yesConfirmationPage()V: Line 45
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      TripNames tripNames1 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.EUR;
      Participants participants0 = Participants.JOHN;
      Participants participants1 = Participants.LUKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToIndexPageHomePage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.yesConfirmationPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      Currencies currencies1 = Currencies.RON;
      Participants participants2 = Participants.MARCO;
      Participants participants3 = Participants.MARK;
      classUnderTestApogen0.formNewEventPage(currencies1, participants2, participants3);
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames3 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToHomePageIndexPage(tripNames3);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames1);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      classUnderTestApogen0.cancelNewEventPage();
  }

  //Test case number: 3
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 2. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 3. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 4. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 5. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 6. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 7. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 8. main.ClassUnderTestApogen.noConfirmDeletionPage()V: Line 262
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames1 = TripNames.AMUSEMENT_PARK;
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      Currencies currencies0 = Currencies.BGN;
      Participants participants0 = Participants.MARK;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames3 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames3);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      Participants participants1 = Participants.LUKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      TripNames tripNames4 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames4);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * Goal 1. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 2. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 3. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 4. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 5. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 6. main.ClassUnderTestApogen.noConfirmationPage()V: Line 30
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.CHF;
      Participants participants0 = Participants.MARK;
      Participants participants1 = Participants.LUKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames1 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      Currencies currencies1 = Currencies.PLN;
      Participants participants2 = Participants.JOHN;
      classUnderTestApogen0.formNewEventPage(currencies1, participants1, participants2);
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames2 = TripNames.BARCELONA;
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames2);
      classUnderTestApogen0.noConfirmationPage();
  }
}
