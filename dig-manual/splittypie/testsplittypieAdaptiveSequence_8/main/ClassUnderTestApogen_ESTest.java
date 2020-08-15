/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 15 03:32:32 GMT 2020
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
   * 14 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 3. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 4. main.ClassUnderTestApogen.cancelNewTransactionPage()V: Line 119
   * Goal 5. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 6. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 7. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 8. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 9. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 10. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 11. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 12. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 13. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 14. main.ClassUnderTestApogen.noConfirmDeletionPage()V: Line 262
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.CZK;
      Participants participants0 = Participants.MARK;
      Participants participants1 = Participants.MIKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      classUnderTestApogen0.cancelNewTransactionPage();
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames1 = TripNames.BARCELONA;
      TripNames tripNames2 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      Participants participants2 = Participants.MARCO;
      Participants participants3 = Participants.MIKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants2, participants3);
      classUnderTestApogen0.goToHomePageHomePage();
      TripNames tripNames3 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventHomePage(tripNames3);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
  }

  //Test case number: 1
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 3. main.ClassUnderTestApogen.closeAddTransactionPage()V: Line 532
   * Goal 4. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 5. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 6. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 9. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 10. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 11. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 12. main.ClassUnderTestApogen.quickAddAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 557
   * Goal 13. main.ClassUnderTestApogen.yesConfirmDeletionPage()V: Line 278
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      Participants participants0 = Participants.JOHN;
      Currencies currencies0 = Currencies.GBP;
      Participants participants1 = Participants.LUKE;
      TripNames tripNames1 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      Currencies currencies1 = Currencies.GBP;
      Participants participants2 = Participants.MARCO;
      classUnderTestApogen0.formNewEventPage(currencies1, participants2, participants0);
      classUnderTestApogen0.goToTransactionsHomePage();
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames2);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Participants participants3 = Participants.MIKE;
      classUnderTestApogen0.formNewEventPage(currencies1, participants3, participants1);
      classUnderTestApogen0.goToEditEventHomePage(tripNames2);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
      TripNames tripNames3 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames3);
      Participants participants4 = Participants.MARCO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants4);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToHomePageHomePage();
      TripNames tripNames4 = TripNames.ROME;
      classUnderTestApogen0.goToEditEventHomePage(tripNames4);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      TripNames tripNames5 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames5);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.closeAddTransactionPage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Transactions transactions0 = Transactions.SHOPPING;
      int int0 = (-3557);
      Price price0 = new Price(int0);
      Dates dates0 = Dates.FALL;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates0);
      TripNames tripNames6 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToEditEventHomePage(tripNames6);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
  }

  //Test case number: 2
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 2. main.ClassUnderTestApogen.deleteEditTransactionPage()V: Line 171
   * Goal 3. main.ClassUnderTestApogen.formEditTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Participants;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 195
   * Goal 4. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 5. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 6. main.ClassUnderTestApogen.goToEditTransactionPageTransactionsPage(Lcustom_classes/Id;)V: Line 496
   * Goal 7. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 8. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 9. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 10. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 11. main.ClassUnderTestApogen.noConfirmationTransactionPage()V: Line 231
   * Goal 12. main.ClassUnderTestApogen.quickAddAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 557
   * Goal 13. main.ClassUnderTestApogen.yesConfirmationTransactionPage()V: Line 247
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.EUR;
      Participants participants0 = Participants.MIKE;
      Participants participants1 = Participants.MARK;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Transactions transactions0 = Transactions.DISCO;
      int int0 = (-699);
      Price price0 = new Price(int0);
      Dates dates0 = Dates.SPRING;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates0);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Transactions transactions1 = Transactions.LUNCH;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions1, price0, dates0);
      classUnderTestApogen0.goToTransactionsHomePage();
      int int1 = (-1189);
      Id id0 = new Id(int1);
      classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      classUnderTestApogen0.deleteEditTransactionPage();
      classUnderTestApogen0.yesConfirmationTransactionPage();
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      classUnderTestApogen0.deleteEditTransactionPage();
      classUnderTestApogen0.noConfirmationTransactionPage();
      Transactions transactions2 = Transactions.SHOPPING;
      Participants participants2 = Participants.MIKE;
      classUnderTestApogen0.formEditTransactionPage(transactions2, participants2, price0, dates0);
      classUnderTestApogen0.goToTransactionsHomePage();
  }

  //Test case number: 3
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 2. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 3. main.ClassUnderTestApogen.formEditEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 309
   * Goal 4. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 5. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 6. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 9. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 10. main.ClassUnderTestApogen.goToHomePageIndexPage(Lcustom_classes/TripNames;)V: Line 404
   * Goal 11. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 12. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 13. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 14. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 15. main.ClassUnderTestApogen.noConfirmDeletionPage()V: Line 262
   * Goal 16. main.ClassUnderTestApogen.yesConfirmDeletionPage()V: Line 278
   * Goal 17. main.ClassUnderTestApogen.yesConfirmationPage()V: Line 45
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.BARCELONA;
      TripNames tripNames1 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      Currencies currencies0 = Currencies.PLN;
      Participants participants0 = Participants.JOHN;
      Participants participants1 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToIndexPageHomePage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.yesConfirmationPage();
      TripNames tripNames2 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames2);
      Currencies currencies1 = Currencies.PLN;
      Participants participants2 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies1, participants0, participants2);
      classUnderTestApogen0.goToTransactionsHomePage();
      TripNames tripNames3 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames3);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.cancelEditEventPage();
      TripNames tripNames4 = TripNames.ROME;
      classUnderTestApogen0.goToIndexPageHomePage();
      classUnderTestApogen0.goToHomePageIndexPage(tripNames4);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToEditEventHomePage(tripNames0);
      Participants participants3 = Participants.LUKE;
      classUnderTestApogen0.formEditEventPage(currencies0, participants3, participants0);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames3);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames3);
      classUnderTestApogen0.cancelNewEventPage();
  }

  //Test case number: 4
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 3. main.ClassUnderTestApogen.formNewTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Participants;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 138
   * Goal 4. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 5. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 6. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 7. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 8. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.CHF;
      Participants participants0 = Participants.MATTEO;
      Participants participants1 = Participants.JOHN;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      Transactions transactions0 = Transactions.DINNER;
      int int0 = (-784);
      Price price0 = new Price(int0);
      Dates dates0 = Dates.SPRING;
      classUnderTestApogen0.formNewTransactionPage(transactions0, participants0, price0, dates0);
      classUnderTestApogen0.goToIndexPageHomePage();
  }

  //Test case number: 5
  /*
   * 6 covered goals:
   * Goal 1. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 2. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 3. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 4. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 5. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 6. main.ClassUnderTestApogen.noConfirmationPage()V: Line 30
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.GBP;
      Participants participants0 = Participants.JOHN;
      Participants participants1 = Participants.MARK;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToIndexPageHomePage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.noConfirmationPage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.noConfirmationPage();
  }
}
