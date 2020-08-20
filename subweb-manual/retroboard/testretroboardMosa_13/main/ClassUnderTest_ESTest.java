/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 20 11:12:44 GMT 2020
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
   * 15 covered goals:
   * Goal 1. main.ClassUnderTest.createIdeasPostRetrospectiveContainerPage(Lcustom_classes/IdeasPosts;)V: Line 261
   * Goal 2. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 3. main.ClassUnderTest.createNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/NotWentWellPosts;)V: Line 282
   * Goal 4. main.ClassUnderTest.createWentWellPostRetrospectiveContainerPage(Lcustom_classes/WentWellPosts;)V: Line 303
   * Goal 5. main.ClassUnderTest.deleteIdeasPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 325
   * Goal 6. main.ClassUnderTest.deleteWentWellPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 371
   * Goal 7. main.ClassUnderTest.goToBoardHomeContainerPage(Lcustom_classes/BoardNames;)V: Line 45
   * Goal 8. main.ClassUnderTest.goToHomeRetrospectiveContainerPage()V: Line 460
   * Goal 9. main.ClassUnderTest.goToPreviousViewHomeContainerPage()V: Line 79
   * Goal 10. main.ClassUnderTest.leaveSessionMenuPage()V: Line 114
   * Goal 11. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 12. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 583
   * Goal 13. main.ClassUnderTest.logoutMenuPage()V: Line 130
   * Goal 14. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   * Goal 15. main.ClassUnderTest.renameBoardRetrospectiveContainerPage(Lcustom_classes/BoardNames;)V: Line 559
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.MARK;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      WentWellPosts wentWellPosts0 = WentWellPosts.DELIVERING;
      classUnderTest0.createNewSessionHomeContainerPage();
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts0);
      int int0 = 1356;
      Id id0 = new Id(int0);
      IdeasPosts ideasPosts0 = IdeasPosts.DEVOPS;
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts0);
      classUnderTest0.deleteIdeasPostRetrospectiveContainerPage(id0);
      classUnderTest0.deleteWentWellPostRetrospectiveContainerPage(id0);
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts0);
      BoardNames boardNames0 = BoardNames.PROJECT_Y;
      classUnderTest0.renameBoardRetrospectiveContainerPage(boardNames0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.leaveSessionMenuPage();
      classUnderTest0.goToPreviousViewHomeContainerPage();
      classUnderTest0.goToPreviousViewHomeContainerPage();
      classUnderTest0.goToBoardHomeContainerPage(boardNames0);
      classUnderTest0.deleteIdeasPostRetrospectiveContainerPage(id0);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.TERRIBLE_COFFEE;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts0);
      classUnderTest0.deleteWentWellPostRetrospectiveContainerPage(id0);
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts0);
      IdeasPosts ideasPosts1 = IdeasPosts.DEVOPS;
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts1);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.logoutMenuPage();
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.goToHomeRetrospectiveContainerPage();
      classUnderTest0.goToPreviousViewHomeContainerPage();
  }

  //Test case number: 1
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 2. main.ClassUnderTest.createNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/NotWentWellPosts;)V: Line 282
   * Goal 3. main.ClassUnderTest.createWentWellPostRetrospectiveContainerPage(Lcustom_classes/WentWellPosts;)V: Line 303
   * Goal 4. main.ClassUnderTest.dislikeWentWellPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 442
   * Goal 5. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 6. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 583
   * Goal 7. main.ClassUnderTest.logoutMenuPage()V: Line 130
   * Goal 8. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.MIKE;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      int int0 = 2261;
      Id id0 = new Id(int0);
      Id id1 = new Id(id0.value);
      WentWellPosts wentWellPosts0 = WentWellPosts.TEAM_BONDING;
      classUnderTest0.createNewSessionHomeContainerPage();
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts0);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.DEV_TIME;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.logoutMenuPage();
      PeopleNames peopleNames1 = PeopleNames.JOHN;
      classUnderTest0.loginLoginContainerPage(peopleNames1);
      classUnderTest0.dislikeWentWellPostRetrospectiveContainerPage(id1);
      classUnderTest0.openMenuRetrospectiveContainerPage();
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.createIdeasPostRetrospectiveContainerPage(Lcustom_classes/IdeasPosts;)V: Line 261
   * Goal 2. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 3. main.ClassUnderTest.createNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/NotWentWellPosts;)V: Line 282
   * Goal 4. main.ClassUnderTest.goToHomeRetrospectiveContainerPage()V: Line 460
   * Goal 5. main.ClassUnderTest.leaveSessionMenuPage()V: Line 114
   * Goal 6. main.ClassUnderTest.likeNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 503
   * Goal 7. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 8. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 583
   * Goal 9. main.ClassUnderTest.logoutHomeContainerPage()V: Line 98
   * Goal 10. main.ClassUnderTest.logoutMenuPage()V: Line 130
   * Goal 11. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   * Goal 12. main.ClassUnderTest.toggleSummaryModeMenuPage()V: Line 147
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      int int0 = 1649;
      Id id0 = new Id(int0);
      Id id1 = new Id(id0.value);
      PeopleNames peopleNames1 = PeopleNames.JOHN;
      classUnderTest0.loginLoginContainerPage(peopleNames1);
      classUnderTest0.logoutHomeContainerPage();
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.createNewSessionHomeContainerPage();
      IdeasPosts ideasPosts0 = IdeasPosts.DEVOPS;
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.leaveSessionMenuPage();
      classUnderTest0.createNewSessionHomeContainerPage();
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.CLARITY;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.logoutMenuPage();
      PeopleNames peopleNames2 = PeopleNames.MARK;
      classUnderTest0.loginLoginContainerPage(peopleNames2);
      classUnderTest0.likeNotWentWellPostRetrospectiveContainerPage(id1);
      IdeasPosts ideasPosts1 = IdeasPosts.MEETINGS;
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts1);
      NotWentWellPosts notWentWellPosts1 = NotWentWellPosts.LONG_BUILDS;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts1);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.toggleSummaryModeMenuPage();
      classUnderTest0.goToHomeRetrospectiveContainerPage();
  }

  //Test case number: 3
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 2. main.ClassUnderTest.createWentWellPostRetrospectiveContainerPage(Lcustom_classes/WentWellPosts;)V: Line 303
   * Goal 3. main.ClassUnderTest.goToHomeHomeContainerPage()V: Line 64
   * Goal 4. main.ClassUnderTest.likeWentWellPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 526
   * Goal 5. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 6. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 583
   * Goal 7. main.ClassUnderTest.logoutMenuPage()V: Line 130
   * Goal 8. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.JOHN;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.goToHomeHomeContainerPage();
      classUnderTest0.createNewSessionHomeContainerPage();
      int int0 = (-1566);
      Id id0 = new Id(int0);
      WentWellPosts wentWellPosts0 = WentWellPosts.TEAM_BONDING;
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts0);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.logoutMenuPage();
      PeopleNames peopleNames1 = PeopleNames.MIKE;
      classUnderTest0.loginLoginContainerPage(peopleNames1);
      classUnderTest0.likeWentWellPostRetrospectiveContainerPage(id0);
  }

  //Test case number: 4
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTest.createIdeasPostRetrospectiveContainerPage(Lcustom_classes/IdeasPosts;)V: Line 261
   * Goal 2. main.ClassUnderTest.createNewSessionHomeContainerPage()V: Line 29
   * Goal 3. main.ClassUnderTest.createNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/NotWentWellPosts;)V: Line 282
   * Goal 4. main.ClassUnderTest.createWentWellPostRetrospectiveContainerPage(Lcustom_classes/WentWellPosts;)V: Line 303
   * Goal 5. main.ClassUnderTest.deleteNotWentWellPostRetrospectiveContainerPage(Lcustom_classes/Id;)V: Line 348
   * Goal 6. main.ClassUnderTest.goToHomeRetrospectiveContainerPage()V: Line 460
   * Goal 7. main.ClassUnderTest.goToPreviousViewHomeContainerPage()V: Line 79
   * Goal 8. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 580
   * Goal 9. main.ClassUnderTest.loginLoginContainerPage(Lcustom_classes/PeopleNames;)V: Line 583
   * Goal 10. main.ClassUnderTest.logoutHomeContainerPage()V: Line 98
   * Goal 11. main.ClassUnderTest.logoutMenuPage()V: Line 130
   * Goal 12. main.ClassUnderTest.openMenuRetrospectiveContainerPage()V: Line 544
   * Goal 13. main.ClassUnderTest.toggleSummaryModeMenuPage()V: Line 147
   * Goal 14. main.ClassUnderTest.untoggleSummaryModeMenuPage()V: Line 168
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      PeopleNames peopleNames0 = PeopleNames.MIKE;
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.createNewSessionHomeContainerPage();
      int int0 = 87;
      Id id0 = new Id(int0);
      IdeasPosts ideasPosts0 = IdeasPosts.DEVOPS;
      classUnderTest0.createIdeasPostRetrospectiveContainerPage(ideasPosts0);
      classUnderTest0.goToHomeRetrospectiveContainerPage();
      classUnderTest0.logoutHomeContainerPage();
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      classUnderTest0.createNewSessionHomeContainerPage();
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.toggleSummaryModeMenuPage();
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.untoggleSummaryModeMenuPage();
      WentWellPosts wentWellPosts0 = WentWellPosts.DESIGN;
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts0);
      NotWentWellPosts notWentWellPosts0 = NotWentWellPosts.TERRIBLE_COFFEE;
      classUnderTest0.createNotWentWellPostRetrospectiveContainerPage(notWentWellPosts0);
      Id id1 = new Id(id0.value);
      WentWellPosts wentWellPosts1 = WentWellPosts.TEAM_BONDING;
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts1);
      classUnderTest0.openMenuRetrospectiveContainerPage();
      classUnderTest0.logoutMenuPage();
      classUnderTest0.loginLoginContainerPage(peopleNames0);
      WentWellPosts wentWellPosts2 = WentWellPosts.DELIVERING;
      classUnderTest0.createWentWellPostRetrospectiveContainerPage(wentWellPosts2);
      classUnderTest0.deleteNotWentWellPostRetrospectiveContainerPage(id1);
      classUnderTest0.goToHomeRetrospectiveContainerPage();
      classUnderTest0.goToPreviousViewHomeContainerPage();
  }
}
