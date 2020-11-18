$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/tests/JQueryUIHomepage.feature");
formatter.feature({
  "name": "RedBus Homepage Sceanrios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Title of Homepage",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I verify title of homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "JQueryUIHomepage.i_verify_title_of_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Header Tabs",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I verify below mentioned header tabs:",
  "rows": [
    {
      "cells": [
        "Demos"
      ]
    },
    {
      "cells": [
        "Download"
      ]
    },
    {
      "cells": [
        "API Documentation"
      ]
    },
    {
      "cells": [
        "Themes"
      ]
    },
    {
      "cells": [
        "Development"
      ]
    },
    {
      "cells": [
        "Support"
      ]
    },
    {
      "cells": [
        "Blog"
      ]
    },
    {
      "cells": [
        "About"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "JQueryUIHomepage.i_verify_below_mentioned_header_tabs(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "error_message": "java.lang.AssertionError: expected [false] but found [true]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:494)\r\n\tat org.testng.Assert.assertFalse(Assert.java:63)\r\n\tat org.testng.Assert.assertFalse(Assert.java:73)\r\n\tat reporting.ReportingClass.infoLogFail(ReportingClass.java:55)\r\n\tat reporting.ReportingClass.reportFailure(ReportingClass.java:35)\r\n\tat StepDefination.JQueryUIHomepage.i_click_on(JQueryUIHomepage.java:101)\r\n\tat ✽.I click on \"Learning Center\"(src/test/resources/tests/JQueryUIHomepage.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify the url which contains \"learn\"",
  "keyword": "Then "
});
formatter.match({
  "location": "JQueryUIHomepage.i_verify_the_url_which_contains(String)"
});
formatter.result({
  "status": "skipped"
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