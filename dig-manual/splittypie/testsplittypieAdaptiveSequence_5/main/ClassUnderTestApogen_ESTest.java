/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 15 01:41:46 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 3. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 4. main.ClassUnderTestApogen.formNewTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Participants;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 138
   * Goal 5. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 6. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 9. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 10. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 11. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 12. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 13. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.CZK;
      Participants participants0 = Participants.LUKE;
      Participants participants1 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      TripNames tripNames1 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventHomePage(tripNames1);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      Transactions transactions0 = Transactions.MUSEUM;
      int int0 = 2636;
      Price price0 = new Price(int0);
      Dates dates0 = Dates.FALL;
      classUnderTestApogen0.formNewTransactionPage(transactions0, participants0, price0, dates0);
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      Currencies currencies1 = Currencies.EUR;
      Participants participants2 = Participants.MIKE;
      classUnderTestApogen0.formNewEventPage(currencies1, participants2, participants0);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames1);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      TripNames tripNames3 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames3);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
  }

  //Test case number: 1
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelEditTransactionPage()V: Line 156
   * Goal 2. main.ClassUnderTestApogen.closeAddTransactionPage()V: Line 532
   * Goal 3. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 4. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 5. main.ClassUnderTestApogen.goToEditTransactionPageTransactionsPage(Lcustom_classes/Id;)V: Line 496
   * Goal 6. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 7. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 8. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 9. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 10. main.ClassUnderTestApogen.quickAddAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 557
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.CZK;
      Participants participants0 = Participants.LUKE;
      Participants participants1 = Participants.MARK;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.closeAddTransactionPage();
      Currencies currencies1 = Currencies.CHF;
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Transactions transactions0 = Transactions.LUNCH;
      int int0 = (-519);
      Price price0 = new Price(int0);
      Dates dates0 = Dates.SUMMER;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates0);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      int int1 = 583;
      Id id0 = new Id(int1);
      classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      classUnderTestApogen0.cancelEditTransactionPage();
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames1 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      Participants participants2 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies1, participants1, participants2);
      classUnderTestApogen0.goToTransactionsHomePage();
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 2. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 3. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 4. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 5. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 6. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 7. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 8. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 9. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 10. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 11. main.ClassUnderTestApogen.quickAddAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 557
   * Goal 12. main.ClassUnderTestApogen.yesConfirmDeletionPage()V: Line 278
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      Participants participants0 = Participants.MARCO;
      int int0 = (-335);
      Price price0 = new Price(int0);
      Dates dates0 = Dates.FALL;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.RUB;
      Participants participants1 = Participants.LUKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants1, participants0);
      TripNames tripNames1 = TripNames.ROME;
      Currencies currencies1 = Currencies.EUR;
      Participants participants2 = Participants.LUKE;
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Transactions transactions0 = Transactions.DISCO;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates0);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Dates dates1 = Dates.FALL;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates1);
      classUnderTestApogen0.goToTransactionsHomePage();
      TripNames tripNames2 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames2);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
      TripNames tripNames3 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames3);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames4 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames4);
      Participants participants3 = Participants.MARK;
      classUnderTestApogen0.formNewEventPage(currencies1, participants3, participants2);
      classUnderTestApogen0.goToIndexPageHomePage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
  }

  //Test case number: 3
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 3. main.ClassUnderTestApogen.cancelNewTransactionPage()V: Line 119
   * Goal 4. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 5. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 6. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 9. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 10. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 11. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 12. main.ClassUnderTestApogen.noConfirmDeletionPage()V: Line 262
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.ROME;
      TripNames tripNames1 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      Currencies currencies0 = Currencies.BGN;
      Participants participants0 = Participants.LUKE;
      Participants participants1 = Participants.MARCO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToEditEventHomePage(tripNames0);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      classUnderTestApogen0.cancelNewTransactionPage();
      TripNames tripNames2 = TripNames.ROME;
      classUnderTestApogen0.goToEditEventHomePage(tripNames2);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames3 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames3);
      Currencies currencies1 = Currencies.BGN;
      Participants participants2 = Participants.MATTEO;
      Participants participants3 = Participants.MIKE;
      classUnderTestApogen0.formNewEventPage(currencies1, participants2, participants3);
      classUnderTestApogen0.goToTransactionsHomePage();
  }

  //Test case number: 4
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 2. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 3. main.ClassUnderTestApogen.closeAddTransactionPage()V: Line 532
   * Goal 4. main.ClassUnderTestApogen.formEditEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 309
   * Goal 5. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 6. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 9. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 10. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 11. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      TripNames tripNames1 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      Currencies currencies0 = Currencies.CHF;
      Participants participants0 = Participants.LUKE;
      Participants participants1 = Participants.MARCO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames0);
      classUnderTestApogen0.cancelEditEventPage();
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToEditEventHomePage(tripNames2);
      Currencies currencies1 = Currencies.RON;
      Participants participants2 = Participants.MARK;
      Participants participants3 = Participants.MIKE;
      classUnderTestApogen0.formEditEventPage(currencies1, participants2, participants3);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.closeAddTransactionPage();
  }

  //Test case number: 5
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 2. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 3. main.ClassUnderTestApogen.closeAddTransactionPage()V: Line 532
   * Goal 4. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 5. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 6. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 9. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 10. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 11. main.ClassUnderTestApogen.yesConfirmationPage()V: Line 45
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.RON;
      Participants participants0 = Participants.MIKE;
      Participants participants1 = Participants.JOHN;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames1 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      classUnderTestApogen0.cancelNewEventPage();
      Participants participants2 = Participants.MARCO;
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.yesConfirmationPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      Participants participants3 = Participants.LUKE;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies1 = Currencies.CZK;
      classUnderTestApogen0.formNewEventPage(currencies1, participants2, participants3);
      classUnderTestApogen0.goToEditEventHomePage(tripNames2);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.closeAddTransactionPage();
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 2. main.ClassUnderTestApogen.goToHomePageIndexPage(Lcustom_classes/TripNames;)V: Line 404
   * Goal 3. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 4. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.RON;
      Participants participants0 = Participants.LUKE;
      Participants participants1 = Participants.MIKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToIndexPageHomePage();
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToHomePageIndexPage(tripNames0);
      } catch(IllegalStateException e) {
         //
         // HomePage not loaded properly
         //
         //verifyException("po_apogen.HomePage", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventHomePage(tripNames0);
      } catch(RuntimeException e) {
         //
         // goToEditEventHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Currencies currencies1 = Currencies.CZK;
      Participants participants2 = Participants.JOHN;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formEditEventPage(currencies1, participants2, participants1);
      } catch(RuntimeException e) {
         //
         // formEditEventPage: expected po_apogen.EditEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id=\"navbar-right\"]//a[@title=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelNewEventPage();
      } catch(RuntimeException e) {
         //
         // cancelNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //section[@id=\"about\"]//a[text()=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      Participants participants3 = Participants.JOHN;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formNewEventPage(currencies1, participants1, participants3);
      } catch(RuntimeException e) {
         //
         // formNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id=\"navbar-right\"]//a[@title=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelNewEventPage();
      } catch(RuntimeException e) {
         //
         // cancelNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames1 = TripNames.AMUSEMENT_PARK;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //section[@id=\"about\"]//a[text()=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      Currencies currencies2 = Currencies.PLN;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formNewEventPage(currencies2, participants0, participants1);
      } catch(RuntimeException e) {
         //
         // formNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventHomePage(tripNames0);
      } catch(RuntimeException e) {
         //
         // goToEditEventHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelEditEventPage();
      } catch(RuntimeException e) {
         //
         // cancelEditEventPage: expected po_apogen.EditEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id=\"navbar-right\"]//a[@title=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      Currencies currencies3 = Currencies.RON;
      Participants participants4 = Participants.MATTEO;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formNewEventPage(currencies3, participants4, participants2);
      } catch(RuntimeException e) {
         //
         // formNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames2 = TripNames.ROME;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id=\"navbar-right\"]//a[@title=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelNewEventPage();
      } catch(RuntimeException e) {
         //
         // cancelNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames3 = TripNames.BARCELONA;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames3);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id=\"navbar-right\"]//a[@title=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants3);
      } catch(RuntimeException e) {
         //
         // formNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames4 = TripNames.BARCELONA;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToConfirmationIndexPage(tripNames4);
      } catch(RuntimeException e) {
         //
         // goToConfirmation: tripName Trip To Barcelona does not exist
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.noConfirmationPage();
      } catch(RuntimeException e) {
         //
         // noConfirmationPage: expected po_apogen.ConfirmationPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToHomePageIndexPage(tripNames4);
      } catch(RuntimeException e) {
         //
         // goToHomePage: tripName Trip To Barcelona does not exist
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToHomePageHomePage();
      } catch(RuntimeException e) {
         //
         // goToHomePageHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventHomePage(tripNames4);
      } catch(RuntimeException e) {
         //
         // goToEditEventHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Currencies currencies4 = Currencies.USD;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formEditEventPage(currencies4, participants2, participants1);
      } catch(RuntimeException e) {
         //
         // formEditEventPage: expected po_apogen.EditEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventHomePage(tripNames3);
      } catch(RuntimeException e) {
         //
         // goToEditEventHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelEditEventPage();
      } catch(RuntimeException e) {
         //
         // cancelEditEventPage: expected po_apogen.EditEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id=\"navbar-right\"]//a[@title=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelNewEventPage();
      } catch(RuntimeException e) {
         //
         // cancelNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id=\"navbar-right\"]//a[@title=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      Currencies currencies5 = Currencies.HRK;
      Participants participants5 = Participants.MIKE;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formNewEventPage(currencies5, participants2, participants5);
      } catch(RuntimeException e) {
         //
         // formNewEventPage: expected po_apogen.NewEventPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToTransactionsHomePage();
      } catch(RuntimeException e) {
         //
         // goToTransactionsHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      } catch(RuntimeException e) {
         //
         // goToAddTransactionPageTransactionsPage: expected po_apogen.TransactionsPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Transactions transactions0 = Transactions.DINNER;
      int int0 = (-2243);
      Price price0 = new Price(int0);
      Dates dates0 = Dates.FALL;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates0);
      } catch(RuntimeException e) {
         //
         // quickAddAddTransactionPage: expected po_apogen.AddTransactionPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * Goal 1. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 2. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 3. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 4. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 5. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 6. main.ClassUnderTestApogen.noConfirmationPage()V: Line 30
   */

  @Test(timeout = 1001000)
  public void test7()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.RUB;
      Participants participants0 = Participants.LUKE;
      Participants participants1 = Participants.JOHN;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames1 = TripNames.RESTAURANT;
      Participants participants2 = Participants.JOHN;
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.noConfirmationPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      Currencies currencies1 = Currencies.BGN;
      Participants participants3 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies1, participants2, participants3);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToIndexPageHomePage();
  }
}
