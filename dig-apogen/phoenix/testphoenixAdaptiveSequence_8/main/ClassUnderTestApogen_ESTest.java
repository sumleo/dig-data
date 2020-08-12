/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 12 06:24:05 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.BoardNames;
import custom_classes.CardComment;
import custom_classes.CardText;
import custom_classes.Email;
import custom_classes.Id;
import custom_classes.ListNames;
import custom_classes.Passwords;
import custom_classes.PeopleNames;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_new_listBoardPage(Lcustom_classes/ListNames;)V: Line 168
   * Goal 2. main.ClassUnderTestApogen.goToBoardPageCardDetailsPage()V: Line 70
   * Goal 3. main.ClassUnderTestApogen.goToBoardPageInsertCardPage()V: Line 377
   * Goal 4. main.ClassUnderTestApogen.goToBoardUsingNavbarBoardPage(Lcustom_classes/BoardNames;)V: Line 183
   * Goal 5. main.ClassUnderTestApogen.goToCardDetailsPageBoardPage(Lcustom_classes/ListNames;Lcustom_classes/Id;)V: Line 205
   * Goal 6. main.ClassUnderTestApogen.goToHomePageOwnedBoardsPage()V: Line 263
   * Goal 7. main.ClassUnderTestApogen.goToIndexHomePage()V: Line 121
   * Goal 8. main.ClassUnderTestApogen.goToInsertCardPageBoardPage(Lcustom_classes/ListNames;)V: Line 226
   * Goal 9. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 10. main.ClassUnderTestApogen.new_board_formNewBoardPage(Lcustom_classes/BoardNames;)V: Line 41
   * Goal 11. main.ClassUnderTestApogen.new_card_formInsertCardPage(Lcustom_classes/CardText;)V: Line 391
   * Goal 12. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 311
   * Goal 13. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 314
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords0);
      Passwords passwords1 = Passwords.ASD;
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames0 = BoardNames.MY_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames0);
      ListNames listNames0 = ListNames.MY_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames0);
      CardText cardText0 = CardText.PERSONAL;
      classUnderTestApogen0.new_card_formInsertCardPage(cardText0);
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames0);
      CardText cardText1 = CardText.EXAMPLE;
      classUnderTestApogen0.new_card_formInsertCardPage(cardText1);
      CardText cardText2 = CardText.EXAMPLE;
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames0);
      classUnderTestApogen0.goToBoardPageInsertCardPage();
      ListNames listNames1 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames1);
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames1);
      classUnderTestApogen0.new_card_formInsertCardPage(cardText2);
      ListNames listNames2 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames2);
      CardText cardText3 = CardText.EXAMPLE;
      classUnderTestApogen0.new_card_formInsertCardPage(cardText3);
      ListNames listNames3 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames3);
      ListNames listNames4 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames4);
      ListNames listNames5 = ListNames.ANOTHER_LIST;
      int int0 = (-4456);
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToCardDetailsPageBoardPage(listNames5, id0);
      classUnderTestApogen0.goToBoardPageCardDetailsPage();
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.goToIndexHomePage();
      Email email1 = Email.JOHNDOE;
      classUnderTestApogen0.sign_in_formIndexPage(email1, passwords1);
  }

  //Test case number: 1
  /*
   * 9 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_new_listBoardPage(Lcustom_classes/ListNames;)V: Line 168
   * Goal 2. main.ClassUnderTestApogen.deleteCardCardDetailsPage()V: Line 56
   * Goal 3. main.ClassUnderTestApogen.goToCardDetailsPageBoardPage(Lcustom_classes/ListNames;Lcustom_classes/Id;)V: Line 205
   * Goal 4. main.ClassUnderTestApogen.goToHomePageIndexPage()V: Line 277
   * Goal 5. main.ClassUnderTestApogen.goToInsertCardPageBoardPage(Lcustom_classes/ListNames;)V: Line 226
   * Goal 6. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 7. main.ClassUnderTestApogen.new_board_formNewBoardPage(Lcustom_classes/BoardNames;)V: Line 41
   * Goal 8. main.ClassUnderTestApogen.new_card_formInsertCardPage(Lcustom_classes/CardText;)V: Line 391
   * Goal 9. main.ClassUnderTestApogen.save_commentCardDetailsPage(Lcustom_classes/CardComment;)V: Line 89
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToHomePageIndexPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames0 = BoardNames.WORK_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames0);
      ListNames listNames0 = ListNames.ANOTHER_LIST;
      int int0 = (-81);
      Id id0 = new Id(int0);
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      ListNames listNames1 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames1);
      ListNames listNames2 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames2);
      CardText cardText0 = CardText.SHOPPING;
      classUnderTestApogen0.new_card_formInsertCardPage(cardText0);
      classUnderTestApogen0.goToCardDetailsPageBoardPage(listNames1, id0);
      CardComment cardComment0 = CardComment.EXAMPLE;
      classUnderTestApogen0.save_commentCardDetailsPage(cardComment0);
      CardComment cardComment1 = CardComment.EXAMPLE;
      classUnderTestApogen0.save_commentCardDetailsPage(cardComment1);
      classUnderTestApogen0.deleteCardCardDetailsPage();
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames0);
      CardText cardText1 = CardText.LAUNDRY;
      classUnderTestApogen0.new_card_formInsertCardPage(cardText1);
  }

  //Test case number: 2
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_new_listBoardPage(Lcustom_classes/ListNames;)V: Line 168
   * Goal 2. main.ClassUnderTestApogen.goToBoardPageOwnedBoardsPage()V: Line 245
   * Goal 3. main.ClassUnderTestApogen.goToBoardUsingNavbarBoardPage(Lcustom_classes/BoardNames;)V: Line 183
   * Goal 4. main.ClassUnderTestApogen.goToBoardUsingNavbarHomePage(Lcustom_classes/BoardNames;)V: Line 103
   * Goal 5. main.ClassUnderTestApogen.goToHomePageIndexPage()V: Line 277
   * Goal 6. main.ClassUnderTestApogen.goToHomePageOwnedBoardsPage()V: Line 263
   * Goal 7. main.ClassUnderTestApogen.goToIndexHomePage()V: Line 121
   * Goal 8. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 9. main.ClassUnderTestApogen.new_board_formNewBoardPage(Lcustom_classes/BoardNames;)V: Line 41
   * Goal 10. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 311
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Email email0 = Email.ASD;
      Passwords passwords0 = Passwords.ASD;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords0);
      classUnderTestApogen0.goToHomePageIndexPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames0 = BoardNames.ANOTHER_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames0);
      BoardNames boardNames1 = BoardNames.ANOTHER_BOARD;
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames1);
      classUnderTestApogen0.goToBoardPageOwnedBoardsPage();
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToBoardPageOwnedBoardsPage();
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      BoardNames boardNames2 = BoardNames.ANOTHER_BOARD;
      classUnderTestApogen0.goToBoardUsingNavbarHomePage(boardNames2);
      classUnderTestApogen0.goToBoardPageOwnedBoardsPage();
      ListNames listNames0 = ListNames.WORK_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToBoardPageOwnedBoardsPage();
      ListNames listNames1 = ListNames.WORK_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames1);
      BoardNames boardNames3 = BoardNames.ANOTHER_BOARD;
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames3);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.goToIndexHomePage();
  }

  //Test case number: 3
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_new_listBoardPage(Lcustom_classes/ListNames;)V: Line 168
   * Goal 2. main.ClassUnderTestApogen.goToBoardPageInsertCardPage()V: Line 377
   * Goal 3. main.ClassUnderTestApogen.goToBoardUsingNavbarBoardPage(Lcustom_classes/BoardNames;)V: Line 183
   * Goal 4. main.ClassUnderTestApogen.goToHomePageIndexPage()V: Line 277
   * Goal 5. main.ClassUnderTestApogen.goToHomePageNewBoardPage()V: Line 27
   * Goal 6. main.ClassUnderTestApogen.goToHomePageOwnedBoardsPage()V: Line 263
   * Goal 7. main.ClassUnderTestApogen.goToIndexHomePage()V: Line 121
   * Goal 8. main.ClassUnderTestApogen.goToInsertCardPageBoardPage(Lcustom_classes/ListNames;)V: Line 226
   * Goal 9. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 10. main.ClassUnderTestApogen.goToSignUpIndexPage()V: Line 291
   * Goal 11. main.ClassUnderTestApogen.new_board_formNewBoardPage(Lcustom_classes/BoardNames;)V: Line 41
   * Goal 12. main.ClassUnderTestApogen.seeAvailableBoardsHomePage()V: Line 150
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToHomePageIndexPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      classUnderTestApogen0.goToHomePageNewBoardPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames0 = BoardNames.PERSONAL_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames0);
      ListNames listNames0 = ListNames.MY_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      ListNames listNames1 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames1);
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      ListNames listNames2 = ListNames.MY_LIST;
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.seeAvailableBoardsHomePage();
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames1 = BoardNames.ANOTHER_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames1);
      classUnderTestApogen0.add_new_listBoardPage(listNames2);
      ListNames listNames3 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames3);
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames3);
      classUnderTestApogen0.goToBoardPageInsertCardPage();
      classUnderTestApogen0.add_new_listBoardPage(listNames2);
      BoardNames boardNames2 = BoardNames.PERSONAL_BOARD;
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames2);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.goToIndexHomePage();
      classUnderTestApogen0.goToSignUpIndexPage();
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToHomePageNewBoardPage()V: Line 27
   * Goal 2. main.ClassUnderTestApogen.goToIndexHomePage()V: Line 121
   * Goal 3. main.ClassUnderTestApogen.goToIndexSignUpPage()V: Line 329
   * Goal 4. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 5. main.ClassUnderTestApogen.goToSignUpIndexPage()V: Line 291
   * Goal 6. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 314
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords0);
      classUnderTestApogen0.goToNewBoardPageHomePage();
      classUnderTestApogen0.goToHomePageNewBoardPage();
      classUnderTestApogen0.goToIndexHomePage();
      classUnderTestApogen0.goToSignUpIndexPage();
      classUnderTestApogen0.goToIndexSignUpPage();
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToSignUpIndexPage()V: Line 291
   * Goal 2. main.ClassUnderTestApogen.sign_up_formSignUpPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 355
   * Goal 3. main.ClassUnderTestApogen.sign_up_formSignUpPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 358
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToSignUpIndexPage();
      PeopleNames peopleNames0 = PeopleNames.MIKE;
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTestApogen0.sign_up_formSignUpPage(peopleNames0, peopleNames0, email0, passwords0, passwords0);
      Passwords passwords1 = Passwords.JOHNDOE;
      PeopleNames peopleNames1 = PeopleNames.MARK;
      PeopleNames peopleNames2 = PeopleNames.LUKE;
      classUnderTestApogen0.sign_up_formSignUpPage(peopleNames1, peopleNames2, email0, passwords0, passwords1);
      PeopleNames peopleNames3 = PeopleNames.MIKE;
      Email email1 = Email.ASD;
      classUnderTestApogen0.sign_up_formSignUpPage(peopleNames3, peopleNames2, email1, passwords0, passwords0);
  }
}
