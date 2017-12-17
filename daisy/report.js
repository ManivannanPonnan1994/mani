$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cucumber02.feature");
formatter.feature({
  "line": 1,
  "name": "Accessing the dashboard",
  "description": "",
  "id": "accessing-the-dashboard",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "test background",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a valid user on the web page",
  "keyword": "Given "
});
formatter.match({
  "location": "Cucumber02_StepDef.i_am_a_valid_user_on_the_web_page()"
});
formatter.result({
  "duration": 28817822288,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Insurance Records",
  "description": "",
  "id": "accessing-the-dashboard;insurance-records",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tag4"
    },
    {
      "line": 29,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am able to access the dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I enter the insurance records",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "Phone",
        "address",
        "age"
      ],
      "line": 33
    },
    {
      "cells": [
        "a",
        "a",
        "a",
        "a",
        "a"
      ],
      "line": 34
    },
    {
      "cells": [
        "abv",
        "alu",
        "agh",
        "ath",
        "afgd"
      ],
      "line": 35
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I post it",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should be able to retrieve the data fom DB",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber02_StepDef.i_am_able_to_access_the_dashboard()"
});
formatter.result({
  "duration": 1859152,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber02_StepDef.i_enter_the_insurance_records(DataTable)"
});
formatter.result({
  "duration": 9062048,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber02_StepDef.i_post_it()"
});
formatter.result({
  "duration": 450688,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber02_StepDef.i_should_be_able_to_retrieve_the_data_fom_DB()"
});
formatter.result({
  "duration": 48512,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1515998880,
  "status": "passed"
});
});