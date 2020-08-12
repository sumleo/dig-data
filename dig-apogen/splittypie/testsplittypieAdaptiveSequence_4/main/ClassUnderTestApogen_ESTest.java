/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 11 17:10:12 GMT 2020
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
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 3. main.ClassUnderTestApogen.cancelNewTransactionPage()V: Line 119
   * Goal 4. main.ClassUnderTestApogen.closeAddTransactionPage()V: Line 532
   * Goal 5. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 6. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 9. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 10. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Currencies currencies0 = Currencies.BGN;
      Participants participants0 = Participants.JOHN;
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Participants participants1 = Participants.MIKE;
      Participants participants2 = Participants.LUKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants1, participants2);
      TripNames tripNames1 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventHomePage(tripNames1);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames2 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames2);
      Currencies currencies1 = Currencies.RUB;
      Participants participants3 = Participants.LUKE;
      classUnderTestApogen0.formNewEventPage(currencies1, participants0, participants3);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.closeAddTransactionPage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      classUnderTestApogen0.cancelNewTransactionPage();
      TripNames tripNames3 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventHomePage(tripNames3);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToIndexPageHomePage();
  }

  //Test case number: 1
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 2. main.ClassUnderTestApogen.cancelEditTransactionPage()V: Line 156
   * Goal 3. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 4. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 5. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 6. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToEditTransactionPageTransactionsPage(Lcustom_classes/Id;)V: Line 496
   * Goal 9. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 10. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 11. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 12. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 13. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 14. main.ClassUnderTestApogen.noConfirmDeletionPage()V: Line 262
   * Goal 15. main.ClassUnderTestApogen.quickAddAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 557
   * Goal 16. main.ClassUnderTestApogen.yesConfirmDeletionPage()V: Line 278
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames1 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      Currencies currencies0 = Currencies.BGN;
      Participants participants0 = Participants.LUKE;
      Participants participants1 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToEditEventHomePage(tripNames0);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames2);
      Participants participants2 = Participants.MARK;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants2);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Transactions transactions0 = Transactions.MUSEUM;
      int int0 = 2433;
      Price price0 = new Price(int0);
      Dates dates0 = Dates.FALL;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price0, dates0);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      classUnderTestApogen0.cancelEditTransactionPage();
      TripNames tripNames3 = TripNames.BARCELONA;
      classUnderTestApogen0.goToEditEventHomePage(tripNames3);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.cancelEditEventPage();
      TripNames tripNames4 = TripNames.ROME;
      classUnderTestApogen0.goToEditEventHomePage(tripNames4);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.cancelEditEventPage();
      TripNames tripNames5 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToEditEventHomePage(tripNames5);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToIndexPageHomePage();
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 2. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 3. main.ClassUnderTestApogen.formEditEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 309
   * Goal 4. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 5. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 6. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 7. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 8. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 9. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 10. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 11. main.ClassUnderTestApogen.noConfirmDeletionPage()V: Line 262
   * Goal 12. main.ClassUnderTestApogen.yesConfirmDeletionPage()V: Line 278
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames1 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      Currencies currencies0 = Currencies.GBP;
      Participants participants0 = Participants.MATTEO;
      Participants participants1 = Participants.MIKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants1, participants0);
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToEditEventHomePage(tripNames2);
      Currencies currencies1 = Currencies.CHF;
      Participants participants2 = Participants.MATTEO;
      Participants participants3 = Participants.MIKE;
      classUnderTestApogen0.formEditEventPage(currencies1, participants2, participants3);
      classUnderTestApogen0.goToEditEventHomePage(tripNames0);
      classUnderTestApogen0.cancelEditEventPage();
      TripNames tripNames3 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToEditEventHomePage(tripNames3);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      classUnderTestApogen0.formNewEventPage(currencies1, participants3, participants2);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames0);
      Participants participants4 = Participants.MARCO;
      classUnderTestApogen0.formEditEventPage(currencies0, participants2, participants4);
      TripNames tripNames4 = TripNames.ROME;
      classUnderTestApogen0.goToEditEventHomePage(tripNames4);
      classUnderTestApogen0.formEditEventPage(currencies0, participants0, participants4);
      classUnderTestApogen0.goToEditEventHomePage(tripNames3);
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
  }

  //Test case number: 3
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 3. main.ClassUnderTestApogen.formNewTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Participants;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 138
   * Goal 4. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 5. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 6. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 7. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.BGN;
      Participants participants0 = Participants.MARCO;
      Participants participants1 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      Transactions transactions0 = Transactions.SHOPPING;
      int int0 = 863;
      Price price0 = new Price(int0);
      Dates dates0 = Dates.SPRING;
      classUnderTestApogen0.formNewTransactionPage(transactions0, participants1, price0, dates0);
  }

  //Test case number: 4
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 2. main.ClassUnderTestApogen.formEditEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 309
   * Goal 3. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 4. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 5. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 6. main.ClassUnderTestApogen.goToHomePageIndexPage(Lcustom_classes/TripNames;)V: Line 404
   * Goal 7. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 8. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 9. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 10. main.ClassUnderTestApogen.noConfirmationPage()V: Line 30
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.ROME;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToHomePageIndexPage(tripNames0);
      } catch(RuntimeException e) {
         //
         // goToHomePage: tripName Trip to Rome does not exist
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
      
      TripNames tripNames1 = TripNames.BARCELONA;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventHomePage(tripNames1);
      } catch(RuntimeException e) {
         //
         // goToEditEventHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Currencies currencies0 = Currencies.GBP;
      Participants participants0 = Participants.MATTEO;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formEditEventPage(currencies0, participants0, participants0);
      } catch(RuntimeException e) {
         //
         // formEditEventPage: expected po_apogen.EditEventPage, found IndexPage
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
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Participants participants1 = Participants.LUKE;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventTransactionsPage(tripNames0);
      } catch(RuntimeException e) {
         //
         // goToEditEvent: new trip name Trip to Rome already exists
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Participants participants2 = Participants.MATTEO;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formEditEventPage(currencies0, participants2, participants2);
      } catch(RuntimeException e) {
         //
         // formEditEventPage: expected po_apogen.EditEventPage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToHomePageIndexPage(tripNames2);
      } catch(RuntimeException e) {
         //
         // goToHomePageIndexPage: expected po_apogen.IndexPage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames3 = TripNames.ROME;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventHomePage(tripNames3);
      } catch(RuntimeException e) {
         //
         // goToEditEventHomePage: expected po_apogen.HomePage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelEditEventPage();
      } catch(RuntimeException e) {
         //
         // cancelEditEventPage: expected po_apogen.EditEventPage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames4 = TripNames.ROME;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventHomePage(tripNames4);
      } catch(RuntimeException e) {
         //
         // goToEditEventHomePage: expected po_apogen.HomePage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      } catch(RuntimeException e) {
         //
         // goToConfirmDeletionPageEditEventPage: expected po_apogen.EditEventPage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.noConfirmDeletionPage();
      } catch(RuntimeException e) {
         //
         // noConfirmDeletionPage: expected po_apogen.ConfirmDeletionPage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Currencies currencies1 = Currencies.HRK;
      Participants participants3 = Participants.MARK;
      Participants participants4 = Participants.MATTEO;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formEditEventPage(currencies1, participants3, participants4);
      } catch(RuntimeException e) {
         //
         // formEditEventPage: expected po_apogen.EditEventPage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToHomePageIndexPage(tripNames4);
      } catch(RuntimeException e) {
         //
         // goToHomePageIndexPage: expected po_apogen.IndexPage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToTransactionsHomePage();
      } catch(RuntimeException e) {
         //
         // goToTransactionsHomePage: expected po_apogen.HomePage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      int int0 = 816;
      Id id0 = new Id(int0);
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      } catch(RuntimeException e) {
         //
         // goToEditTransactionPage: transaction with id 1 is not present or it is not a transaction or the transaction view is not active
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Transactions transactions0 = Transactions.DINNER;
      Participants participants5 = Participants.MARCO;
      int int1 = 3329;
      Price price0 = new Price(int1);
      Dates dates0 = Dates.WINTER;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formEditTransactionPage(transactions0, participants5, price0, dates0);
      } catch(RuntimeException e) {
         //
         // formEditTransactionPage: expected po_apogen.EditTransactionPage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToTransactionsHomePage();
      } catch(RuntimeException e) {
         //
         // goToTransactionsHomePage: expected po_apogen.HomePage, found TransactionsPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames5 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames5);
      Currencies currencies2 = Currencies.HRK;
      Participants participants6 = Participants.LUKE;
      Participants participants7 = Participants.MATTEO;
      classUnderTestApogen0.formEditEventPage(currencies2, participants6, participants7);
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames6 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames6);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames5);
      classUnderTestApogen0.noConfirmationPage();
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToHomePageIndexPage(tripNames5);
      } catch(IllegalStateException e) {
         //
         // HomePage not loaded properly
         //
         //verifyException("po_apogen.HomePage", e);
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
        classUnderTestApogen0.goToHomePageHomePage();
      } catch(RuntimeException e) {
         //
         // goToHomePageHomePage: expected po_apogen.HomePage, found IndexPage
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
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.addWithDetailsAddTransactionPage();
      } catch(RuntimeException e) {
         //
         // addWithDetailsAddTransactionPage: expected po_apogen.AddTransactionPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelNewTransactionPage();
      } catch(RuntimeException e) {
         //
         // cancelNewTransactionPage: expected po_apogen.NewTransactionPage, found IndexPage
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

  //Test case number: 5
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 2. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 3. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 4. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 5. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 6. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 7. main.ClassUnderTestApogen.yesConfirmationPage()V: Line 45
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.CHF;
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Participants participants0 = Participants.MIKE;
      Participants participants1 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames1 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.yesConfirmationPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
  }
}
