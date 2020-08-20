/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 20 03:44:58 GMT 2020
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
import main.ClassUnderTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTest_ESTest extends ClassUnderTest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.createIdeasPostRetrospectiveContainerPage(Lcustom_classes/IdeasPosts;)V: Line 261
   * Goal 2. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 3. main.ClassUnderTest.createNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/NotWentWellPosts;)V: Line 282
   * Goal 4. main.ClassUnderTest.deleteIdeasPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 325
   * Goal 5. main.ClassUnderTest.goToHomeHomeContainerPage()V: Line 64
   * Goal 6. main.ClassUnderTest.goToPreviousViewHomeContainerPage()V: Line 79
   * Goal 7. main.ClassUnderTest.leaveSessionMenuPage()V: Line 114
   * Goal 8. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 9. main.ClassUnderTest.logoutHomeContainerPage()V: Line 98
   * Goal 10. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   * Goal 11. main.ClassUnderTest.renameBoardRetrospectiveContainerPage(Lcustom_classes/BoardNames;)V: Line 559
   * Goal 12. main.ClassUnderTest.toggleSummaryModeMenuPage()V: Line 147
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.goToHomeHomeContainerPage();
      classUnderTest0.createNewSessionHomeContainerPage();
      BoardNames boardNames0 = BoardNames.PROJECT_Y;
      classUnderTest0.renameBoardRetrospectiveContainerPage(boardNames0);
      int int0 = 568;
      Id id0 = new Id(int0);
      IdeasPosts ideasPosts0 = IdeasPosts.STORYPOINTS;
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts0);
      classUnderTest0.deleteIdeasPostRetrospectiveContainerPage(id0);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.DEV_TIME;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.toggleSummaryModeMenuPage();
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.leaveSessionMenuPage();
      classUnderTest0.logoutHomeContainerPage();
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.goToPreviousViewHomeContainerPage();
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 2. main.ClassUnderTest.createNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/NotWentWellPosts;)V: Line 282
   * Goal 3. main.ClassUnderTest.createWentWellPostRetrospectiveContainerPage(Lcustom_classes/WentWellPosts;)V: Line 303
   * Goal 4. main.ClassUnderTest.deleteNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 348
   * Goal 5. main.ClassUnderTest.leaveSessionMenuPage()V: Line 114
   * Goal 6. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 7. main.ClassUnderTest.logoutHomeContainerPage()V: Line 98
   * Goal 8. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   * Goal 9. main.ClassUnderTest.renameBoardRetrospectiveContainerPage(Lcustom_classes/BoardNames;)V: Line 559
   * Goal 10. main.ClassUnderTest.toggleSummaryModeMenuPage()V: Line 147
   * Goal 11. main.ClassUnderTest.untoggleSummaryModeMenuPage()V: Line 168
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.MARK;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.logoutHomeContainerPage();
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.createNewSessionHomeContainerPage();
      int int0 = 31;
      Id id0 = new Id(int0);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.MEETINGS;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      WentWellPosts wentWellPosts0 = WentWellPosts.DESIGN;
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts0);
      BoardNames boardNames0 = BoardNames.PROJECT_X;
      classUnderTest0.renameBoardRetrospectiveContainerPage(boardNames0);
      classUnderTest0.deleteNotWentWellPostRetrospectiveContainerPage(id0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.toggleSummaryModeMenuPage();
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.untoggleSummaryModeMenuPage();
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.leaveSessionMenuPage();
      classUnderTest0.logoutHomeContainerPage();
      classUnderTest0.loginLoginContainerPage(peopleNames0);
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * Goal 1. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 2. main.ClassUnderTest.createWentWellPostRetrospectiveContainerPage(Lcustom_classes/WentWellPosts;)V: Line 303
   * Goal 3. main.ClassUnderTest.deleteWentWellPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 371
   * Goal 4. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 5. main.ClassUnderTest.renameBoardRetrospectiveContainerPage(Lcustom_classes/BoardNames;)V: Line 559
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.MIKE;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      WentWellPosts wentWellPosts0 = WentWellPosts.QUICK_CLIENT;
      int int0 = 1687;
      Id id0 = new Id(int0);
      classUnderTest0.createNewSessionHomeContainerPage();
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts0);
      classUnderTest0.deleteWentWellPostRetrospectiveContainerPage(id0);
      BoardNames boardNames0 = BoardNames.WORK;
      classUnderTest0.renameBoardRetrospectiveContainerPage(boardNames0);
  }

  //Test case number: 3
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTest.createIdeasPostRetrospectiveContainerPage(Lcustom_classes/IdeasPosts;)V: Line 261
   * Goal 2. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 3. main.ClassUnderTest.createNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/NotWentWellPosts;)V: Line 282
   * Goal 4. main.ClassUnderTest.deleteIdeasPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 325
   * Goal 5. main.ClassUnderTest.goToHomeRetrospectiveContainerPage()V: Line 460
   * Goal 6. main.ClassUnderTest.leaveSessionMenuPage()V: Line 114
   * Goal 7. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 8. main.ClassUnderTest.logoutHomeContainerPage()V: Line 98
   * Goal 9. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   * Goal 10. main.ClassUnderTest.renameBoardRetrospectiveContainerPage(Lcustom_classes/BoardNames;)V: Line 559
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.MARK;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      int int0 = 3753;
      Id id0 = new Id(int0);
      classUnderTest0.createNewSessionHomeContainerPage();
      classUnderTest0.goToHomeRetrospectiveContainerPage();
      classUnderTest0.createNewSessionHomeContainerPage();
      IdeasPosts ideasPosts0 = IdeasPosts.SUPPLIER;
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts0);
      classUnderTest0.deleteIdeasPostRetrospectiveContainerPage(id0);
      BoardNames boardNames0 = BoardNames.WORK;
      classUnderTest0.renameBoardRetrospectiveContainerPage(boardNames0);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.LONG_BUILDS;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.leaveSessionMenuPage();
      classUnderTest0.logoutHomeContainerPage();
      PeopleNames peopleNames1 = PeopleNames.JOHN;
      classUnderTest0.loginLoginContainerPage(peopleNames1);
      classUnderTest0.logoutHomeContainerPage();
      PeopleNames peopleNames2 = PeopleNames.JOHN;
      classUnderTest0.loginLoginContainerPage(peopleNames2);
  }

  //Test case number: 4
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 2. main.ClassUnderTest.createNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/NotWentWellPosts;)V: Line 282
   * Goal 3. main.ClassUnderTest.deleteNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 348
   * Goal 4. main.ClassUnderTest.goToPreviousViewHomeContainerPage()V: Line 79
   * Goal 5. main.ClassUnderTest.leaveSessionMenuPage()V: Line 114
   * Goal 6. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 7. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 583
   * Goal 8. main.ClassUnderTest.logoutMenuPage()V: Line 130
   * Goal 9. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   * Goal 10. main.ClassUnderTest.renameBoardRetrospectiveContainerPage(Lcustom_classes/BoardNames;)V: Line 559
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.MARK;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.createNewSessionHomeContainerPage();
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.MEETINGS;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      int int0 = (-612);
      Id id0 = new Id(int0);
      classUnderTest0.deleteNotWentWellPostRetrospectiveContainerPage(id0);
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.logoutMenuPage();
      PeopleNames peopleNames1 = PeopleNames.MARK;
      classUnderTest0.loginLoginContainerPage(peopleNames1);
      BoardNames boardNames0 = BoardNames.PROJECT_X;
      classUnderTest0.renameBoardRetrospectiveContainerPage(boardNames0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.logoutMenuPage();
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.leaveSessionMenuPage();
      classUnderTest0.goToPreviousViewHomeContainerPage();
  }
}
