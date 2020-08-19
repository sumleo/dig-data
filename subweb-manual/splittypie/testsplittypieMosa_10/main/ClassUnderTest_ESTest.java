/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 19 14:23:48 GMT 2020
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
import main.ClassUnderTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTest_ESTest extends ClassUnderTest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTest.addQuickAddTransactionPage(Lcustom_classes/Transactions;Lcustom_classes/Price;Lcustom_classes/Dates;)V: Line 610
   * Goal 2. main.ClassUnderTest.addTransactionEventDetailsContainerPage()V: Line 263
   * Goal 3. main.ClassUnderTest.addWithDetailsQuickAddTransactionPage()V: Line 630
   * Goal 4. main.ClassUnderTest.cancelAddEditTransactionContainerPage()V: Line 688
   * Goal 5. main.ClassUnderTest.createEventAddEditEventContainerPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 502
   * Goal 6. main.ClassUnderTest.createNewEventNavbarHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 53
   * Goal 7. main.ClassUnderTest.goToFeaturesHomePageContainerPage()V: Line 126
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToFeaturesHomePageContainerPage();
      TripNames tripNames0 = TripNames.BARCELONA;
      classUnderTest0.createNewEventNavbarHomePageContainerPage(tripNames0);
      Currencies currencies0 = Currencies.RON;
      Participants participants0 = Participants.MATTEO;
      Participants participants1 = Participants.MARK;
      classUnderTest0.createEventAddEditEventContainerPage(currencies0, participants0, participants1);
      classUnderTest0.addTransactionEventDetailsContainerPage();
      classUnderTest0.addWithDetailsQuickAddTransactionPage();
      classUnderTest0.cancelAddEditTransactionContainerPage();
      classUnderTest0.addTransactionEventDetailsContainerPage();
      Transactions transactions0 = Transactions.SHOPPING;
      int int0 = (-1186);
      Price price0 = new Price(int0);
      Dates dates0 = Dates.SPRING;
      classUnderTest0.addQuickAddTransactionPage(transactions0, price0, dates0);
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTest.cancelAddEditEventContainerPage()V: Line 474
   * Goal 2. main.ClassUnderTest.createEventAddEditEventContainerPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 502
   * Goal 3. main.ClassUnderTest.createNewEventNavbarHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 53
   * Goal 4. main.ClassUnderTest.goToEventsHomePageContainerPage()V: Line 108
   * Goal 5. main.ClassUnderTest.goToFeaturesHomePageContainerPage()V: Line 126
   * Goal 6. main.ClassUnderTest.goToHomeEventDetailsContainerPage()V: Line 321
   * Goal 7. main.ClassUnderTest.goToOverviewEventDetailsContainerPage()V: Line 335
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToFeaturesHomePageContainerPage();
      TripNames tripNames0 = TripNames.BARCELONA;
      classUnderTest0.createNewEventNavbarHomePageContainerPage(tripNames0);
      Currencies currencies0 = Currencies.HRK;
      Participants participants0 = Participants.LUKE;
      Participants participants1 = Participants.MARK;
      classUnderTest0.createEventAddEditEventContainerPage(currencies0, participants0, participants1);
      classUnderTest0.goToOverviewEventDetailsContainerPage();
      classUnderTest0.goToHomeEventDetailsContainerPage();
      TripNames tripNames1 = TripNames.AMUSEMENT_PARK;
      classUnderTest0.createNewEventNavbarHomePageContainerPage(tripNames1);
      classUnderTest0.cancelAddEditEventContainerPage();
      classUnderTest0.goToFeaturesHomePageContainerPage();
      classUnderTest0.goToEventsHomePageContainerPage();
      classUnderTest0.goToFeaturesHomePageContainerPage();
      classUnderTest0.goToFeaturesHomePageContainerPage();
  }

  //Test case number: 2
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.cancelConfirmationPage()V: Line 175
   * Goal 2. main.ClassUnderTest.closeShareEventPage()V: Line 584
   * Goal 3. main.ClassUnderTest.createEventAddEditEventContainerPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 502
   * Goal 4. main.ClassUnderTest.createNewEventHomeHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 31
   * Goal 5. main.ClassUnderTest.createNewEventNavbarHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 53
   * Goal 6. main.ClassUnderTest.deleteEventHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 75
   * Goal 7. main.ClassUnderTest.editEventEventDetailsContainerPage(Lcustom_classes/TripNames;)V: Line 281
   * Goal 8. main.ClassUnderTest.goToHomeEventDetailsContainerPage()V: Line 321
   * Goal 9. main.ClassUnderTest.goToHomePageAddEditEventContainerPage()V: Line 568
   * Goal 10. main.ClassUnderTest.goToOverviewEventDetailsContainerPage()V: Line 335
   * Goal 11. main.ClassUnderTest.shareEventEventDetailsContainerPage()V: Line 385
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      TripNames tripNames0 = TripNames.AMUSEMENT_PARK;
      classUnderTest0.createNewEventHomeHomePageContainerPage(tripNames0);
      classUnderTest0.goToHomePageAddEditEventContainerPage();
      TripNames tripNames1 = TripNames.RESTAURANT;
      classUnderTest0.createNewEventNavbarHomePageContainerPage(tripNames1);
      Currencies currencies0 = Currencies.CZK;
      Participants participants0 = Participants.MATTEO;
      Participants participants1 = Participants.JOHN;
      classUnderTest0.createEventAddEditEventContainerPage(currencies0, participants0, participants1);
      classUnderTest0.goToOverviewEventDetailsContainerPage();
      Participants participants2 = Participants.LUKE;
      classUnderTest0.shareEventEventDetailsContainerPage();
      classUnderTest0.closeShareEventPage();
      classUnderTest0.goToOverviewEventDetailsContainerPage();
      TripNames tripNames2 = TripNames.BARCELONA;
      classUnderTest0.editEventEventDetailsContainerPage(tripNames2);
      Participants participants3 = Participants.MATTEO;
      classUnderTest0.createEventAddEditEventContainerPage(currencies0, participants2, participants3);
      classUnderTest0.goToHomeEventDetailsContainerPage();
      TripNames tripNames3 = TripNames.BARCELONA;
      classUnderTest0.deleteEventHomePageContainerPage(tripNames3);
      classUnderTest0.cancelConfirmationPage();
      TripNames tripNames4 = TripNames.BARCELONA;
      classUnderTest0.deleteEventHomePageContainerPage(tripNames4);
      classUnderTest0.cancelConfirmationPage();
  }

  //Test case number: 3
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.addTransactionEventDetailsContainerPage()V: Line 263
   * Goal 2. main.ClassUnderTest.closeQuickAddTransactionPage()V: Line 646
   * Goal 3. main.ClassUnderTest.closeShareEventPage()V: Line 584
   * Goal 4. main.ClassUnderTest.createEventAddEditEventContainerPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 502
   * Goal 5. main.ClassUnderTest.createNewEventHomeHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 31
   * Goal 6. main.ClassUnderTest.createNewEventNavbarHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 53
   * Goal 7. main.ClassUnderTest.editEventEventDetailsContainerPage(Lcustom_classes/TripNames;)V: Line 281
   * Goal 8. main.ClassUnderTest.goToAboutHomePageContainerPage()V: Line 93
   * Goal 9. main.ClassUnderTest.goToEventsHomePageContainerPage()V: Line 108
   * Goal 10. main.ClassUnderTest.goToFeaturesHomePageContainerPage()V: Line 126
   * Goal 11. main.ClassUnderTest.goToHomePageAddEditEventContainerPage()V: Line 568
   * Goal 12. main.ClassUnderTest.goToTransactionEventDetailsContainerPage()V: Line 349
   * Goal 13. main.ClassUnderTest.shareEventEventDetailsContainerPage()V: Line 385
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToFeaturesHomePageContainerPage();
      classUnderTest0.goToAboutHomePageContainerPage();
      TripNames tripNames0 = TripNames.RESTAURANT;
      classUnderTest0.createNewEventNavbarHomePageContainerPage(tripNames0);
      classUnderTest0.goToHomePageAddEditEventContainerPage();
      TripNames tripNames1 = TripNames.ROME;
      classUnderTest0.createNewEventHomeHomePageContainerPage(tripNames1);
      classUnderTest0.goToHomePageAddEditEventContainerPage();
      TripNames tripNames2 = TripNames.BARCELONA;
      classUnderTest0.createNewEventHomeHomePageContainerPage(tripNames2);
      Currencies currencies0 = Currencies.BGN;
      Participants participants0 = Participants.MARCO;
      Participants participants1 = Participants.LUKE;
      classUnderTest0.createEventAddEditEventContainerPage(currencies0, participants0, participants1);
      classUnderTest0.goToTransactionEventDetailsContainerPage();
      classUnderTest0.addTransactionEventDetailsContainerPage();
      classUnderTest0.closeQuickAddTransactionPage();
      classUnderTest0.shareEventEventDetailsContainerPage();
      classUnderTest0.closeShareEventPage();
      TripNames tripNames3 = TripNames.ROME;
      classUnderTest0.editEventEventDetailsContainerPage(tripNames3);
      classUnderTest0.goToHomePageAddEditEventContainerPage();
      classUnderTest0.goToFeaturesHomePageContainerPage();
      classUnderTest0.goToFeaturesHomePageContainerPage();
      classUnderTest0.goToEventsHomePageContainerPage();
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTest.closeShareEventPage()V: Line 584
   * Goal 2. main.ClassUnderTest.createEventAddEditEventContainerPage(Lcustom_classes/Currencies;Lcustom_classes/Participants;Lcustom_classes/Participants;)V: Line 502
   * Goal 3. main.ClassUnderTest.createNewEventNavbarHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 53
   * Goal 4. main.ClassUnderTest.goToAboutHomePageContainerPage()V: Line 93
   * Goal 5. main.ClassUnderTest.goToHomeEventDetailsContainerPage()V: Line 321
   * Goal 6. main.ClassUnderTest.seeEventDetailsHomePageContainerPage(Lcustom_classes/TripNames;)V: Line 142
   * Goal 7. main.ClassUnderTest.shareEventEventDetailsContainerPage()V: Line 385
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToAboutHomePageContainerPage();
      // Undeclared exception!
      try { 
        classUnderTest0.goToEventsHomePageContainerPage();
      } catch(RuntimeException e) {
         //
         // goToEvents: events are not present
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      classUnderTest0.goToAboutHomePageContainerPage();
      TripNames tripNames0 = TripNames.ROME;
      classUnderTest0.createNewEventNavbarHomePageContainerPage(tripNames0);
      Currencies currencies0 = Currencies.HRK;
      Participants participants0 = Participants.MATTEO;
      Participants participants1 = Participants.JOHN;
      classUnderTest0.createEventAddEditEventContainerPage(currencies0, participants0, participants1);
      classUnderTest0.shareEventEventDetailsContainerPage();
      classUnderTest0.closeShareEventPage();
      classUnderTest0.goToHomeEventDetailsContainerPage();
      // Undeclared exception!
      try { 
        classUnderTest0.seeEventDetailsHomePageContainerPage(tripNames0);
      } catch(IllegalStateException e) {
         //
         // EventDetailsContainerPage not loaded properly
         //
         //verifyException("po.event.pages.EventDetailsContainerPage", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTest0.addTransactionEventDetailsContainerPage();
      } catch(RuntimeException e) {
         //
         // addTransactionEventDetailsContainerPage: expected po.event.pages.EventDetailsContainerPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      Transactions transactions0 = Transactions.MUSEUM;
      int int0 = (-1052);
      Price price0 = new Price(int0);
      Dates dates0 = Dates.WINTER;
      // Undeclared exception!
      try { 
        classUnderTest0.addQuickAddTransactionPage(transactions0, price0, dates0);
      } catch(RuntimeException e) {
         //
         // addQuickAddTransactionPage: expected po.event.pages.modals.QuickAddTransactionPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      Id id0 = new Id(int0);
      // Undeclared exception!
      try { 
        classUnderTest0.settleUpEventDetailsContainerPage(id0);
      } catch(RuntimeException e) {
         //
         // settleUpEventDetailsContainerPage: expected po.event.pages.EventDetailsContainerPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTest0.cancelConfirmationPage();
      } catch(RuntimeException e) {
         //
         // cancelConfirmationPage: expected po.shared.pages.ConfirmationPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      TripNames tripNames1 = TripNames.ROME;
      // Undeclared exception!
      try { 
        classUnderTest0.createNewEventNavbarHomePageContainerPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id=\"navbar-right\"]//a[@title=\"Create New Event\"] (tried for 5 second(s) with 50 MILLISECONDS interval)
         //
         //verifyException("org.openqa.selenium.support.ui.WebDriverWait", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTest0.addParticipantAddEditEventContainerPage(participants0);
      } catch(RuntimeException e) {
         //
         // addParticipantAddEditEventContainerPage: expected po.event.pages.AddEditEventContainerPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTest0.editEventEventDetailsContainerPage(tripNames1);
      } catch(RuntimeException e) {
         //
         // editEventEventDetailsContainerPage: expected po.event.pages.EventDetailsContainerPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTest0.addParticipantAddEditEventContainerPage(participants0);
      } catch(RuntimeException e) {
         //
         // addParticipantAddEditEventContainerPage: expected po.event.pages.AddEditEventContainerPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTest0.settleUpEventDetailsContainerPage(id0);
      } catch(RuntimeException e) {
         //
         // settleUpEventDetailsContainerPage: expected po.event.pages.EventDetailsContainerPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTest0.confirmConfirmationPage();
      } catch(RuntimeException e) {
         //
         // confirmConfirmationPage: expected po.shared.pages.ConfirmationPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      TripNames tripNames2 = TripNames.BARCELONA;
      // Undeclared exception!
      try { 
        classUnderTest0.seeEventDetailsHomePageContainerPage(tripNames2);
      } catch(RuntimeException e) {
         //
         // seeEventDetails: tripName Trip To Barcelona does not exist
         //
         //verifyException("main.ClassUnderTest", e);
      }
      
      // Undeclared exception!
      try { 
        classUnderTest0.editTransactionEventDetailsContainerPage(id0);
      } catch(RuntimeException e) {
         //
         // editTransactionEventDetailsContainerPage: expected po.event.pages.EventDetailsContainerPage, found HomePageContainerPage
         //
         //verifyException("main.ClassUnderTest", e);
      }
  }
}
