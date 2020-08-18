/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 18 05:50:20 GMT 2020
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
   * 16 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_new_listBoardPage(Lcustom_classes/ListNames;)V: Line 168
   * Goal 2. main.ClassUnderTestApogen.deleteCardCardDetailsPage()V: Line 56
   * Goal 3. main.ClassUnderTestApogen.goToBoardPageInsertCardPage()V: Line 377
   * Goal 4. main.ClassUnderTestApogen.goToBoardPageOwnedBoardsPage()V: Line 245
   * Goal 5. main.ClassUnderTestApogen.goToBoardUsingNavbarBoardPage(Lcustom_classes/BoardNames;)V: Line 183
   * Goal 6. main.ClassUnderTestApogen.goToCardDetailsPageBoardPage(Lcustom_classes/ListNames;Lcustom_classes/Id;)V: Line 205
   * Goal 7. main.ClassUnderTestApogen.goToHomePageIndexPage()V: Line 277
   * Goal 8. main.ClassUnderTestApogen.goToIndexHomePage()V: Line 121
   * Goal 9. main.ClassUnderTestApogen.goToInsertCardPageBoardPage(Lcustom_classes/ListNames;)V: Line 226
   * Goal 10. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 11. main.ClassUnderTestApogen.goToSignUpIndexPage()V: Line 291
   * Goal 12. main.ClassUnderTestApogen.new_board_formNewBoardPage(Lcustom_classes/BoardNames;)V: Line 41
   * Goal 13. main.ClassUnderTestApogen.new_card_formInsertCardPage(Lcustom_classes/CardText;)V: Line 391
   * Goal 14. main.ClassUnderTestApogen.save_commentCardDetailsPage(Lcustom_classes/CardComment;)V: Line 89
   * Goal 15. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 311
   * Goal 16. main.ClassUnderTestApogen.sign_up_formSignUpPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 358
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Email email0 = Email.ASD;
      Passwords passwords0 = Passwords.ASD;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords0);
      classUnderTestApogen0.goToHomePageIndexPage();
      classUnderTestApogen0.goToIndexHomePage();
      classUnderTestApogen0.goToSignUpIndexPage();
      PeopleNames peopleNames0 = PeopleNames.MIKE;
      PeopleNames peopleNames1 = PeopleNames.MARK;
      Passwords passwords1 = Passwords.JOHNDOE;
      classUnderTestApogen0.sign_up_formSignUpPage(peopleNames0, peopleNames1, email0, passwords1, passwords1);
      BoardNames boardNames0 = BoardNames.ANOTHER_BOARD;
      classUnderTestApogen0.goToIndexHomePage();
      Passwords passwords2 = Passwords.ASD;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords2);
      classUnderTestApogen0.goToHomePageIndexPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames0);
      ListNames listNames0 = ListNames.MY_LIST;
      int int0 = 3072;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToBoardPageOwnedBoardsPage();
      ListNames listNames1 = ListNames.WORK_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames1);
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames0);
      CardText cardText0 = CardText.SHOPPING;
      classUnderTestApogen0.new_card_formInsertCardPage(cardText0);
      classUnderTestApogen0.add_new_listBoardPage(listNames1);
      CardComment cardComment0 = CardComment.EXAMPLE;
      classUnderTestApogen0.goToCardDetailsPageBoardPage(listNames0, id0);
      classUnderTestApogen0.save_commentCardDetailsPage(cardComment0);
      classUnderTestApogen0.deleteCardCardDetailsPage();
      ListNames listNames2 = ListNames.WORK_LIST;
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames2);
      classUnderTestApogen0.goToBoardPageInsertCardPage();
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_new_listBoardPage(Lcustom_classes/ListNames;)V: Line 168
   * Goal 2. main.ClassUnderTestApogen.goToBoardPageCardDetailsPage()V: Line 70
   * Goal 3. main.ClassUnderTestApogen.goToBoardPageOwnedBoardsPage()V: Line 245
   * Goal 4. main.ClassUnderTestApogen.goToBoardUsingNavbarBoardPage(Lcustom_classes/BoardNames;)V: Line 183
   * Goal 5. main.ClassUnderTestApogen.goToCardDetailsPageBoardPage(Lcustom_classes/ListNames;Lcustom_classes/Id;)V: Line 205
   * Goal 6. main.ClassUnderTestApogen.goToInsertCardPageBoardPage(Lcustom_classes/ListNames;)V: Line 226
   * Goal 7. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 8. main.ClassUnderTestApogen.new_board_formNewBoardPage(Lcustom_classes/BoardNames;)V: Line 41
   * Goal 9. main.ClassUnderTestApogen.new_card_formInsertCardPage(Lcustom_classes/CardText;)V: Line 391
   * Goal 10. main.ClassUnderTestApogen.save_commentCardDetailsPage(Lcustom_classes/CardComment;)V: Line 89
   * Goal 11. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 314
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords0);
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames0 = BoardNames.ANOTHER_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames0);
      ListNames listNames0 = ListNames.WORK_LIST;
      ListNames listNames1 = ListNames.WORK_LIST;
      int int0 = 579;
      Id id0 = new Id(int0);
      ListNames listNames2 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames2);
      ListNames listNames3 = ListNames.WORK_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames3);
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToBoardPageOwnedBoardsPage();
      classUnderTestApogen0.goToInsertCardPageBoardPage(listNames1);
      CardText cardText0 = CardText.SHOPPING;
      classUnderTestApogen0.new_card_formInsertCardPage(cardText0);
      ListNames listNames4 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames4);
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToBoardPageOwnedBoardsPage();
      classUnderTestApogen0.goToCardDetailsPageBoardPage(listNames0, id0);
      CardComment cardComment0 = CardComment.SHOPPING;
      classUnderTestApogen0.save_commentCardDetailsPage(cardComment0);
      classUnderTestApogen0.goToBoardPageCardDetailsPage();
      ListNames listNames5 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames5);
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
   * Goal 10. main.ClassUnderTestApogen.seeAvailableBoardsHomePage()V: Line 150
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToHomePageIndexPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames0 = BoardNames.WORK_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames0);
      BoardNames boardNames1 = BoardNames.PERSONAL_BOARD;
      ListNames listNames0 = ListNames.ANOTHER_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      BoardNames boardNames2 = BoardNames.WORK_BOARD;
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames2);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames3 = BoardNames.PERSONAL_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames3);
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames3);
      classUnderTestApogen0.goToBoardPageOwnedBoardsPage();
      ListNames listNames1 = ListNames.WORK_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames1);
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames1);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.goToBoardUsingNavbarHomePage(boardNames0);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.seeAvailableBoardsHomePage();
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.goToIndexHomePage();
      classUnderTestApogen0.goToHomePageIndexPage();
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToHomePageIndexPage()V: Line 277
   * Goal 2. main.ClassUnderTestApogen.goToHomePageNewBoardPage()V: Line 27
   * Goal 3. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 4. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 311
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.ASD;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords0);
      classUnderTestApogen0.goToHomePageIndexPage();
      classUnderTestApogen0.goToNewBoardPageHomePage();
      classUnderTestApogen0.goToHomePageNewBoardPage();
  }

  //Test case number: 4
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_new_listBoardPage(Lcustom_classes/ListNames;)V: Line 168
   * Goal 2. main.ClassUnderTestApogen.goToBoardUsingNavbarBoardPage(Lcustom_classes/BoardNames;)V: Line 183
   * Goal 3. main.ClassUnderTestApogen.goToHomePageOwnedBoardsPage()V: Line 263
   * Goal 4. main.ClassUnderTestApogen.goToIndexHomePage()V: Line 121
   * Goal 5. main.ClassUnderTestApogen.goToIndexSignUpPage()V: Line 329
   * Goal 6. main.ClassUnderTestApogen.goToNewBoardPageHomePage()V: Line 135
   * Goal 7. main.ClassUnderTestApogen.goToSignUpIndexPage()V: Line 291
   * Goal 8. main.ClassUnderTestApogen.new_board_formNewBoardPage(Lcustom_classes/BoardNames;)V: Line 41
   * Goal 9. main.ClassUnderTestApogen.seeAvailableBoardsHomePage()V: Line 150
   * Goal 10. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 314
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords0);
      classUnderTestApogen0.goToNewBoardPageHomePage();
      BoardNames boardNames0 = BoardNames.ANOTHER_BOARD;
      classUnderTestApogen0.new_board_formNewBoardPage(boardNames0);
      ListNames listNames0 = ListNames.WORK_LIST;
      classUnderTestApogen0.add_new_listBoardPage(listNames0);
      classUnderTestApogen0.goToBoardUsingNavbarBoardPage(boardNames0);
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.seeAvailableBoardsHomePage();
      classUnderTestApogen0.goToHomePageOwnedBoardsPage();
      classUnderTestApogen0.goToIndexHomePage();
      classUnderTestApogen0.goToSignUpIndexPage();
      classUnderTestApogen0.goToIndexSignUpPage();
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToIndexSignUpPage()V: Line 329
   * Goal 2. main.ClassUnderTestApogen.goToSignUpIndexPage()V: Line 291
   * Goal 3. main.ClassUnderTestApogen.sign_in_formIndexPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 311
   * Goal 4. main.ClassUnderTestApogen.sign_up_formSignUpPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 355
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.ASD;
      classUnderTestApogen0.sign_in_formIndexPage(email0, passwords0);
      classUnderTestApogen0.goToSignUpIndexPage();
      PeopleNames peopleNames0 = PeopleNames.MIKE;
      PeopleNames peopleNames1 = PeopleNames.ASD;
      classUnderTestApogen0.sign_up_formSignUpPage(peopleNames0, peopleNames1, email0, passwords0, passwords0);
      classUnderTestApogen0.goToIndexSignUpPage();
      Email email1 = Email.ASD;
      Passwords passwords1 = Passwords.JOHNDOE;
      classUnderTestApogen0.sign_in_formIndexPage(email1, passwords1);
  }
}
