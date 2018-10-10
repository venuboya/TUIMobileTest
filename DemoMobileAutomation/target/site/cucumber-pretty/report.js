$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/QaTestApp.feature");
formatter.feature({
  "line": 2,
  "name": "Demo app login feature",
  "description": "",
  "id": "demo-app-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@QaTestApp"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "login test with different first name and last name",
  "description": "",
  "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user launches QaTestApp",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enters \"\u003cfirstName\u003e\" and \"\u003clastName\u003e\" to login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify user firstName is present",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName"
      ],
      "line": 11,
      "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name;;1"
    },
    {
      "cells": [
        "DemoFirstName",
        "DemoLastName"
      ],
      "line": 12,
      "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name;;2"
    },
    {
      "cells": [
        "123456",
        "123456"
      ],
      "line": 13,
      "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name;;3"
    },
    {
      "cells": [
        "ab@cd_EF",
        "ab@cd_EF"
      ],
      "line": 14,
      "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "login test with different first name and last name",
  "description": "",
  "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@QaTestApp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches QaTestApp",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enters \"DemoFirstName\" and \"DemoLastName\" to login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify user firstName is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_launches_QaTestApp()"
});
formatter.result({
  "duration": 14043876510,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DemoFirstName",
      "offset": 8
    },
    {
      "val": "DemoLastName",
      "offset": 28
    }
  ],
  "location": "LoginSteps.enters_firstName_and_lastName_to_login(String,String)"
});
formatter.result({
  "duration": 15381697882,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_user_firstName_is_present()"
});
formatter.result({
  "duration": 529638956,
  "status": "passed"
});
formatter.after({
  "duration": 3313210984,
  "status": "passed"
});
formatter.after({
  "duration": 193770,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "login test with different first name and last name",
  "description": "",
  "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@QaTestApp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches QaTestApp",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enters \"123456\" and \"123456\" to login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify user firstName is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_launches_QaTestApp()"
});
formatter.result({
  "duration": 14954277753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 8
    },
    {
      "val": "123456",
      "offset": 21
    }
  ],
  "location": "LoginSteps.enters_firstName_and_lastName_to_login(String,String)"
});
formatter.result({
  "duration": 15048803267,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_user_firstName_is_present()"
});
formatter.result({
  "duration": 525128475,
  "status": "passed"
});
formatter.after({
  "duration": 3400151567,
  "status": "passed"
});
formatter.after({
  "duration": 158874,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "login test with different first name and last name",
  "description": "",
  "id": "demo-app-login-feature;login-test-with-different-first-name-and-last-name;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@QaTestApp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches QaTestApp",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enters \"ab@cd_EF\" and \"ab@cd_EF\" to login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify user firstName is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_launches_QaTestApp()"
});
formatter.result({
  "duration": 12700233017,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ab@cd_EF",
      "offset": 8
    },
    {
      "val": "ab@cd_EF",
      "offset": 23
    }
  ],
  "location": "LoginSteps.enters_firstName_and_lastName_to_login(String,String)"
});
formatter.result({
  "duration": 15441523029,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_user_firstName_is_present()"
});
formatter.result({
  "duration": 519552671,
  "status": "passed"
});
formatter.after({
  "duration": 3570227950,
  "status": "passed"
});
formatter.after({
  "duration": 155591,
  "status": "passed"
});
});