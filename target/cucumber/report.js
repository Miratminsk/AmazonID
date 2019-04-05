$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mainPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login in application",
  "description": "",
  "id": "login-in-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Initialize WebDriver",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Open webpage and go to sign in page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.initialize_webdriver()"
});
formatter.result({
  "duration": 3803167600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.open_webpage_and_go_to_sign_in_page()"
});
formatter.result({
  "duration": 7809252700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login with valid username and unvalid password",
  "description": "",
  "id": "login-in-application;login-with-valid-username-and-unvalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User login with valid username and unvalid password",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Unvalid password error is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_login_with_valid_username_and_unvalid_password()"
});
formatter.result({
  "duration": 1261603000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.unvalid_password_error_is_displayed()"
});
formatter.result({
  "duration": 56441400,
  "status": "passed"
});
formatter.after({
  "duration": 243600,
  "status": "passed"
});
formatter.after({
  "duration": 2319593200,
  "status": "passed"
});
});