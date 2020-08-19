/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 18 20:41:03 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Email;
import custom_classes.Id;
import custom_classes.Name;
import custom_classes.UserPassword;
import custom_classes.UserRoles;
import custom_classes.UserStatus;
import custom_classes.Username;
import custom_classes.WidgetLocation;
import custom_classes.WidgetNumberOfUsers;
import custom_classes.WidgetTotalUser;
import custom_classes.WidgetUnit;
import custom_classes.WidgetUserDisplay;
import custom_classes.WidgetUserType;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 18 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.cancelDeleteWidgetPage()V: Line 542
   * Goal 4. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 5. main.ClassUnderTestApogen.deleteRoleDeleteRolePage()V: Line 633
   * Goal 6. main.ClassUnderTestApogen.deleteUserRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 369
   * Goal 7. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 8. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 9. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 10. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 11. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 12. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 13. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 14. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 15. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 16. main.ClassUnderTestApogen.goToRolesAddUserPage()V: Line 253
   * Goal 17. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 18. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      UserRoles userRoles1 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.deleteUserRoleAnonymousPage(userRoles1);
      classUnderTestApogen0.deleteRoleDeleteRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles1);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      int int0 = (-1900);
      Id id0 = new Id(int0);
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.cancelDeleteWidgetPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToRolesAddUserPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
  }

  //Test case number: 1
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 217
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 4. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 5. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 6. main.ClassUnderTestApogen.goToEditUsersPage(Lcustom_classes/Id;)V: Line 600
   * Goal 7. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 8. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 9. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 10. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 11. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 12. main.ClassUnderTestApogen.goToUserAddUserPage()V: Line 267
   * Goal 13. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 14. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 15. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   * Goal 16. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username0 = Username.ADMIN;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.FOO;
      UserStatus userStatus0 = UserStatus.BLOCKED;
      classUnderTestApogen0.addUserAddUserPage(username0, name0, email0, userPassword0, userStatus0);
      Username username1 = Username.ADMIN;
      Email email1 = Email.ASD;
      classUnderTestApogen0.addUserAddUserPage(username1, name0, email1, userPassword0, userStatus0);
      classUnderTestApogen0.goToUserAddUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      int int0 = (-2886);
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      Username username2 = Username.ADMIN;
      UserPassword userPassword1 = UserPassword.FOO;
      classUnderTestApogen0.user_editEditUserPage(username2, name0, email0, userPassword1);
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
  }

  //Test case number: 2
  /*
   * 15 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 220
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 8. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 9. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 10. main.ClassUnderTestApogen.goToEditUsersPage(Lcustom_classes/Id;)V: Line 600
   * Goal 11. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 14. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 15. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 1398;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles1 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles1);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username0 = Username.FOO;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.ADMIN;
      UserStatus userStatus0 = UserStatus.ACTIVE;
      classUnderTestApogen0.addUserAddUserPage(username0, name0, email0, userPassword0, userStatus0);
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.formEditLocationPage(Lcustom_classes/WidgetLocation;Lcustom_classes/WidgetUnit;)V: Line 695
   * Goal 3. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 4. main.ClassUnderTestApogen.goToEditComponentLocationDashboardPage(Lcustom_classes/Id;)V: Line 152
   * Goal 5. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = (-153);
      Id id0 = new Id(int0);
      WidgetUnit widgetUnit0 = WidgetUnit.IMPERIAL;
      Id id1 = new Id(id0.value);
      classUnderTestApogen0.goToEditComponentLocationDashboardPage(id1);
      WidgetLocation widgetLocation0 = WidgetLocation.MILANO;
      classUnderTestApogen0.formEditLocationPage(widgetLocation0, widgetUnit0);
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
  }

  //Test case number: 4
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.formEditRegisteredUserPage(Lcustom_classes/WidgetUserType;Lcustom_classes/WidgetUserDisplay;Lcustom_classes/WidgetTotalUser;Lcustom_classes/WidgetNumberOfUsers;)V: Line 468
   * Goal 3. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 4. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 5. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousEditRolePage()V: Line 528
   * Goal 8. main.ClassUnderTestApogen.goToEditRegisteredUserDashboardPage(Lcustom_classes/Id;)V: Line 177
   * Goal 9. main.ClassUnderTestApogen.goToEditRoleAnonymousPage(Lcustom_classes/UserRoles;Lcustom_classes/UserRoles;)V: Line 426
   * Goal 10. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 11. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 13. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 705;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserType widgetUserType0 = WidgetUserType.LASTREGISTERED;
      WidgetUserDisplay widgetUserDisplay0 = WidgetUserDisplay.LIST;
      WidgetTotalUser widgetTotalUser0 = WidgetTotalUser.HIDE;
      WidgetNumberOfUsers widgetNumberOfUsers0 = WidgetNumberOfUsers.SIX;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay0, widgetTotalUser0, widgetNumberOfUsers0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      UserRoles userRoles1 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToEditRoleAnonymousPage(userRoles0, userRoles1);
      classUnderTestApogen0.goToAnonymousEditRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToPermissionsEditUserPage();
  }

  //Test case number: 5
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.deleteUserRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 369
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousDeleteRolePage()V: Line 648
   * Goal 8. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 9. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 10. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 11. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 12. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 14. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 15. main.ClassUnderTestApogen.goToUserAddUserPage()V: Line 267
   * Goal 16. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 17. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.deleteUserRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.goToAnonymousDeleteRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUserAddUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
  }

  //Test case number: 6
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 3. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 4. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 5. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 8. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 9. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 10. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 11. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsAddUserPage()V: Line 239
   * Goal 13. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 14. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles1 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles1);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToPermissionsAddUserPage();
  }

  //Test case number: 7
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 6. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 7. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 8. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 9. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 10. main.ClassUnderTestApogen.okDeleteWidgetPage()V: Line 556
   */

  @Test(timeout = 1001000)
  public void test7()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = (-2197);
      Id id0 = new Id(int0);
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.okDeleteWidgetPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUsersAddUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      UserRoles userRoles0 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
  }
}
