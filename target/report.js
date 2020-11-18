$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/tests/JQueryUIHomepage.feature");
formatter.feature({
  "name": "RedBus Homepage Sceanrios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Learning Center link under Support Tab on the top",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch URL of homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "JQueryUIHomepage.launch_URL_of_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover mouse cursor over \"Support\" tab",
  "keyword": "And "
});
formatter.match({
  "location": "JQueryUIHomepage.i_hover_mouse_cursor_over_tab(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Learning Center\"",
  "keyword": "And "
});
formatter.match({
  "location": "JQueryUIHomepage.i_click_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the url which contains \"learn\"",
  "keyword": "Then "
});
formatter.match({
  "location": "JQueryUIHomepage.i_verify_the_url_which_contains(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify CLA link under Contribute on the top",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch URL of homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "JQueryUIHomepage.launch_URL_of_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover mouse cursor over \"Contribute\" tab",
  "keyword": "And "
});
formatter.match({
  "location": "JQueryUIHomepage.i_hover_mouse_cursor_over_tab(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"CLA\"",
  "keyword": "And "
});
formatter.match({
  "location": "JQueryUIHomepage.i_click_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the url which contains \"openjsf\"",
  "keyword": "Then "
});
formatter.match({
  "location": "JQueryUIHomepage.i_verify_the_url_which_contains(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});