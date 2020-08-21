/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 21 00:18:00 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Amount;
import custom_classes.Date;
import custom_classes.Email;
import custom_classes.Goals;
import custom_classes.Id;
import custom_classes.IncomeDescription;
import custom_classes.TransactionDescription;
import custom_classes.WalletNames;
import main.ClassUnderTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTest_ESTest extends ClassUnderTest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTest.acceptOperationConfirmationPage()V: Line 369
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 5. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 8. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 9. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 10. main.ClassUnderTest.restoreWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 976
   * Goal 11. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 12. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 13. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 14. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test00()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = 1872;
      Id id0 = new Id(int0);
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.editWalletWalletsManagerPage(id0);
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames1 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.editWalletWalletsManagerPage(id0);
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.acceptOperationConfirmationPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.restoreWalletWalletsManagerPage(id0);
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
  }

  //Test case number: 1
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTest.acceptOperationConfirmationPage()V: Line 378
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.closeAddIncomeToWalletPage()V: Line 643
   * Goal 6. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageTransactionManagerPage()V: Line 705
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 9. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 10. main.ClassUnderTest.removeTransactionTransactionDetailsPage()V: Line 472
   * Goal 11. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 12. main.ClassUnderTest.selectTransactionTransactionManagerPage(Lcustom_classes/Id;)V: Line 791
   * Goal 13. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 14. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   * Goal 15. main.ClassUnderTest.setTotalIncomeSetTotalIncomeToWalletPage(Lcustom_classes/Amount;)V: Line 563
   * Goal 16. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test01()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = 1185;
      Id id0 = new Id(int0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToGoalsManagerPageTransactionManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      Amount amount0 = new Amount(int0);
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.setTotalIncomeSetTotalIncomeToWalletPage(amount0);
      classUnderTest0.addIncomeTransactionManagerPage();
      classUnderTest0.closeAddIncomeToWalletPage();
      Id id1 = new Id(amount0.value);
      classUnderTest0.selectTransactionTransactionManagerPage(id1);
      classUnderTest0.removeTransactionTransactionDetailsPage();
      classUnderTest0.acceptOperationConfirmationPage();
  }

  //Test case number: 2
  /*
   * 15 covered goals:
   * Goal 1. main.ClassUnderTest.addAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 491
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 5. main.ClassUnderTest.closeConfirmationPage()V: Line 399
   * Goal 6. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 7. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 8. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 9. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 10. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 11. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 12. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 13. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 14. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 15. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test02()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = 157;
      Id id0 = new Id(int0);
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.denyOperationConfirmationPage();
      Email email0 = Email.COMPANY;
      int int1 = 915;
      Id id1 = new Id(int1);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id1);
      classUnderTest0.addAccessWalletAccessManagerPage(email0);
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.closeConfirmationPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.editWalletWalletsManagerPage(id1);
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
  }

  //Test case number: 3
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addFurtherDetailsCreateGoalSecondStepPage(Lcustom_classes/Amount;Lcustom_classes/Date;)V: Line 33
   * Goal 3. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 7. main.ClassUnderTest.goBackToPreviousStepCreateGoalSecondStepPage()V: Line 47
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageCreateGoalFirstStepPage()V: Line 265
   * Goal 9. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 11. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 12. main.ClassUnderTest.goToWalletsManagerPageBreadcrumbTransactionManagerPage()V: Line 763
   * Goal 13. main.ClassUnderTest.goToWalletsManagerPageCreateGoalSecondStepPage()V: Line 85
   * Goal 14. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 15. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 16. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 17. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test03()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = 904;
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames1 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.MUSEUM;
      WalletNames walletNames2 = WalletNames.COMPANY;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames2);
      classUnderTest0.goBackToPreviousStepCreateGoalSecondStepPage();
      Goals goals1 = Goals.MUSEUM;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals1, walletNames0);
      classUnderTest0.goToWalletsManagerPageCreateGoalSecondStepPage();
      int int1 = (-1919);
      Id id0 = new Id(int1);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      classUnderTest0.goToWalletsManagerPageBreadcrumbTransactionManagerPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.denyOperationConfirmationPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames0);
      Amount amount0 = new Amount(int0);
      Date date0 = Date.SUMMER;
      classUnderTest0.addFurtherDetailsCreateGoalSecondStepPage(amount0, date0);
  }

  //Test case number: 4
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addIncomeAddIncomeToWalletPage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 624
   * Goal 3. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 4. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 5. main.ClassUnderTest.closeAddIncomeToWalletPage()V: Line 643
   * Goal 6. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 8. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 10. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 11. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 12. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 13. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 14. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test04()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = 2017;
      Id id0 = new Id(int0);
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      classUnderTest0.addIncomeTransactionManagerPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SALARY;
      Amount amount0 = new Amount(int0);
      classUnderTest0.addIncomeAddIncomeToWalletPage(incomeDescription0, amount0);
      classUnderTest0.addIncomeTransactionManagerPage();
      classUnderTest0.closeAddIncomeToWalletPage();
  }

  //Test case number: 5
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTest.addAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 491
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeConfirmationPage()V: Line 402
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageCreateGoalFirstStepPage()V: Line 265
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 10. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 11. main.ClassUnderTest.removeAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 523
   * Goal 12. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 13. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 14. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   */

  @Test(timeout = 1001000)
  public void test05()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      int int0 = (-194);
      Id id0 = new Id(int0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      Email email0 = Email.ASD;
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      Id id1 = new Id(int0);
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id1);
      Email email1 = Email.ASD;
      classUnderTest0.addAccessWalletAccessManagerPage(email1);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.removeAccessWalletAccessManagerPage(email0);
      classUnderTest0.closeConfirmationPage();
  }

  //Test case number: 6
  /*
   * 18 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 4. main.ClassUnderTest.closeSetTotalIncomeToWalletPage()V: Line 543
   * Goal 5. main.ClassUnderTest.closeTransactionDetailsPage()V: Line 458
   * Goal 6. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageCreateGoalFirstStepPage()V: Line 265
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 9. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalFirstStepPage()V: Line 277
   * Goal 10. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 11. main.ClassUnderTest.goToWalletsManagerPageBreadcrumbTransactionManagerPage()V: Line 763
   * Goal 12. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 13. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 14. main.ClassUnderTest.selectTransactionTransactionManagerPage(Lcustom_classes/Id;)V: Line 791
   * Goal 15. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 16. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   * Goal 17. main.ClassUnderTest.setTotalIncomeSetTotalIncomeToWalletPage(Lcustom_classes/Amount;)V: Line 563
   * Goal 18. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test06()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-2003);
      Id id0 = new Id(int0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.closeSetTotalIncomeToWalletPage();
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      int int1 = (-3681);
      Amount amount0 = new Amount(int1);
      classUnderTest0.setTotalIncomeSetTotalIncomeToWalletPage(amount0);
      classUnderTest0.selectTransactionTransactionManagerPage(id0);
      classUnderTest0.closeTransactionDetailsPage();
      classUnderTest0.goToWalletsManagerPageBreadcrumbTransactionManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInCreateGoalFirstStepPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
  }

  //Test case number: 7
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 4. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 5. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 6. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 8. main.ClassUnderTest.goToWalletsManagerPageBreadcrumbTransactionManagerPage()V: Line 763
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 10. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 11. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 12. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 13. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 14. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test07()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      int int0 = 1825;
      Id id0 = new Id(int0);
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToWalletsManagerPageBreadcrumbTransactionManagerPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
  }

  //Test case number: 8
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 4. main.ClassUnderTest.goBackCreateGoalFirstStepPage()V: Line 252
   * Goal 5. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageTransactionManagerPage()V: Line 705
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 8. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 10. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 11. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 12. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 13. main.ClassUnderTest.setTotalIncomeSetTotalIncomeToWalletPage(Lcustom_classes/Amount;)V: Line 563
   * Goal 14. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test08()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-1334);
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      Id id0 = new Id(int0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      Amount amount0 = new Amount(int0);
      classUnderTest0.setTotalIncomeSetTotalIncomeToWalletPage(amount0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.setTotalIncomeSetTotalIncomeToWalletPage(amount0);
      classUnderTest0.goToGoalsManagerPageTransactionManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
  }

  //Test case number: 9
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.closeSetTotalIncomeToWalletPage()V: Line 543
   * Goal 4. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 5. main.ClassUnderTest.goToHomeUserLoggedInTransactionManagerPage()V: Line 717
   * Goal 6. main.ClassUnderTest.goToNextMonthTransactionViewTransactionManagerPage()V: Line 732
   * Goal 7. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 8. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 9. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 10. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   * Goal 11. main.ClassUnderTest.setTotalIncomeSetTotalIncomeToWalletPage(Lcustom_classes/Amount;)V: Line 563
   * Goal 12. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test09()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = (-218);
      Id id0 = new Id(int0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      int int1 = 615;
      Amount amount0 = new Amount(int1);
      classUnderTest0.setTotalIncomeSetTotalIncomeToWalletPage(amount0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.closeSetTotalIncomeToWalletPage();
      classUnderTest0.goToNextMonthTransactionViewTransactionManagerPage();
      classUnderTest0.goToHomeUserLoggedInTransactionManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames1 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
  }

  //Test case number: 10
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 2. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 3. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 4. main.ClassUnderTest.goToWalletsManagerPageCreateGoalFirstStepPage()V: Line 290
   * Goal 5. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 6. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 7. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 8. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test10()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageCreateGoalFirstStepPage();
  }

  //Test case number: 11
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 4. main.ClassUnderTest.addTransactionTransactionManagerPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 673
   * Goal 5. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 6. main.ClassUnderTest.closeAddIncomeToWalletPage()V: Line 643
   * Goal 7. main.ClassUnderTest.closeSetTotalIncomeToWalletPage()V: Line 543
   * Goal 8. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 9. main.ClassUnderTest.goBackToPreviousStepCreateGoalSecondStepPage()V: Line 47
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 11. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 12. main.ClassUnderTest.goToWalletsManagerPageNavbarTransactionManagerPage()V: Line 776
   * Goal 13. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 14. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 15. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 16. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 17. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test11()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-1170);
      Id id0 = new Id(int0);
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      TransactionDescription transactionDescription0 = TransactionDescription.AMAZON;
      Amount amount0 = new Amount(id0.value);
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription0, amount0);
      classUnderTest0.addIncomeTransactionManagerPage();
      classUnderTest0.closeAddIncomeToWalletPage();
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.closeSetTotalIncomeToWalletPage();
      classUnderTest0.goToWalletsManagerPageNavbarTransactionManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.SKI;
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames1);
      classUnderTest0.goBackToPreviousStepCreateGoalSecondStepPage();
  }
}
