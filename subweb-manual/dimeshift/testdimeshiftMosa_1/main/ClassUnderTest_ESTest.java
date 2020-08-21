/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 20 18:16:52 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Amount;
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
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.acceptOperationConfirmationPage()V: Line 369
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 5. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 6. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 8. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 9. main.ClassUnderTest.removeWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 955
   * Goal 10. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 11. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 12. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   */

  @Test(timeout = 1001000)
  public void test00()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = (-802);
      Id id0 = new Id(int0);
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.acceptOperationConfirmationPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.removeWalletWalletsManagerPage(id0);
      classUnderTest0.denyOperationConfirmationPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
  }

  //Test case number: 1
  /*
   * 20 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addIncomeAddIncomeToWalletPage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 624
   * Goal 3. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 4. main.ClassUnderTest.addTransactionTransactionManagerPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 673
   * Goal 5. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 6. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 7. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 8. main.ClassUnderTest.goBackCreateGoalFirstStepPage()V: Line 252
   * Goal 9. main.ClassUnderTest.goToGoalsManagerPageTransactionManagerPage()V: Line 705
   * Goal 10. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 11. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 12. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 13. main.ClassUnderTest.goToNextMonthTransactionViewTransactionManagerPage()V: Line 732
   * Goal 14. main.ClassUnderTest.goToPreviousMonthTransactionViewTransactionManagerPage()V: Line 750
   * Goal 15. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 16. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 17. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 18. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 19. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 20. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test01()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      int int0 = (-961);
      Id id0 = new Id(int0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goBackCreateGoalFirstStepPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.addIncomeTransactionManagerPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SCHOLARSHIP;
      int int1 = 2236;
      Amount amount0 = new Amount(int1);
      classUnderTest0.addIncomeAddIncomeToWalletPage(incomeDescription0, amount0);
      classUnderTest0.goToPreviousMonthTransactionViewTransactionManagerPage();
      TransactionDescription transactionDescription0 = TransactionDescription.EBAY;
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription0, amount0);
      classUnderTest0.goToNextMonthTransactionViewTransactionManagerPage();
      classUnderTest0.addTransactionTransactionManagerPage(transactionDescription0, amount0);
      classUnderTest0.goToGoalsManagerPageTransactionManagerPage();
  }

  //Test case number: 2
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.addAccessWalletAccessManagerPage(Lcustom_classes/Email;)V: Line 491
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeConfirmationPage()V: Line 399
   * Goal 5. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 6. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 7. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 8. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 9. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 10. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 11. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   */

  @Test(timeout = 1001000)
  public void test02()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-1796);
      Id id0 = new Id(int0);
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      Email email0 = Email.ASD;
      classUnderTest0.addAccessWalletAccessManagerPage(email0);
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.closeConfirmationPage();
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.denyOperationConfirmationPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
  }

  //Test case number: 3
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 4. main.ClassUnderTest.closeSetTotalIncomeToWalletPage()V: Line 543
   * Goal 5. main.ClassUnderTest.denyOperationConfirmationPage()V: Line 429
   * Goal 6. main.ClassUnderTest.editWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 851
   * Goal 7. main.ClassUnderTest.goToHomeUserLoggedInTransactionManagerPage()V: Line 717
   * Goal 8. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 10. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 11. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   * Goal 12. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   * Goal 13. main.ClassUnderTest.setTotalIncomeTransactionManagerPage()V: Line 809
   */

  @Test(timeout = 1001000)
  public void test03()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = 286;
      Id id0 = new Id(int0);
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.hideWalletWalletsManagerPage(id0);
      classUnderTest0.denyOperationConfirmationPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.editWalletWalletsManagerPage(id0);
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.setTotalIncomeTransactionManagerPage();
      classUnderTest0.closeSetTotalIncomeToWalletPage();
      classUnderTest0.goToHomeUserLoggedInTransactionManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      Id id1 = new Id(int0);
      classUnderTest0.editWalletWalletsManagerPage(id1);
      WalletNames walletNames1 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
  }

  //Test case number: 4
  /*
   * 15 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addIncomeAddIncomeToWalletPage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 624
   * Goal 4. main.ClassUnderTest.addIncomeTransactionManagerPage()V: Line 657
   * Goal 5. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 6. main.ClassUnderTest.closeTransactionDetailsPage()V: Line 458
   * Goal 7. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 8. main.ClassUnderTest.goToGoalsManagerPageTransactionManagerPage()V: Line 705
   * Goal 9. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 10. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalSecondStepPage()V: Line 72
   * Goal 11. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 12. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 13. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 14. main.ClassUnderTest.selectTransactionTransactionManagerPage(Lcustom_classes/Id;)V: Line 791
   * Goal 15. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test04()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-1339);
      Id id0 = new Id(int0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.addIncomeTransactionManagerPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SALARY;
      Amount amount0 = new Amount(id0.value);
      classUnderTest0.addIncomeAddIncomeToWalletPage(incomeDescription0, amount0);
      classUnderTest0.selectTransactionTransactionManagerPage(id0);
      classUnderTest0.closeTransactionDetailsPage();
      classUnderTest0.goToGoalsManagerPageTransactionManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.MUSEUM;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames0);
      classUnderTest0.goToHomeUserLoggedInCreateGoalSecondStepPage();
  }

  //Test case number: 5
  /*
   * 15 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.goBackToPreviousStepCreateGoalSecondStepPage()V: Line 47
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 8. main.ClassUnderTest.goToHomeUserLoggedInCreateGoalFirstStepPage()V: Line 277
   * Goal 9. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 10. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 11. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 12. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 13. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 14. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 15. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test05()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.CAR;
      WalletNames walletNames1 = WalletNames.PERSONAL;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames1);
      classUnderTest0.goBackToPreviousStepCreateGoalSecondStepPage();
      classUnderTest0.goToHomeUserLoggedInCreateGoalFirstStepPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
  }

  //Test case number: 6
  /*
   * 9 covered goals:
   * Goal 1. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 2. main.ClassUnderTest.closeAddWalletPage()V: Line 601
   * Goal 3. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 4. main.ClassUnderTest.goToGoalsManagerPageCreateGoalFirstStepPage()V: Line 265
   * Goal 5. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 7. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 8. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 9. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   */

  @Test(timeout = 1001000)
  public void test06()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      classUnderTest0.closeAddWalletPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
  }

  //Test case number: 7
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 5. main.ClassUnderTest.goToGoalsManagerPageCreateGoalSecondStepPage()V: Line 60
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 8. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 9. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 10. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 11. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 12. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 13. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 14. main.ClassUnderTest.selectYoursAccessWalletsManagerPage()V: Line 1069
   */

  @Test(timeout = 1001000)
  public void test07()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.selectYoursAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames1);
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.SKI;
      WalletNames walletNames2 = WalletNames.PERSONAL;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames2);
      classUnderTest0.goToGoalsManagerPageCreateGoalSecondStepPage();
  }

  //Test case number: 8
  /*
   * 7 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.goToWalletsManagerPageBreadcrumbTransactionManagerPage()V: Line 763
   * Goal 4. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 5. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 6. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 7. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test08()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-2073);
      Id id0 = new Id(int0);
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToWalletsManagerPageBreadcrumbTransactionManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToWalletsManagerPageBreadcrumbTransactionManagerPage();
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
  }

  //Test case number: 9
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 3. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 4. main.ClassUnderTest.goToGoalsManagerPageTransactionManagerPage()V: Line 705
   * Goal 5. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 6. main.ClassUnderTest.goToWalletsManagerPageCreateGoalFirstStepPage()V: Line 290
   * Goal 7. main.ClassUnderTest.goToWalletsManagerPageWalletsManagerPage()V: Line 893
   * Goal 8. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 9. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 10. main.ClassUnderTest.selectSharedWithYouAccessWalletsManagerPage()V: Line 1022
   * Goal 11. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 12. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test09()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = 286;
      Id id0 = new Id(int0);
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTest0.addAddWalletPage(walletNames0);
      classUnderTest0.selectWalletWalletsManagerPage(id0);
      classUnderTest0.goToGoalsManagerPageTransactionManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageCreateGoalFirstStepPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectSharedWithYouAccessWalletsManagerPage();
      classUnderTest0.goToWalletsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
  }

  //Test case number: 10
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 2. main.ClassUnderTest.addGoalToWalletCreateGoalFirstStepPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 213
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.closeWalletAccessManagerPage()V: Line 506
   * Goal 5. main.ClassUnderTest.createNewGoalsManagerPage()V: Line 99
   * Goal 6. main.ClassUnderTest.goToGoalsManagerPageGoalsManagerPage()V: Line 132
   * Goal 7. main.ClassUnderTest.goToGoalsManagerPageWalletsManagerPage()V: Line 868
   * Goal 8. main.ClassUnderTest.goToHomeUserLoggedInGoalsManagerPage()V: Line 144
   * Goal 9. main.ClassUnderTest.goToWalletsManagerPageCreateGoalSecondStepPage()V: Line 85
   * Goal 10. main.ClassUnderTest.goToWalletsManagerPageGoalsManagerPage()V: Line 157
   * Goal 11. main.ClassUnderTest.manageWalletAccessWalletsManagerPage(Lcustom_classes/Id;)V: Line 935
   * Goal 12. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 13. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   */

  @Test(timeout = 1001000)
  public void test10()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInGoalsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int0 = 1806;
      Id id0 = new Id(int0);
      classUnderTest0.manageWalletAccessWalletsManagerPage(id0);
      classUnderTest0.closeWalletAccessManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageGoalsManagerPage();
      classUnderTest0.goToWalletsManagerPageGoalsManagerPage();
      classUnderTest0.goToGoalsManagerPageWalletsManagerPage();
      classUnderTest0.createNewGoalsManagerPage();
      Goals goals0 = Goals.HOUSE;
      WalletNames walletNames1 = WalletNames.COMPANY;
      classUnderTest0.addGoalToWalletCreateGoalFirstStepPage(goals0, walletNames1);
      classUnderTest0.goToWalletsManagerPageCreateGoalSecondStepPage();
  }

  //Test case number: 11
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTest.acceptOperationConfirmationPage()V: Line 369
   * Goal 2. main.ClassUnderTest.addAddWalletPage(Lcustom_classes/WalletNames;)V: Line 586
   * Goal 3. main.ClassUnderTest.addWalletWalletsManagerPage()V: Line 828
   * Goal 4. main.ClassUnderTest.goToHomeUserLoggedInTransactionManagerPage()V: Line 717
   * Goal 5. main.ClassUnderTest.goToHomeUserLoggedInWalletsManagerPage()V: Line 880
   * Goal 6. main.ClassUnderTest.hideWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 911
   * Goal 7. main.ClassUnderTest.restoreWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 976
   * Goal 8. main.ClassUnderTest.selectActiveFilterWalletsManagerPage()V: Line 994
   * Goal 9. main.ClassUnderTest.selectBothAccessWalletsManagerPage()V: Line 1008
   * Goal 10. main.ClassUnderTest.selectTrashFilterWalletsManagerPage()V: Line 1036
   * Goal 11. main.ClassUnderTest.selectWalletWalletsManagerPage(Lcustom_classes/Id;)V: Line 1051
   */

  @Test(timeout = 1001000)
  public void test11()  throws Throwable  {
      ClassUnderTest classUnderTest0 = new ClassUnderTest();
      int int0 = (-1281);
      Id id0 = new Id(int0);
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
      classUnderTest0.addWalletWalletsManagerPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTest0.addAddWalletPage(walletNames0);
      int int1 = (-781);
      Id id1 = new Id(int1);
      classUnderTest0.hideWalletWalletsManagerPage(id1);
      classUnderTest0.acceptOperationConfirmationPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.selectBothAccessWalletsManagerPage();
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectWalletWalletsManagerPage(id1);
      classUnderTest0.goToHomeUserLoggedInTransactionManagerPage();
      classUnderTest0.restoreWalletWalletsManagerPage(id0);
      classUnderTest0.selectTrashFilterWalletsManagerPage();
      classUnderTest0.selectActiveFilterWalletsManagerPage();
      classUnderTest0.goToHomeUserLoggedInWalletsManagerPage();
  }
}
