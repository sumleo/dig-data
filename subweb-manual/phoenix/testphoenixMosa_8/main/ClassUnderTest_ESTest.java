/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 19 03:45:56 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.BoardNames;
import custom_classes.CardComment;
import custom_classes.CardDescription;
import custom_classes.CardText;
import custom_classes.Email;
import custom_classes.Id;
import custom_classes.ListNames;
import custom_classes.Passwords;
import custom_classes.PeopleNames;
import main.ClassUnderTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTest_ESTest extends ClassUnderTest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTest.addCommentCardDetails(Lcustom_classes/CardComment;)V: Line 412
   * Goal 2. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 3. main.ClassUnderTest.addNewCardToListBoardListContainerPage(Lcustom_classes/ListNames;Lcustom_classes/CardText;)V: Line 149
   * Goal 4. main.ClassUnderTest.addNewListBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 169
   * Goal 5. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 194
   * Goal 6. main.ClassUnderTest.deleteCardCardDetails()V: Line 486
   * Goal 7. main.ClassUnderTest.editDescriptionCardDetails(Lcustom_classes/CardText;Lcustom_classes/CardDescription;)V: Line 512
   * Goal 8. main.ClassUnderTest.goToBoardListBoardListContainerPage()V: Line 216
   * Goal 9. main.ClassUnderTest.goToBoardListBoardsContainerPage()V: Line 63
   * Goal 10. main.ClassUnderTest.goToBoardUsingNavbarBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 79
   * Goal 11. main.ClassUnderTest.goToCardOfListBoardListContainerPage(Lcustom_classes/ListNames;Lcustom_classes/Id;)V: Line 256
   * Goal 12. main.ClassUnderTest.loginAsJohnLoginContainerPage()V: Line 601
   * Goal 13. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 14. main.ClassUnderTest.openAddNewBoardFormBoardsContainerPage()V: Line 98
   * Goal 15. main.ClassUnderTest.openAddNewListFormBoardListContainerPage()V: Line 276
   * Goal 16. main.ClassUnderTest.openAddNewMemberFormBoardListContainerPage()V: Line 292
   * Goal 17. main.ClassUnderTest.openEditDescriptionFormCardDetails()V: Line 529
   * Goal 18. main.ClassUnderTest.signOutBoardListContainerPage()V: Line 352
   * Goal 19. main.ClassUnderTest.viewAllBoardsBoardsContainerPage()V: Line 127
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.loginAsJohnLoginContainerPage();
      classUnderTest0.goToBoardListBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      BoardNames boardNames0 = BoardNames.MY_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      ListNames listNames0 = ListNames.ANOTHER_LIST;
      classUnderTest0.goToBoardListBoardListContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      BoardNames boardNames1 = BoardNames.MY_BOARD;
      classUnderTest0.goToBoardUsingNavbarBoardsContainerPage(boardNames1);
      classUnderTest0.openAddNewMemberFormBoardListContainerPage();
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.addNewListBoardListContainerPage(listNames0);
      Email email0 = Email.ASD;
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email0);
      ListNames listNames1 = ListNames.ANOTHER_LIST;
      CardText cardText0 = CardText.EXAMPLE;
      classUnderTest0.addNewCardToListBoardListContainerPage(listNames1, cardText0);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      int int0 = 1014;
      Id id0 = new Id(int0);
      classUnderTest0.goToCardOfListBoardListContainerPage(listNames1, id0);
      classUnderTest0.openEditDescriptionFormCardDetails();
      classUnderTest0.openEditDescriptionFormCardDetails();
      CardComment cardComment0 = CardComment.SHOPPING;
      classUnderTest0.addCommentCardDetails(cardComment0);
      CardText cardText1 = CardText.LAUNDRY;
      CardDescription cardDescription0 = CardDescription.SHOPPING;
      classUnderTest0.editDescriptionCardDetails(cardText1, cardDescription0);
      CardDescription cardDescription1 = CardDescription.EXAMPLE;
      classUnderTest0.editDescriptionCardDetails(cardText0, cardDescription1);
      classUnderTest0.deleteCardCardDetails();
      classUnderTest0.signOutBoardListContainerPage();
      Email email1 = Email.ASD;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email1, passwords0);
  }

  //Test case number: 1
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.addCommentCardDetails(Lcustom_classes/CardComment;)V: Line 412
   * Goal 2. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 3. main.ClassUnderTest.addNewCardToListBoardListContainerPage(Lcustom_classes/ListNames;Lcustom_classes/CardText;)V: Line 149
   * Goal 4. main.ClassUnderTest.addNewListBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 169
   * Goal 5. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 197
   * Goal 6. main.ClassUnderTest.closeCardDetailsCardDetails()V: Line 471
   * Goal 7. main.ClassUnderTest.goToBoardListBoardListContainerPage()V: Line 216
   * Goal 8. main.ClassUnderTest.goToCardOfListBoardListContainerPage(Lcustom_classes/ListNames;Lcustom_classes/Id;)V: Line 256
   * Goal 9. main.ClassUnderTest.goToSignInPageSignUpContainerPage()V: Line 642
   * Goal 10. main.ClassUnderTest.goToSignUpLoginContainerPage()V: Line 587
   * Goal 11. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 12. main.ClassUnderTest.signOutBoardsContainerPage()V: Line 112
   * Goal 13. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 718
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToSignUpLoginContainerPage();
      PeopleNames peopleNames0 = PeopleNames.LUKE;
      Email email0 = Email.ASD;
      Passwords passwords0 = Passwords.ASD;
      Passwords passwords1 = Passwords.ASD;
      classUnderTest0.signUpSignUpContainerPage(peopleNames0, peopleNames0, email0, passwords0, passwords1);
      BoardNames boardNames0 = BoardNames.PERSONAL_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      ListNames listNames0 = ListNames.WORK_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames0);
      CardText cardText0 = CardText.SHOPPING;
      classUnderTest0.addNewCardToListBoardListContainerPage(listNames0, cardText0);
      Email email1 = Email.JOHNDOE;
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email1);
      int int0 = (-3026);
      Id id0 = new Id(int0);
      classUnderTest0.goToCardOfListBoardListContainerPage(listNames0, id0);
      CardComment cardComment0 = CardComment.PERSONAL;
      classUnderTest0.addCommentCardDetails(cardComment0);
      classUnderTest0.closeCardDetailsCardDetails();
      classUnderTest0.goToBoardListBoardListContainerPage();
      classUnderTest0.signOutBoardsContainerPage();
      Email email2 = Email.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email2, passwords1);
      Email email3 = Email.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email3, passwords1);
      classUnderTest0.goToSignUpLoginContainerPage();
      classUnderTest0.goToSignInPageSignUpContainerPage();
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.goToBoardClickingOnItBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 45
   * Goal 3. main.ClassUnderTest.goToBoardListBoardsContainerPage()V: Line 63
   * Goal 4. main.ClassUnderTest.goToSignInPageSignUpContainerPage()V: Line 642
   * Goal 5. main.ClassUnderTest.goToSignUpLoginContainerPage()V: Line 587
   * Goal 6. main.ClassUnderTest.loginAsJohnLoginContainerPage()V: Line 601
   * Goal 7. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 8. main.ClassUnderTest.openAddNewBoardFormBoardsContainerPage()V: Line 98
   * Goal 9. main.ClassUnderTest.signOutBoardListContainerPage()V: Line 352
   * Goal 10. main.ClassUnderTest.signOutBoardsContainerPage()V: Line 112
   * Goal 11. main.ClassUnderTest.viewAllBoardsBoardListContainerPage()V: Line 393
   * Goal 12. main.ClassUnderTest.viewAllBoardsBoardsContainerPage()V: Line 127
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.loginAsJohnLoginContainerPage();
      BoardNames boardNames0 = BoardNames.MY_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.signOutBoardListContainerPage();
      Email email0 = Email.ASD;
      Passwords passwords0 = Passwords.ASD;
      classUnderTest0.loginLoginContainerPage(email0, passwords0);
      Email email1 = Email.ASD;
      Passwords passwords1 = Passwords.ASD;
      classUnderTest0.loginLoginContainerPage(email1, passwords1);
      classUnderTest0.goToSignUpLoginContainerPage();
      classUnderTest0.goToSignInPageSignUpContainerPage();
      classUnderTest0.loginAsJohnLoginContainerPage();
      classUnderTest0.signOutBoardsContainerPage();
      classUnderTest0.loginAsJohnLoginContainerPage();
      classUnderTest0.goToBoardClickingOnItBoardsContainerPage(boardNames0);
      classUnderTest0.viewAllBoardsBoardListContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      classUnderTest0.signOutBoardsContainerPage();
      classUnderTest0.loginAsJohnLoginContainerPage();
      classUnderTest0.goToBoardListBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
  }

  //Test case number: 3
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.addNewListBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 169
   * Goal 3. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 194
   * Goal 4. main.ClassUnderTest.goToBoardListBoardListContainerPage()V: Line 216
   * Goal 5. main.ClassUnderTest.goToBoardUsingNavbarBoardListContainerPage(Lcustom_classes/BoardNames;)V: Line 232
   * Goal 6. main.ClassUnderTest.goToBoardUsingNavbarBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 79
   * Goal 7. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 8. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 627
   * Goal 9. main.ClassUnderTest.openAddNewListFormBoardListContainerPage()V: Line 276
   * Goal 10. main.ClassUnderTest.openAddNewMemberFormBoardListContainerPage()V: Line 292
   * Goal 11. main.ClassUnderTest.openNewCardToListFormBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 313
   * Goal 12. main.ClassUnderTest.openUpdateListFormBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 334
   * Goal 13. main.ClassUnderTest.signOutBoardListContainerPage()V: Line 352
   * Goal 14. main.ClassUnderTest.signOutBoardsContainerPage()V: Line 112
   * Goal 15. main.ClassUnderTest.updateListBoardListContainerPage(Lcustom_classes/ListNames;Lcustom_classes/ListNames;)V: Line 372
   * Goal 16. main.ClassUnderTest.viewAllBoardsBoardsContainerPage()V: Line 127
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.ASD;
      classUnderTest0.loginLoginContainerPage(email0, passwords0);
      Email email1 = Email.JOHNDOE;
      Passwords passwords1 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email1, passwords1);
      BoardNames boardNames0 = BoardNames.WORK_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.goToBoardUsingNavbarBoardListContainerPage(boardNames0);
      classUnderTest0.goToBoardListBoardListContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      classUnderTest0.signOutBoardsContainerPage();
      classUnderTest0.loginLoginContainerPage(email0, passwords1);
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      Email email2 = Email.JOHNDOE;
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email2);
      ListNames listNames0 = ListNames.PERSONAL_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames0);
      ListNames listNames1 = ListNames.MY_LIST;
      ListNames listNames2 = ListNames.MY_LIST;
      classUnderTest0.updateListBoardListContainerPage(listNames0, listNames2);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.openAddNewMemberFormBoardListContainerPage();
      ListNames listNames3 = ListNames.MY_LIST;
      classUnderTest0.goToBoardUsingNavbarBoardListContainerPage(boardNames0);
      ListNames listNames4 = ListNames.WORK_LIST;
      classUnderTest0.updateListBoardListContainerPage(listNames3, listNames4);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.signOutBoardListContainerPage();
      Email email3 = Email.JOHNDOE;
      Passwords passwords2 = Passwords.ASD;
      classUnderTest0.loginLoginContainerPage(email3, passwords2);
      classUnderTest0.loginLoginContainerPage(email3, passwords1);
      classUnderTest0.goToBoardUsingNavbarBoardsContainerPage(boardNames0);
      classUnderTest0.addNewListBoardListContainerPage(listNames1);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      ListNames listNames5 = ListNames.ANOTHER_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames5);
      ListNames listNames6 = ListNames.MY_LIST;
      classUnderTest0.openNewCardToListFormBoardListContainerPage(listNames6);
      classUnderTest0.openAddNewMemberFormBoardListContainerPage();
      ListNames listNames7 = ListNames.WORK_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames7);
      classUnderTest0.openAddNewMemberFormBoardListContainerPage();
      classUnderTest0.goToBoardUsingNavbarBoardListContainerPage(boardNames0);
      ListNames listNames8 = ListNames.MY_LIST;
      classUnderTest0.openUpdateListFormBoardListContainerPage(listNames8);
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email3);
      classUnderTest0.goToBoardListBoardListContainerPage();
  }

  //Test case number: 4
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.addNewListBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 169
   * Goal 3. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 194
   * Goal 4. main.ClassUnderTest.goToBoardListBoardsContainerPage()V: Line 63
   * Goal 5. main.ClassUnderTest.goToSignUpLoginContainerPage()V: Line 587
   * Goal 6. main.ClassUnderTest.openAddNewListFormBoardListContainerPage()V: Line 276
   * Goal 7. main.ClassUnderTest.openUpdateListFormBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 334
   * Goal 8. main.ClassUnderTest.signUpFailurePasswordSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 675
   * Goal 9. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 718
   * Goal 10. main.ClassUnderTest.viewAllBoardsBoardListContainerPage()V: Line 393
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToSignUpLoginContainerPage();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      PeopleNames peopleNames1 = PeopleNames.MIKE;
      Email email0 = Email.ASD;
      Passwords passwords0 = Passwords.ASD;
      Passwords passwords1 = Passwords.JOHNDOE;
      classUnderTest0.signUpFailurePasswordSignUpContainerPage(peopleNames0, peopleNames1, email0, passwords0, passwords1);
      Passwords passwords2 = Passwords.JOHNDOE;
      PeopleNames peopleNames2 = PeopleNames.ASD;
      PeopleNames peopleNames3 = PeopleNames.LUKE;
      Passwords passwords3 = Passwords.JOHNDOE;
      classUnderTest0.signUpSignUpContainerPage(peopleNames2, peopleNames3, email0, passwords2, passwords3);
      BoardNames boardNames0 = BoardNames.ANOTHER_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      ListNames listNames0 = ListNames.MY_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames0);
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email0);
      ListNames listNames1 = ListNames.MY_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames1);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.openUpdateListFormBoardListContainerPage(listNames1);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.viewAllBoardsBoardListContainerPage();
      BoardNames boardNames1 = BoardNames.ANOTHER_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames1);
      classUnderTest0.viewAllBoardsBoardListContainerPage();
      classUnderTest0.goToBoardListBoardsContainerPage();
  }

  //Test case number: 5
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTest.goToSignInPageSignUpContainerPage()V: Line 642
   * Goal 2. main.ClassUnderTest.goToSignUpLoginContainerPage()V: Line 587
   * Goal 3. main.ClassUnderTest.loginAsJohnLoginContainerPage()V: Line 601
   * Goal 4. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 5. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 627
   * Goal 6. main.ClassUnderTest.openAddNewBoardFormBoardsContainerPage()V: Line 98
   * Goal 7. main.ClassUnderTest.signOutBoardsContainerPage()V: Line 112
   * Goal 8. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 715
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToSignUpLoginContainerPage();
      PeopleNames peopleNames0 = PeopleNames.LUKE;
      PeopleNames peopleNames1 = PeopleNames.JOHN;
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.JOHNDOE;
      Passwords passwords1 = Passwords.JOHNDOE;
      classUnderTest0.signUpSignUpContainerPage(peopleNames0, peopleNames1, email0, passwords0, passwords1);
      PeopleNames peopleNames2 = PeopleNames.JOHN;
      Email email1 = Email.JOHNDOE;
      Passwords passwords2 = Passwords.JOHNDOE;
      classUnderTest0.signUpSignUpContainerPage(peopleNames1, peopleNames2, email1, passwords2, passwords2);
      classUnderTest0.goToSignInPageSignUpContainerPage();
      Passwords passwords3 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email1, passwords3);
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      classUnderTest0.signOutBoardsContainerPage();
      classUnderTest0.loginAsJohnLoginContainerPage();
      classUnderTest0.signOutBoardsContainerPage();
      Email email2 = Email.ASD;
      Passwords passwords4 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email2, passwords4);
      classUnderTest0.loginAsJohnLoginContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
  }
}
