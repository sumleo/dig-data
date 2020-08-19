/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 19 01:36:15 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.BoardNames;
import custom_classes.CardText;
import custom_classes.Email;
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
   * 15 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.addNewListBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 169
   * Goal 3. main.ClassUnderTest.goToSignInPageSignUpContainerPage()V: Line 642
   * Goal 4. main.ClassUnderTest.goToSignUpLoginContainerPage()V: Line 587
   * Goal 5. main.ClassUnderTest.loginAsJohnLoginContainerPage()V: Line 601
   * Goal 6. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 7. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 627
   * Goal 8. main.ClassUnderTest.openAddNewListFormBoardListContainerPage()V: Line 276
   * Goal 9. main.ClassUnderTest.openAddNewMemberFormBoardListContainerPage()V: Line 292
   * Goal 10. main.ClassUnderTest.openUpdateListFormBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 334
   * Goal 11. main.ClassUnderTest.signOutBoardListContainerPage()V: Line 352
   * Goal 12. main.ClassUnderTest.signOutBoardsContainerPage()V: Line 112
   * Goal 13. main.ClassUnderTest.signUpFailurePasswordSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 675
   * Goal 14. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 715
   * Goal 15. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 718
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToSignUpLoginContainerPage();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      Email email0 = Email.ASD;
      Passwords passwords0 = Passwords.ASD;
      Passwords passwords1 = Passwords.JOHNDOE;
      classUnderTest0.signUpFailurePasswordSignUpContainerPage(peopleNames0, peopleNames0, email0, passwords0, passwords1);
      PeopleNames peopleNames1 = PeopleNames.MARK;
      PeopleNames peopleNames2 = PeopleNames.LUKE;
      Email email1 = Email.JOHNDOE;
      Passwords passwords2 = Passwords.JOHNDOE;
      Passwords passwords3 = Passwords.JOHNDOE;
      classUnderTest0.signUpSignUpContainerPage(peopleNames1, peopleNames2, email1, passwords2, passwords3);
      PeopleNames peopleNames3 = PeopleNames.MIKE;
      classUnderTest0.signUpFailurePasswordSignUpContainerPage(peopleNames3, peopleNames2, email1, passwords0, passwords3);
      PeopleNames peopleNames4 = PeopleNames.ASD;
      PeopleNames peopleNames5 = PeopleNames.LUKE;
      Email email2 = Email.ASD;
      Passwords passwords4 = Passwords.JOHNDOE;
      Passwords passwords5 = Passwords.JOHNDOE;
      classUnderTest0.signUpSignUpContainerPage(peopleNames4, peopleNames5, email2, passwords4, passwords5);
      BoardNames boardNames0 = BoardNames.MY_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.openAddNewMemberFormBoardListContainerPage();
      ListNames listNames0 = ListNames.PERSONAL_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames0);
      classUnderTest0.openUpdateListFormBoardListContainerPage(listNames0);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.signOutBoardListContainerPage();
      classUnderTest0.goToSignUpLoginContainerPage();
      classUnderTest0.goToSignInPageSignUpContainerPage();
      Email email3 = Email.JOHNDOE;
      Passwords passwords6 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email3, passwords6);
      classUnderTest0.signOutBoardsContainerPage();
      Email email4 = Email.JOHNDOE;
      Passwords passwords7 = Passwords.ASD;
      classUnderTest0.loginLoginContainerPage(email4, passwords7);
      classUnderTest0.goToSignUpLoginContainerPage();
      classUnderTest0.goToSignInPageSignUpContainerPage();
      classUnderTest0.loginAsJohnLoginContainerPage();
  }

  //Test case number: 1
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.addNewCardToListBoardListContainerPage(Lcustom_classes/ListNames;Lcustom_classes/CardText;)V: Line 149
   * Goal 3. main.ClassUnderTest.addNewListBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 169
   * Goal 4. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 194
   * Goal 5. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 197
   * Goal 6. main.ClassUnderTest.goToBoardClickingOnItBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 45
   * Goal 7. main.ClassUnderTest.goToBoardListBoardListContainerPage()V: Line 216
   * Goal 8. main.ClassUnderTest.goToSignUpLoginContainerPage()V: Line 587
   * Goal 9. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 10. main.ClassUnderTest.openAddNewBoardFormBoardsContainerPage()V: Line 98
   * Goal 11. main.ClassUnderTest.openAddNewListFormBoardListContainerPage()V: Line 276
   * Goal 12. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 718
   * Goal 13. main.ClassUnderTest.viewAllBoardsBoardsContainerPage()V: Line 127
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      Email email0 = Email.ASD;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email0, passwords0);
      classUnderTest0.loginLoginContainerPage(email0, passwords0);
      classUnderTest0.goToSignUpLoginContainerPage();
      PeopleNames peopleNames0 = PeopleNames.ASD;
      PeopleNames peopleNames1 = PeopleNames.MARK;
      classUnderTest0.signUpSignUpContainerPage(peopleNames0, peopleNames1, email0, passwords0, passwords0);
      BoardNames boardNames0 = BoardNames.PERSONAL_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email0);
      classUnderTest0.goToBoardListBoardListContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      classUnderTest0.goToBoardClickingOnItBoardsContainerPage(boardNames0);
      Email email1 = Email.JOHNDOE;
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email1);
      ListNames listNames0 = ListNames.WORK_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames0);
      CardText cardText0 = CardText.PERSONAL;
      classUnderTest0.addNewCardToListBoardListContainerPage(listNames0, cardText0);
      ListNames listNames1 = ListNames.MY_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames1);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
  }

  //Test case number: 2
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.goToBoardClickingOnItBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 45
   * Goal 3. main.ClassUnderTest.goToBoardListBoardsContainerPage()V: Line 63
   * Goal 4. main.ClassUnderTest.goToSignInPageSignUpContainerPage()V: Line 642
   * Goal 5. main.ClassUnderTest.goToSignUpLoginContainerPage()V: Line 587
   * Goal 6. main.ClassUnderTest.loginAsJohnLoginContainerPage()V: Line 601
   * Goal 7. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 8. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 627
   * Goal 9. main.ClassUnderTest.signOutBoardListContainerPage()V: Line 352
   * Goal 10. main.ClassUnderTest.signOutBoardsContainerPage()V: Line 112
   * Goal 11. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 715
   * Goal 12. main.ClassUnderTest.viewAllBoardsBoardListContainerPage()V: Line 393
   * Goal 13. main.ClassUnderTest.viewAllBoardsBoardsContainerPage()V: Line 127
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.loginAsJohnLoginContainerPage();
      BoardNames boardNames0 = BoardNames.ANOTHER_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.signOutBoardListContainerPage();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email0, passwords0);
      Passwords passwords1 = Passwords.ASD;
      classUnderTest0.goToBoardClickingOnItBoardsContainerPage(boardNames0);
      classUnderTest0.viewAllBoardsBoardListContainerPage();
      classUnderTest0.goToBoardListBoardsContainerPage();
      classUnderTest0.goToBoardListBoardsContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      classUnderTest0.signOutBoardsContainerPage();
      classUnderTest0.goToSignUpLoginContainerPage();
      PeopleNames peopleNames0 = PeopleNames.LUKE;
      Email email1 = Email.JOHNDOE;
      Passwords passwords2 = Passwords.ASD;
      classUnderTest0.signUpSignUpContainerPage(peopleNames0, peopleNames0, email1, passwords1, passwords2);
      PeopleNames peopleNames1 = PeopleNames.LUKE;
      Email email2 = Email.JOHNDOE;
      Passwords passwords3 = Passwords.ASD;
      Passwords passwords4 = Passwords.ASD;
      classUnderTest0.signUpSignUpContainerPage(peopleNames0, peopleNames1, email2, passwords3, passwords4);
      PeopleNames peopleNames2 = PeopleNames.LUKE;
      PeopleNames peopleNames3 = PeopleNames.ASD;
      Passwords passwords5 = Passwords.JOHNDOE;
      Passwords passwords6 = Passwords.JOHNDOE;
      classUnderTest0.signUpSignUpContainerPage(peopleNames2, peopleNames3, email2, passwords5, passwords6);
      classUnderTest0.goToSignInPageSignUpContainerPage();
      Email email3 = Email.ASD;
      classUnderTest0.loginLoginContainerPage(email3, passwords5);
      Email email4 = Email.ASD;
      classUnderTest0.loginLoginContainerPage(email4, passwords0);
  }

  //Test case number: 3
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 194
   * Goal 3. main.ClassUnderTest.goToBoardListBoardListContainerPage()V: Line 216
   * Goal 4. main.ClassUnderTest.goToBoardListBoardsContainerPage()V: Line 63
   * Goal 5. main.ClassUnderTest.goToBoardUsingNavbarBoardListContainerPage(Lcustom_classes/BoardNames;)V: Line 232
   * Goal 6. main.ClassUnderTest.loginAsJohnLoginContainerPage()V: Line 601
   * Goal 7. main.ClassUnderTest.openAddNewBoardFormBoardsContainerPage()V: Line 98
   * Goal 8. main.ClassUnderTest.openAddNewListFormBoardListContainerPage()V: Line 276
   * Goal 9. main.ClassUnderTest.signOutBoardsContainerPage()V: Line 112
   * Goal 10. main.ClassUnderTest.viewAllBoardsBoardListContainerPage()V: Line 393
   * Goal 11. main.ClassUnderTest.viewAllBoardsBoardsContainerPage()V: Line 127
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.loginAsJohnLoginContainerPage();
      BoardNames boardNames0 = BoardNames.WORK_BOARD;
      Email email0 = Email.ASD;
      classUnderTest0.goToBoardListBoardsContainerPage();
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.viewAllBoardsBoardListContainerPage();
      classUnderTest0.signOutBoardsContainerPage();
      classUnderTest0.loginAsJohnLoginContainerPage();
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.goToBoardUsingNavbarBoardListContainerPage(boardNames0);
      classUnderTest0.goToBoardUsingNavbarBoardListContainerPage(boardNames0);
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email0);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.goToBoardListBoardListContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      BoardNames boardNames1 = BoardNames.MY_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames1);
      classUnderTest0.goToBoardListBoardListContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.goToBoardListBoardListContainerPage()V: Line 216
   * Goal 3. main.ClassUnderTest.goToBoardListBoardsContainerPage()V: Line 63
   * Goal 4. main.ClassUnderTest.goToBoardUsingNavbarBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 79
   * Goal 5. main.ClassUnderTest.loginAsJohnLoginContainerPage()V: Line 601
   * Goal 6. main.ClassUnderTest.openAddNewBoardFormBoardsContainerPage()V: Line 98
   * Goal 7. main.ClassUnderTest.viewAllBoardsBoardsContainerPage()V: Line 127
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.loginAsJohnLoginContainerPage();
      BoardNames boardNames0 = BoardNames.WORK_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.goToBoardListBoardListContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      classUnderTest0.goToBoardListBoardsContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      BoardNames boardNames1 = BoardNames.WORK_BOARD;
      classUnderTest0.goToBoardUsingNavbarBoardsContainerPage(boardNames1);
  }

  //Test case number: 5
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.addNewCardToListBoardListContainerPage(Lcustom_classes/ListNames;Lcustom_classes/CardText;)V: Line 149
   * Goal 3. main.ClassUnderTest.addNewListBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 169
   * Goal 4. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 194
   * Goal 5. main.ClassUnderTest.goToBoardClickingOnItBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 45
   * Goal 6. main.ClassUnderTest.goToBoardListBoardListContainerPage()V: Line 216
   * Goal 7. main.ClassUnderTest.goToSignUpLoginContainerPage()V: Line 587
   * Goal 8. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 624
   * Goal 9. main.ClassUnderTest.openAddNewBoardFormBoardsContainerPage()V: Line 98
   * Goal 10. main.ClassUnderTest.openAddNewListFormBoardListContainerPage()V: Line 276
   * Goal 11. main.ClassUnderTest.openAddNewMemberFormBoardListContainerPage()V: Line 292
   * Goal 12. main.ClassUnderTest.openNewCardToListFormBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 313
   * Goal 13. main.ClassUnderTest.signOutBoardListContainerPage()V: Line 352
   * Goal 14. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 715
   * Goal 15. main.ClassUnderTest.signUpSignUpContainerPage(Lcustom_classes/PeopleNames;Lcustom_classes/PeopleNames;Lcustom_classes/Email;Lcustom_classes/Passwords;Lcustom_classes/Passwords;)V: Line 718
   * Goal 16. main.ClassUnderTest.viewAllBoardsBoardsContainerPage()V: Line 127
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      Email email0 = Email.ASD;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email0, passwords0);
      classUnderTest0.loginLoginContainerPage(email0, passwords0);
      classUnderTest0.goToSignUpLoginContainerPage();
      PeopleNames peopleNames0 = PeopleNames.ASD;
      PeopleNames peopleNames1 = PeopleNames.MARK;
      classUnderTest0.signUpSignUpContainerPage(peopleNames0, peopleNames1, email0, passwords0, passwords0);
      BoardNames boardNames0 = BoardNames.PERSONAL_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email0);
      classUnderTest0.goToBoardListBoardListContainerPage();
      classUnderTest0.viewAllBoardsBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      classUnderTest0.openAddNewBoardFormBoardsContainerPage();
      classUnderTest0.goToBoardClickingOnItBoardsContainerPage(boardNames0);
      Email email1 = Email.ASD;
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email1);
      ListNames listNames0 = ListNames.WORK_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames0);
      CardText cardText0 = CardText.PERSONAL;
      classUnderTest0.addNewCardToListBoardListContainerPage(listNames0, cardText0);
      ListNames listNames1 = ListNames.MY_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames1);
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      classUnderTest0.openAddNewListFormBoardListContainerPage();
      ListNames listNames2 = ListNames.PERSONAL_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames2);
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email1);
      ListNames listNames3 = ListNames.WORK_LIST;
      classUnderTest0.openNewCardToListFormBoardListContainerPage(listNames3);
      classUnderTest0.openAddNewMemberFormBoardListContainerPage();
      classUnderTest0.signOutBoardListContainerPage();
      classUnderTest0.goToSignUpLoginContainerPage();
      PeopleNames peopleNames2 = PeopleNames.LUKE;
      Email email2 = Email.JOHNDOE;
      Passwords passwords1 = Passwords.JOHNDOE;
      classUnderTest0.signUpSignUpContainerPage(peopleNames0, peopleNames2, email2, passwords1, passwords0);
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * Goal 1. main.ClassUnderTest.addNewBoardBoardsContainerPage(Lcustom_classes/BoardNames;)V: Line 29
   * Goal 2. main.ClassUnderTest.addNewListBoardListContainerPage(Lcustom_classes/ListNames;)V: Line 169
   * Goal 3. main.ClassUnderTest.addNewMemberToCurrentBoardBoardListContainerPage(Lcustom_classes/Email;)V: Line 194
   * Goal 4. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/Email;Lcustom_classes/Passwords;)V: Line 627
   * Goal 5. main.ClassUnderTest.updateListBoardListContainerPage(Lcustom_classes/ListNames;Lcustom_classes/ListNames;)V: Line 372
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      Email email0 = Email.JOHNDOE;
      Passwords passwords0 = Passwords.JOHNDOE;
      classUnderTest0.loginLoginContainerPage(email0, passwords0);
      BoardNames boardNames0 = BoardNames.WORK_BOARD;
      classUnderTest0.addNewBoardBoardsContainerPage(boardNames0);
      ListNames listNames0 = ListNames.WORK_LIST;
      classUnderTest0.addNewListBoardListContainerPage(listNames0);
      ListNames listNames1 = ListNames.ANOTHER_LIST;
      classUnderTest0.updateListBoardListContainerPage(listNames0, listNames1);
      Email email1 = Email.ASD;
      classUnderTest0.addNewMemberToCurrentBoardBoardListContainerPage(email1);
  }
}
