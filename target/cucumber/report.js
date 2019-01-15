$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "User tries to login to amazon.com with valid and invalid credentials",
  "description": "",
  "id": "user-tries-to-login-to-amazon.com-with-valid-and-invalid-credentials",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2323075982,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Valid login",
  "description": "",
  "id": "user-tries-to-login-to-amazon.com-with-valid-and-invalid-credentials;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am a user of amazon.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I log in using valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_a_user_of_amazoncom()"
});
formatter.result({
  "duration": 7076969026,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_log_in_using_valid_credentials()"
});
formatter.result({
  "duration": 5109722622,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_be_logged_in()"
});
formatter.result({
  "duration": 15133999159,
  "error_message": "java.lang.AssertionError: WebElement is NOT visible, Exception: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: \t//*[@id\u003d\u0027nav-link-accountList\u0027]/span[1]\u0027 (tried for 15 second(s) with 500 MILLISECONDS interval)\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat pageObjects.BasePage.WaitUntilWebElementIsVisible(BasePage.java:239)\r\n\tat pageObjects.Login_Page.confirmLoginWasSuccessful(Login_Page.java:61)\r\n\tat stepDefinitions.LoginSteps.i_should_be_logged_in(LoginSteps.java:36)\r\n\tat ✽.Then I should be logged in(src/test/java/resources/features/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 919456798,
  "status": "passed"
});
formatter.before({
  "duration": 1730463797,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Invalid login",
  "description": "",
  "id": "user-tries-to-login-to-amazon.com-with-valid-and-invalid-credentials;invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am a user of amazon.com",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I log in using invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should not be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_a_user_of_amazoncom()"
});
formatter.result({
  "duration": 6685033314,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_log_in_using_invalid_credentials()"
});
formatter.result({
  "duration": 4382910028,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_not_be_logged_in()"
});
formatter.result({
  "duration": 79837882,
  "status": "passed"
});
formatter.after({
  "duration": 1004150365,
  "status": "passed"
});
});