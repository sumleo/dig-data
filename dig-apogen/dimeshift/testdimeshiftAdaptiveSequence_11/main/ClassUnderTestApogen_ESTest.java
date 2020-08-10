/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 10 11:59:58 GMT 2020
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
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 21 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addAccessAccessEmailPage(Lcustom_classes/Email;)V: Line 144
   * Goal 2. main.ClassUnderTestApogen.addAccessGiveAccessToWalletPage(Lcustom_classes/Email;)V: Line 423
   * Goal 3. main.ClassUnderTestApogen.addIncomeAddIncomePage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 41
   * Goal 4. main.ClassUnderTestApogen.closeAccessEmailPage()V: Line 158
   * Goal 5. main.ClassUnderTestApogen.confirmAndSaveCreatePlanAdvancedSettingsPage()V: Line 263
   * Goal 6. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 7. main.ClassUnderTestApogen.editGoalCreatePlanPage(Lcustom_classes/Id;)V: Line 74
   * Goal 8. main.ClassUnderTestApogen.editWalletWalletPage(Lcustom_classes/Id;)V: Line 469
   * Goal 9. main.ClassUnderTestApogen.goToAddIncomePageTransactionsPage()V: Line 376
   * Goal 10. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 11. main.ClassUnderTestApogen.goToCreateNewPlanPageCreatePlanPage()V: Line 92
   * Goal 12. main.ClassUnderTestApogen.goToGoalsPageWalletPage()V: Line 510
   * Goal 13. main.ClassUnderTestApogen.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 296
   * Goal 14. main.ClassUnderTestApogen.goToPlanBasicSettingsPageCreatePlanAdvancedSettingsPage()V: Line 278
   * Goal 15. main.ClassUnderTestApogen.goToPlanPageCreatePlanBasicSettingsPage()V: Line 314
   * Goal 16. main.ClassUnderTestApogen.goToTransactionsWalletPage(Lcustom_classes/Id;)V: Line 525
   * Goal 17. main.ClassUnderTestApogen.goToWalletPageGiveAccessToWalletPage()V: Line 437
   * Goal 18. main.ClassUnderTestApogen.goToWalletPageHideWalletPage()V: Line 208
   * Goal 19. main.ClassUnderTestApogen.goToWalletPageViewPlanPage()V: Line 451
   * Goal 20. main.ClassUnderTestApogen.hideWalletWalletPage(Lcustom_classes/Id;)V: Line 562
   * Goal 21. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      int int0 = (-1557);
      Id id0 = new Id(int0);
      classUnderTestApogen0.editWalletWalletPage(id0);
      WalletNames walletNames1 = WalletNames.PRIVATE;
      classUnderTestApogen0.editAddWalletPage(walletNames1);
      classUnderTestApogen0.editWalletWalletPage(id0);
      WalletNames walletNames2 = WalletNames.PRIVATE;
      classUnderTestApogen0.editAddWalletPage(walletNames2);
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames3 = WalletNames.COMPANY;
      classUnderTestApogen0.editAddWalletPage(walletNames3);
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email0 = Email.COMPANY;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email0);
      Email email1 = Email.ASD;
      classUnderTestApogen0.addAccessAccessEmailPage(email1);
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      classUnderTestApogen0.goToPlanPageCreatePlanBasicSettingsPage();
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      Goals goals0 = Goals.HOUSE;
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals0, walletNames2);
      classUnderTestApogen0.confirmAndSaveCreatePlanAdvancedSettingsPage();
      classUnderTestApogen0.goToWalletPageViewPlanPage();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames4 = WalletNames.PRIVATE;
      classUnderTestApogen0.editAddWalletPage(walletNames4);
      int int1 = (-2465);
      Id id1 = new Id(int1);
      classUnderTestApogen0.editWalletWalletPage(id1);
      classUnderTestApogen0.editAddWalletPage(walletNames3);
      classUnderTestApogen0.manageWalletAccessWalletPage(id1);
      classUnderTestApogen0.goToWalletPageGiveAccessToWalletPage();
      classUnderTestApogen0.hideWalletWalletPage(id0);
      classUnderTestApogen0.goToWalletPageHideWalletPage();
      classUnderTestApogen0.editWalletWalletPage(id1);
      WalletNames walletNames5 = WalletNames.PRIVATE;
      classUnderTestApogen0.editAddWalletPage(walletNames5);
      classUnderTestApogen0.manageWalletAccessWalletPage(id1);
      classUnderTestApogen0.goToWalletPageGiveAccessToWalletPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      classUnderTestApogen0.goToPlanPageCreatePlanBasicSettingsPage();
      classUnderTestApogen0.editGoalCreatePlanPage(id1);
      Goals goals1 = Goals.MUSEUM;
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals1, walletNames0);
      classUnderTestApogen0.goToPlanBasicSettingsPageCreatePlanAdvancedSettingsPage();
      classUnderTestApogen0.goToPlanPageCreatePlanBasicSettingsPage();
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals0, walletNames4);
      classUnderTestApogen0.confirmAndSaveCreatePlanAdvancedSettingsPage();
      classUnderTestApogen0.goToWalletPageViewPlanPage();
      classUnderTestApogen0.goToTransactionsWalletPage(id1);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SCHOLARSHIP;
      Amount amount0 = new Amount(id1.value);
      classUnderTestApogen0.addIncomeAddIncomePage(incomeDescription0, amount0);
  }

  //Test case number: 1
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addAccessAccessEmailPage(Lcustom_classes/Email;)V: Line 144
   * Goal 2. main.ClassUnderTestApogen.addAccessGiveAccessToWalletPage(Lcustom_classes/Email;)V: Line 423
   * Goal 3. main.ClassUnderTestApogen.addProfitSetTotalPage(Lcustom_classes/Amount;)V: Line 606
   * Goal 4. main.ClassUnderTestApogen.cancelRemoveEmailAccessPage()V: Line 236
   * Goal 5. main.ClassUnderTestApogen.closeAccessEmailPage()V: Line 158
   * Goal 6. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 7. main.ClassUnderTestApogen.editWalletWalletPage(Lcustom_classes/Id;)V: Line 469
   * Goal 8. main.ClassUnderTestApogen.goToAddIncomePageTransactionsPage()V: Line 376
   * Goal 9. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 10. main.ClassUnderTestApogen.goToGoalsPageWalletPage()V: Line 510
   * Goal 11. main.ClassUnderTestApogen.goToSetTotalPageTransactionsPage()V: Line 390
   * Goal 12. main.ClassUnderTestApogen.goToTransactionsAddIncomePage()V: Line 60
   * Goal 13. main.ClassUnderTestApogen.goToTransactionsWalletPage(Lcustom_classes/Id;)V: Line 525
   * Goal 14. main.ClassUnderTestApogen.goToWalletPageAddWalletPage()V: Line 347
   * Goal 15. main.ClassUnderTestApogen.goToWalletPageHideWalletPage()V: Line 208
   * Goal 16. main.ClassUnderTestApogen.goToWalletPageTransactionsPage()V: Line 404
   * Goal 17. main.ClassUnderTestApogen.hideWalletWalletPage(Lcustom_classes/Id;)V: Line 562
   * Goal 18. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   * Goal 19. main.ClassUnderTestApogen.removeAccessAccessEmailPage(Lcustom_classes/Email;)V: Line 174
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 1970;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      classUnderTestApogen0.editWalletWalletPage(id0);
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email0 = Email.COMPANY;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email0);
      classUnderTestApogen0.removeAccessAccessEmailPage(email0);
      classUnderTestApogen0.cancelRemoveEmailAccessPage();
      Email email1 = Email.ASD;
      classUnderTestApogen0.addAccessAccessEmailPage(email1);
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.hideWalletWalletPage(id0);
      classUnderTestApogen0.goToWalletPageHideWalletPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email2 = Email.COMPANY;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email2);
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      int int1 = 601;
      Id id1 = new Id(int1);
      classUnderTestApogen0.hideWalletWalletPage(id1);
      classUnderTestApogen0.goToWalletPageHideWalletPage();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
      classUnderTestApogen0.goToTransactionsWalletPage(id1);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      classUnderTestApogen0.goToTransactionsAddIncomePage();
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      int int2 = (-676);
      Amount amount0 = new Amount(int2);
      classUnderTestApogen0.addProfitSetTotalPage(amount0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      classUnderTestApogen0.goToTransactionsAddIncomePage();
      classUnderTestApogen0.goToWalletPageTransactionsPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
  }

  //Test case number: 2
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addAccessGiveAccessToWalletPage(Lcustom_classes/Email;)V: Line 423
   * Goal 2. main.ClassUnderTestApogen.addIncomeAddIncomePage(Lcustom_classes/IncomeDescription;Lcustom_classes/Amount;)V: Line 41
   * Goal 3. main.ClassUnderTestApogen.addTransactionTransactionsPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 362
   * Goal 4. main.ClassUnderTestApogen.closeAccessEmailPage()V: Line 158
   * Goal 5. main.ClassUnderTestApogen.confirmAndSaveCreatePlanAdvancedSettingsPage()V: Line 263
   * Goal 6. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 7. main.ClassUnderTestApogen.editGoalCreatePlanPage(Lcustom_classes/Id;)V: Line 74
   * Goal 8. main.ClassUnderTestApogen.goToAddIncomePageTransactionsPage()V: Line 376
   * Goal 9. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 10. main.ClassUnderTestApogen.goToCreateNewPlanPageCreatePlanPage()V: Line 92
   * Goal 11. main.ClassUnderTestApogen.goToGoalsPageWalletPage()V: Line 510
   * Goal 12. main.ClassUnderTestApogen.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 296
   * Goal 13. main.ClassUnderTestApogen.goToPlanBasicSettingsPageCreatePlanAdvancedSettingsPage()V: Line 278
   * Goal 14. main.ClassUnderTestApogen.goToTransactionsAddIncomePage()V: Line 60
   * Goal 15. main.ClassUnderTestApogen.goToTransactionsWalletPage(Lcustom_classes/Id;)V: Line 525
   * Goal 16. main.ClassUnderTestApogen.goToWalletPageTransactionsPage()V: Line 404
   * Goal 17. main.ClassUnderTestApogen.goToWalletPageViewPlanPage()V: Line 451
   * Goal 18. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   * Goal 19. main.ClassUnderTestApogen.viewPlanPageCreatePlanPage(Lcustom_classes/Id;)V: Line 107
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.COMPANY;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      classUnderTestApogen0.goToGoalsPageWalletPage();
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      Goals goals0 = Goals.CAR;
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals0, walletNames0);
      classUnderTestApogen0.confirmAndSaveCreatePlanAdvancedSettingsPage();
      classUnderTestApogen0.goToWalletPageViewPlanPage();
      int int0 = 3359;
      Id id0 = new Id(int0);
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email0 = Email.COMPANY;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email0);
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
      classUnderTestApogen0.viewPlanPageCreatePlanPage(id0);
      classUnderTestApogen0.goToWalletPageViewPlanPage();
      classUnderTestApogen0.goToTransactionsWalletPage(id0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      IncomeDescription incomeDescription0 = IncomeDescription.SALARY;
      int int1 = 879;
      Amount amount0 = new Amount(int1);
      classUnderTestApogen0.addIncomeAddIncomePage(incomeDescription0, amount0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      classUnderTestApogen0.goToTransactionsAddIncomePage();
      classUnderTestApogen0.goToWalletPageTransactionsPage();
      classUnderTestApogen0.goToTransactionsWalletPage(id0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      IncomeDescription incomeDescription1 = IncomeDescription.SCHOLARSHIP;
      classUnderTestApogen0.addIncomeAddIncomePage(incomeDescription1, amount0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      classUnderTestApogen0.goToTransactionsAddIncomePage();
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      IncomeDescription incomeDescription2 = IncomeDescription.SCHOLARSHIP;
      classUnderTestApogen0.addIncomeAddIncomePage(incomeDescription2, amount0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      classUnderTestApogen0.goToTransactionsAddIncomePage();
      TransactionDescription transactionDescription0 = TransactionDescription.EBAY;
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription0, amount0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      IncomeDescription incomeDescription3 = IncomeDescription.SCHOLARSHIP;
      classUnderTestApogen0.addIncomeAddIncomePage(incomeDescription3, amount0);
      classUnderTestApogen0.goToAddIncomePageTransactionsPage();
      IncomeDescription incomeDescription4 = IncomeDescription.SCHOLARSHIP;
      classUnderTestApogen0.addIncomeAddIncomePage(incomeDescription4, amount0);
      classUnderTestApogen0.goToWalletPageTransactionsPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
      classUnderTestApogen0.editGoalCreatePlanPage(id0);
      Goals goals1 = Goals.CAR;
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals1, walletNames0);
      classUnderTestApogen0.goToPlanBasicSettingsPageCreatePlanAdvancedSettingsPage();
  }

  //Test case number: 3
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addAccessGiveAccessToWalletPage(Lcustom_classes/Email;)V: Line 423
   * Goal 2. main.ClassUnderTestApogen.addTransactionTransactionsPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 362
   * Goal 3. main.ClassUnderTestApogen.cancelHideWalletPage()V: Line 194
   * Goal 4. main.ClassUnderTestApogen.closeAccessEmailPage()V: Line 158
   * Goal 5. main.ClassUnderTestApogen.confirmAndSaveCreatePlanAdvancedSettingsPage()V: Line 263
   * Goal 6. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 7. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 8. main.ClassUnderTestApogen.goToCreateNewPlanPageCreatePlanPage()V: Line 92
   * Goal 9. main.ClassUnderTestApogen.goToGoalsPageWalletPage()V: Line 510
   * Goal 10. main.ClassUnderTestApogen.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(Lcustom_classes/Goals;Lcustom_classes/WalletNames;)V: Line 296
   * Goal 11. main.ClassUnderTestApogen.goToTransactionsWalletPage(Lcustom_classes/Id;)V: Line 525
   * Goal 12. main.ClassUnderTestApogen.goToWalletPageViewPlanPage()V: Line 451
   * Goal 13. main.ClassUnderTestApogen.hideWalletWalletPage(Lcustom_classes/Id;)V: Line 562
   * Goal 14. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   * Goal 15. main.ClassUnderTestApogen.removeAccessAccessEmailPage(Lcustom_classes/Email;)V: Line 174
   * Goal 16. main.ClassUnderTestApogen.removeRemoveEmailAccessPage()V: Line 250
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = (-562);
      Id id0 = new Id(int0);
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      classUnderTestApogen0.hideWalletWalletPage(id0);
      classUnderTestApogen0.cancelHideWalletPage();
      classUnderTestApogen0.goToGoalsPageWalletPage();
      Email email0 = Email.ASD;
      classUnderTestApogen0.goToCreateNewPlanPageCreatePlanPage();
      Goals goals0 = Goals.MUSEUM;
      classUnderTestApogen0.goToPlanAdvancedSettingsCreatePlanBasicSettingsPage(goals0, walletNames0);
      classUnderTestApogen0.confirmAndSaveCreatePlanAdvancedSettingsPage();
      classUnderTestApogen0.goToWalletPageViewPlanPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email0);
      classUnderTestApogen0.removeAccessAccessEmailPage(email0);
      classUnderTestApogen0.removeRemoveEmailAccessPage();
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToTransactionsWalletPage(id0);
      TransactionDescription transactionDescription0 = TransactionDescription.EBAY;
      int int1 = (-4632);
      Amount amount0 = new Amount(int1);
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription0, amount0);
  }

  //Test case number: 4
  /*
   * 8 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addAccessAccessEmailPage(Lcustom_classes/Email;)V: Line 144
   * Goal 2. main.ClassUnderTestApogen.addAccessGiveAccessToWalletPage(Lcustom_classes/Email;)V: Line 423
   * Goal 3. main.ClassUnderTestApogen.closeAccessEmailPage()V: Line 158
   * Goal 4. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 5. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 6. main.ClassUnderTestApogen.goToTrashPageWalletPage()V: Line 543
   * Goal 7. main.ClassUnderTestApogen.goToWalletPageTrashPage()V: Line 126
   * Goal 8. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 538;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.PERSONAL;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      Email email0 = Email.ASD;
      classUnderTestApogen0.addAccessGiveAccessToWalletPage(email0);
      classUnderTestApogen0.addAccessAccessEmailPage(email0);
      classUnderTestApogen0.closeAccessEmailPage();
      classUnderTestApogen0.goToTrashPageWalletPage();
      classUnderTestApogen0.goToWalletPageTrashPage();
  }

  //Test case number: 5
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addProfitSetTotalPage(Lcustom_classes/Amount;)V: Line 606
   * Goal 2. main.ClassUnderTestApogen.addTransactionTransactionsPage(Lcustom_classes/TransactionDescription;Lcustom_classes/Amount;)V: Line 362
   * Goal 3. main.ClassUnderTestApogen.cancelHideWalletPage()V: Line 194
   * Goal 4. main.ClassUnderTestApogen.editAddWalletPage(Lcustom_classes/WalletNames;)V: Line 333
   * Goal 5. main.ClassUnderTestApogen.goToAddWalletPageWalletPage()V: Line 492
   * Goal 6. main.ClassUnderTestApogen.goToSetTotalPageTransactionsPage()V: Line 390
   * Goal 7. main.ClassUnderTestApogen.goToTransactionsWalletPage(Lcustom_classes/Id;)V: Line 525
   * Goal 8. main.ClassUnderTestApogen.goToWalletPageAddWalletPage()V: Line 347
   * Goal 9. main.ClassUnderTestApogen.goToWalletPageGiveAccessToWalletPage()V: Line 437
   * Goal 10. main.ClassUnderTestApogen.goToWalletPageTransactionsPage()V: Line 404
   * Goal 11. main.ClassUnderTestApogen.hideHideWalletPage()V: Line 222
   * Goal 12. main.ClassUnderTestApogen.hideWalletWalletPage(Lcustom_classes/Id;)V: Line 562
   * Goal 13. main.ClassUnderTestApogen.manageWalletAccessWalletPage(Lcustom_classes/Id;)V: Line 585
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 109;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      WalletNames walletNames0 = WalletNames.PRIVATE;
      classUnderTestApogen0.editAddWalletPage(walletNames0);
      classUnderTestApogen0.goToTransactionsWalletPage(id0);
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      Amount amount0 = new Amount(id0.value);
      classUnderTestApogen0.addProfitSetTotalPage(amount0);
      TransactionDescription transactionDescription0 = TransactionDescription.EBAY;
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription0, amount0);
      classUnderTestApogen0.goToSetTotalPageTransactionsPage();
      classUnderTestApogen0.addProfitSetTotalPage(amount0);
      TransactionDescription transactionDescription1 = TransactionDescription.EBAY;
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription1, amount0);
      TransactionDescription transactionDescription2 = TransactionDescription.AMAZON;
      classUnderTestApogen0.addTransactionTransactionsPage(transactionDescription2, amount0);
      classUnderTestApogen0.goToWalletPageTransactionsPage();
      classUnderTestApogen0.hideWalletWalletPage(id0);
      classUnderTestApogen0.cancelHideWalletPage();
      classUnderTestApogen0.manageWalletAccessWalletPage(id0);
      classUnderTestApogen0.goToWalletPageGiveAccessToWalletPage();
      classUnderTestApogen0.hideWalletWalletPage(id0);
      classUnderTestApogen0.hideHideWalletPage();
      classUnderTestApogen0.goToAddWalletPageWalletPage();
      classUnderTestApogen0.goToWalletPageAddWalletPage();
  }
}
