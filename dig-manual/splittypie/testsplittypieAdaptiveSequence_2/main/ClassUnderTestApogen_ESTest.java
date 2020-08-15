/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 14 23:48:33 GMT 2020
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
   * Goal 2. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 3. main.ClassUnderTestApogen.deleteEditTransactionPage()V: Line 171
   * Goal 4. main.ClassUnderTestApogen.formEditEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 309
   * Goal 5. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 6. main.ClassUnderTestApogen.formNewTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Participants;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 138
   * Goal 7. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 8. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 9. main.ClassUnderTestApogen.goToEditTransactionPageTransactionsPage(Lcustom_classes/Id;)V: Line 496
   * Goal 10. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 11. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 12. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 13. main.ClassUnderTestApogen.yesConfirmationTransactionPage()V: Line 247
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames1 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames1);
      Currencies currencies0 = Currencies.RON;
      Participants participants0 = Participants.MARCO;
      Participants participants1 = Participants.JOHN;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      Transactions transactions0 = Transactions.LUNCH;
      Participants participants2 = Participants.MARCO;
      int int0 = 3214;
      Price price0 = new Price(int0);
      Dates dates0 = Dates.SUMMER;
      classUnderTestApogen0.formNewTransactionPage(transactions0, participants2, price0, dates0);
      classUnderTestApogen0.goToHomePageHomePage();
      TripNames tripNames2 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToEditEventHomePage(tripNames2);
      Currencies currencies1 = Currencies.USD;
      Participants participants3 = Participants.MARK;
      Participants participants4 = Participants.MARCO;
      classUnderTestApogen0.formEditEventPage(currencies1, participants3, participants4);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      classUnderTestApogen0.deleteEditTransactionPage();
      classUnderTestApogen0.yesConfirmationTransactionPage();
  }

  //Test case number: 1
  /*
   * 9 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelEditEventPage()V: Line 291
   * Goal 2. main.ClassUnderTestApogen.formEditEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 309
   * Goal 3. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 4. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 5. main.ClassUnderTestApogen.goToEditEventHomePage(Lcustom_classes/TripNames;)V: Line 59
   * Goal 6. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 7. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 8. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 9. main.ClassUnderTestApogen.noConfirmDeletionPage()V: Line 262
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Participants participants0 = Participants.MIKE;
      TripNames tripNames1 = TripNames.RESTAURANT;
      Currencies currencies0 = Currencies.CZK;
      Participants participants1 = Participants.MARCO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants1, participants0);
      classUnderTestApogen0.goToEditEventHomePage(tripNames1);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.cancelEditEventPage();
      classUnderTestApogen0.goToHomePageHomePage();
      TripNames tripNames2 = TripNames.ROME;
      classUnderTestApogen0.goToEditEventHomePage(tripNames2);
      Currencies currencies1 = Currencies.USD;
      Participants participants2 = Participants.MARK;
      classUnderTestApogen0.formEditEventPage(currencies1, participants1, participants2);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
  }

  //Test case number: 2
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addWithDetailsAddTransactionPage()V: Line 516
   * Goal 2. main.ClassUnderTestApogen.cancelNewTransactionPage()V: Line 119
   * Goal 3. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 4. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 5. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 6. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 7. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   * Goal 8. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      Currencies currencies0 = Currencies.GBP;
      Participants participants0 = Participants.MARK;
      Participants participants1 = Participants.MARCO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.addWithDetailsAddTransactionPage();
      classUnderTestApogen0.cancelNewTransactionPage();
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames1 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      Currencies currencies1 = Currencies.EUR;
      Participants participants2 = Participants.LUKE;
      Participants participants3 = Participants.MIKE;
      classUnderTestApogen0.formNewEventPage(currencies1, participants2, participants3);
      classUnderTestApogen0.goToIndexPageHomePage();
  }

  //Test case number: 3
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.closeAddTransactionPage()V: Line 532
   * Goal 2. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 3. main.ClassUnderTestApogen.goToAddTransactionPageTransactionsPage()V: Line 460
   * Goal 4. main.ClassUnderTestApogen.goToConfirmDeletionPageEditEventPage()V: Line 329
   * Goal 5. main.ClassUnderTestApogen.goToEditEventTransactionsPage(Lcustom_classes/TripNames;)V: Line 475
   * Goal 6. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 7. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 8. main.ClassUnderTestApogen.goToTransactionsHomePage()V: Line 105
   * Goal 9. main.ClassUnderTestApogen.noConfirmDeletionPage()V: Line 262
   * Goal 10. main.ClassUnderTestApogen.quickAddAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 557
   * Goal 11. main.ClassUnderTestApogen.yesConfirmDeletionPage()V: Line 278
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.GBP;
      Participants participants0 = Participants.MARK;
      Participants participants1 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      int int0 = 3172;
      Transactions transactions0 = Transactions.SHOPPING;
      Participants participants2 = Participants.JOHN;
      Price price0 = new Price(int0);
      TripNames tripNames1 = TripNames.ROME;
      classUnderTestApogen0.goToEditEventTransactionsPage(tripNames1);
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.noConfirmDeletionPage();
      classUnderTestApogen0.goToConfirmDeletionPageEditEventPage();
      classUnderTestApogen0.yesConfirmDeletionPage();
      Price price1 = new Price(price0.value);
      Participants participants3 = Participants.MARCO;
      Currencies currencies1 = Currencies.PLN;
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames2);
      classUnderTestApogen0.formNewEventPage(currencies1, participants3, participants2);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      Dates dates0 = Dates.SPRING;
      classUnderTestApogen0.quickAddAddTransactionPage(transactions0, price1, dates0);
      classUnderTestApogen0.goToTransactionsHomePage();
      classUnderTestApogen0.goToAddTransactionPageTransactionsPage();
      classUnderTestApogen0.closeAddTransactionPage();
  }

  //Test case number: 4
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
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.EUR;
      Participants participants0 = Participants.MATTEO;
      Participants participants1 = Participants.MARCO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToIndexPageHomePage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      classUnderTestApogen0.yesConfirmationPage();
      TripNames tripNames1 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
  }

  //Test case number: 5
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 2. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 3. main.ClassUnderTestApogen.goToHomePageHomePage()V: Line 77
   * Goal 4. main.ClassUnderTestApogen.goToHomePageIndexPage(Lcustom_classes/TripNames;)V: Line 404
   * Goal 5. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 6. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 7. main.ClassUnderTestApogen.goToNewEventNavbarIndexPage(Lcustom_classes/TripNames;)V: Line 442
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.RESTAURANT;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToConfirmationIndexPage(tripNames0);
      } catch(RuntimeException e) {
         //
         // goToConfirmation: tripName Restaurant does not exist
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.yesConfirmationPage();
      } catch(RuntimeException e) {
         //
         // yesConfirmationPage: expected po_apogen.ConfirmationPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames1 = TripNames.RESTAURANT;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToConfirmationIndexPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // goToConfirmation: tripName Restaurant does not exist
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.yesConfirmationPage();
      } catch(RuntimeException e) {
         //
         // yesConfirmationPage: expected po_apogen.ConfirmationPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      TripNames tripNames2 = TripNames.BARCELONA;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames2);
      classUnderTestApogen0.cancelNewEventPage();
      TripNames tripNames3 = TripNames.ROME;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames3);
      Currencies currencies0 = Currencies.CZK;
      Participants participants0 = Participants.LUKE;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants0);
      } catch(RuntimeException e) {
         //
         // form: the two participants must be different Luke Luke
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToTransactionsHomePage();
      } catch(RuntimeException e) {
         //
         // goToTransactionsHomePage: expected po_apogen.HomePage, found NewEventPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventTransactionsPage(tripNames2);
      } catch(RuntimeException e) {
         //
         // goToEditEventTransactionsPage: expected po_apogen.TransactionsPage, found NewEventPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Currencies currencies1 = Currencies.RUB;
      Participants participants1 = Participants.LUKE;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formEditEventPage(currencies1, participants1, participants1);
      } catch(RuntimeException e) {
         //
         // formEditEventPage: expected po_apogen.EditEventPage, found NewEventPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToIndexPageHomePage();
      } catch(RuntimeException e) {
         //
         // goToIndexPageHomePage: expected po_apogen.HomePage, found NewEventPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToConfirmationIndexPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // goToConfirmationIndexPage: expected po_apogen.IndexPage, found NewEventPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.yesConfirmationPage();
      } catch(RuntimeException e) {
         //
         // yesConfirmationPage: expected po_apogen.ConfirmationPage, found NewEventPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // goToNewEventNavbarIndexPage: expected po_apogen.IndexPage, found NewEventPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventNavbarIndexPage(tripNames2);
      Currencies currencies2 = Currencies.EUR;
      Participants participants2 = Participants.JOHN;
      classUnderTestApogen0.formNewEventPage(currencies2, participants1, participants2);
      classUnderTestApogen0.goToHomePageHomePage();
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames4 = TripNames.AMUSEMENT_PARK;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToHomePageIndexPage(tripNames4);
      } catch(RuntimeException e) {
         //
         // goToHomePage: tripName Mirabilandia does not exist
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
        classUnderTestApogen0.closeAddTransactionPage();
      } catch(RuntimeException e) {
         //
         // closeAddTransactionPage: expected po_apogen.AddTransactionPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      int int0 = 2749;
      Id id0 = new Id(int0);
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditTransactionPageTransactionsPage(id0);
      } catch(RuntimeException e) {
         //
         // goToEditTransactionPageTransactionsPage: expected po_apogen.TransactionsPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.cancelEditTransactionPage();
      } catch(RuntimeException e) {
         //
         // cancelEditTransactionPage: expected po_apogen.EditTransactionPage, found IndexPage
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
        classUnderTestApogen0.goToHomePageIndexPage(tripNames2);
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
      
      TripNames tripNames5 = TripNames.ROME;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.goToEditEventHomePage(tripNames5);
      } catch(RuntimeException e) {
         //
         // goToEditEventHomePage: expected po_apogen.HomePage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formEditEventPage(currencies2, participants1, participants2);
      } catch(RuntimeException e) {
         //
         // formEditEventPage: expected po_apogen.EditEventPage, found IndexPage
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
        classUnderTestApogen0.addWithDetailsAddTransactionPage();
      } catch(RuntimeException e) {
         //
         // addWithDetailsAddTransactionPage: expected po_apogen.AddTransactionPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
      
      Transactions transactions0 = Transactions.MUSEUM;
      Participants participants3 = Participants.MATTEO;
      int int1 = 870;
      Price price0 = new Price(int1);
      Dates dates0 = Dates.FALL;
      // Undeclared exception!
      try { 
        classUnderTestApogen0.formNewTransactionPage(transactions0, participants3, price0, dates0);
      } catch(RuntimeException e) {
         //
         // formNewTransactionPage: expected po_apogen.NewTransactionPage, found IndexPage
         //
         //verifyException("main.ClassUnderTestApogen", e);
      }
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelNewEventPage()V: Line 347
   * Goal 2. main.ClassUnderTestApogen.formNewEventPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 365
   * Goal 3. main.ClassUnderTestApogen.goToConfirmationIndexPage(Lcustom_classes/TripNames;)V: Line 385
   * Goal 4. main.ClassUnderTestApogen.goToIndexPageHomePage()V: Line 91
   * Goal 5. main.ClassUnderTestApogen.goToNewEventHomeIndexPage(Lcustom_classes/TripNames;)V: Line 423
   * Goal 6. main.ClassUnderTestApogen.noConfirmationPage()V: Line 30
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      classUnderTestApogen0.cancelNewEventPage();
      classUnderTestApogen0.goToNewEventHomeIndexPage(tripNames0);
      Currencies currencies0 = Currencies.RON;
      Participants participants0 = Participants.MARCO;
      Participants participants1 = Participants.MATTEO;
      classUnderTestApogen0.formNewEventPage(currencies0, participants0, participants1);
      classUnderTestApogen0.goToIndexPageHomePage();
      TripNames tripNames1 = TripNames.AMUSEMENT_PARK;
      TripNames tripNames2 = TripNames.AMUSEMENT_PARK;
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames2);
      classUnderTestApogen0.noConfirmationPage();
      classUnderTestApogen0.goToConfirmationIndexPage(tripNames1);
      classUnderTestApogen0.noConfirmationPage();
  }
}
