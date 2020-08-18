/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 18 09:16:09 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.BoardNames;
import custom_classes.Id;
import custom_classes.IdeasPosts;
import custom_classes.NotWentWellPosts;
import custom_classes.PeopleNames;
import custom_classes.WentWellPosts;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createIdeasPostRetrospectivePage(Lcustom_classes/IdeasPosts;)V: Line 311
   * Goal 2. main.ClassUnderTestApogen.createNotWentWellPostRetrospectivePage(Lcustom_classes/NotWentWellPosts;)V: Line 332
   * Goal 3. main.ClassUnderTestApogen.createWentWellPostRetrospectivePage(Lcustom_classes/WentWellPosts;)V: Line 353
   * Goal 4. main.ClassUnderTestApogen.deleteNotWentWellPostRetrospectivePage(Lcustom_classes/Id;)V: Line 397
   * Goal 5. main.ClassUnderTestApogen.deleteWentWellPostRetrospectivePage(Lcustom_classes/Id;)V: Line 419
   * Goal 6. main.ClassUnderTestApogen.goToAdvancedIndexPage()V: Line 223
   * Goal 7. main.ClassUnderTestApogen.goToIndexAdvancedPage()V: Line 176
   * Goal 8. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 9. main.ClassUnderTestApogen.goToIndexPreviousPage()V: Line 42
   * Goal 10. main.ClassUnderTestApogen.goToLoginAdvancedPage()V: Line 190
   * Goal 11. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 12. main.ClassUnderTestApogen.goToPreviousIndexPage()V: Line 252
   * Goal 13. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 14. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 15. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 294
   * Goal 16. main.ClassUnderTestApogen.logoutMenuPage()V: Line 107
   * Goal 17. main.ClassUnderTestApogen.renameBoardRetrospectivePage(Lcustom_classes/BoardNames;)V: Line 452
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.MARK;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToLoginAdvancedPage();
      PeopleNames peopleNames1 = PeopleNames.MARK;
      classUnderTestApogen0.loginLoginPage(peopleNames1);
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToIndexAdvancedPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.DEV_TIME;
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      WentWellPosts wentWellPosts0 = WentWellPosts.DELIVERING;
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      int int0 = (-746);
      Id id0 = new Id(int0);
      classUnderTestApogen0.deleteWentWellPostRetrospectivePage(id0);
      classUnderTestApogen0.deleteNotWentWellPostRetrospectivePage(id0);
      NotWentWellPosts notWentWellPosts1 = NotWentWellPosts.MEETINGS;
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts1);
      classUnderTestApogen0.deleteNotWentWellPostRetrospectivePage(id0);
      IdeasPosts ideasPosts0 = IdeasPosts.SUPPLIER;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      BoardNames boardNames0 = BoardNames.WORK;
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.logoutMenuPage();
      PeopleNames peopleNames2 = PeopleNames.MARK;
      classUnderTestApogen0.loginLoginPage(peopleNames2);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.logoutMenuPage();
      classUnderTestApogen0.loginLoginPage(peopleNames1);
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToPreviousIndexPage();
      classUnderTestApogen0.goToIndexPreviousPage();
  }

  //Test case number: 1
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createIdeasPostRetrospectivePage(Lcustom_classes/IdeasPosts;)V: Line 311
   * Goal 2. main.ClassUnderTestApogen.createWentWellPostRetrospectivePage(Lcustom_classes/WentWellPosts;)V: Line 353
   * Goal 3. main.ClassUnderTestApogen.deleteIdeasPostRetrospectivePage(Lcustom_classes/Id;)V: Line 375
   * Goal 4. main.ClassUnderTestApogen.goToAdvancedIndexPage()V: Line 223
   * Goal 5. main.ClassUnderTestApogen.goToIndexAdvancedPage()V: Line 176
   * Goal 6. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 7. main.ClassUnderTestApogen.goToLoginAdvancedPage()V: Line 190
   * Goal 8. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 9. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 10. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 11. main.ClassUnderTestApogen.renameBoardRetrospectivePage(Lcustom_classes/BoardNames;)V: Line 452
   * Goal 12. main.ClassUnderTestApogen.toggleSummaryModeMenuPage()V: Line 123
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.MARK;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      int int0 = 513;
      Id id0 = new Id(int0);
      WentWellPosts wentWellPosts0 = WentWellPosts.DESIGN;
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToIndexAdvancedPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      IdeasPosts ideasPosts0 = IdeasPosts.REQUIREMENTS;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      classUnderTestApogen0.deleteIdeasPostRetrospectivePage(id0);
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      BoardNames boardNames0 = BoardNames.MY_RETROSPECTIVE;
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      IdeasPosts ideasPosts1 = IdeasPosts.FRIDAYNIGHT;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts1);
      classUnderTestApogen0.deleteIdeasPostRetrospectivePage(id0);
      classUnderTestApogen0.createWentWellPostRetrospectivePage(wentWellPosts0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.toggleSummaryModeMenuPage();
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToLoginAdvancedPage();
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToAdvancedAdvancedPage()V: Line 162
   * Goal 2. main.ClassUnderTestApogen.goToAdvancedIndexPage()V: Line 223
   * Goal 3. main.ClassUnderTestApogen.goToAdvancedPreviousPage()V: Line 28
   * Goal 4. main.ClassUnderTestApogen.goToIndexAdvancedPage()V: Line 176
   * Goal 5. main.ClassUnderTestApogen.goToIndexIndexPage()V: Line 237
   * Goal 6. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 7. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 8. main.ClassUnderTestApogen.goToPreviousAdvancedPage()V: Line 205
   * Goal 9. main.ClassUnderTestApogen.goToPreviousIndexPage()V: Line 252
   * Goal 10. main.ClassUnderTestApogen.goToPreviousPreviousPage()V: Line 56
   * Goal 11. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 12. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToAdvancedAdvancedPage();
      classUnderTestApogen0.goToIndexAdvancedPage();
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToPreviousIndexPage();
      classUnderTestApogen0.goToAdvancedPreviousPage();
      classUnderTestApogen0.goToPreviousAdvancedPage();
      classUnderTestApogen0.goToPreviousPreviousPage();
  }

  //Test case number: 3
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createIdeasPostRetrospectivePage(Lcustom_classes/IdeasPosts;)V: Line 311
   * Goal 2. main.ClassUnderTestApogen.createNotWentWellPostRetrospectivePage(Lcustom_classes/NotWentWellPosts;)V: Line 332
   * Goal 3. main.ClassUnderTestApogen.goToAdvancedIndexPage()V: Line 223
   * Goal 4. main.ClassUnderTestApogen.goToIndexIndexPage()V: Line 237
   * Goal 5. main.ClassUnderTestApogen.goToIndexMenuPage()V: Line 92
   * Goal 6. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 7. main.ClassUnderTestApogen.goToPreviousAdvancedPage()V: Line 205
   * Goal 8. main.ClassUnderTestApogen.goToPreviousIndexPage()V: Line 252
   * Goal 9. main.ClassUnderTestApogen.goToPreviousPreviousPage()V: Line 56
   * Goal 10. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 11. main.ClassUnderTestApogen.goToRetrospectivePreviousPage(Lcustom_classes/BoardNames;)V: Line 72
   * Goal 12. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 13. main.ClassUnderTestApogen.renameBoardRetrospectivePage(Lcustom_classes/BoardNames;)V: Line 452
   * Goal 14. main.ClassUnderTestApogen.toggleSummaryModeMenuPage()V: Line 123
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToIndexIndexPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      BoardNames boardNames0 = BoardNames.WORK;
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToAdvancedIndexPage();
      classUnderTestApogen0.goToPreviousAdvancedPage();
      BoardNames boardNames1 = BoardNames.WORK;
      classUnderTestApogen0.goToRetrospectivePreviousPage(boardNames1);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.LATE_WORK;
      classUnderTestApogen0.createNotWentWellPostRetrospectivePage(notWentWellPosts0);
      IdeasPosts ideasPosts0 = IdeasPosts.STORYPOINTS;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.toggleSummaryModeMenuPage();
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.goToIndexMenuPage();
      classUnderTestApogen0.goToPreviousIndexPage();
      classUnderTestApogen0.goToPreviousPreviousPage();
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTestApogen.createIdeasPostRetrospectivePage(Lcustom_classes/IdeasPosts;)V: Line 311
   * Goal 2. main.ClassUnderTestApogen.goToMenuRetrospectivePage()V: Line 437
   * Goal 3. main.ClassUnderTestApogen.goToRetrospectiveIndexPage()V: Line 270
   * Goal 4. main.ClassUnderTestApogen.loginLoginPage(Lcustom_classes/PeopleNames;)V: Line 291
   * Goal 5. main.ClassUnderTestApogen.renameBoardRetrospectivePage(Lcustom_classes/BoardNames;)V: Line 452
   * Goal 6. main.ClassUnderTestApogen.toggleSummaryModeMenuPage()V: Line 123
   * Goal 7. main.ClassUnderTestApogen.untoggleSummaryModeMenuPage()V: Line 144
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      classUnderTestApogen0.loginLoginPage(peopleNames0);
      classUnderTestApogen0.goToRetrospectiveIndexPage();
      IdeasPosts ideasPosts0 = IdeasPosts.SUPPLIER;
      classUnderTestApogen0.createIdeasPostRetrospectivePage(ideasPosts0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.toggleSummaryModeMenuPage();
      BoardNames boardNames0 = BoardNames.PROJECT_Y;
      classUnderTestApogen0.renameBoardRetrospectivePage(boardNames0);
      classUnderTestApogen0.goToMenuRetrospectivePage();
      classUnderTestApogen0.untoggleSummaryModeMenuPage();
  }
}
