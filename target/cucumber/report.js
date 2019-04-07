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
  "duration": 3456510400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.open_webpage_and_go_to_sign_in_page()"
});
formatter.result({
  "duration": 4672453000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validate SignIn button is present",
  "description": "",
  "id": "login-in-application;validate-signin-button-is-present",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Cloud"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Validate SignIn button is present",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.validate_signin_button_is_present()"
});
formatter.result({
  "duration": 2046187400,
  "status": "passed"
});
formatter.after({
  "duration": 2338759800,
  "status": "passed"
});
});