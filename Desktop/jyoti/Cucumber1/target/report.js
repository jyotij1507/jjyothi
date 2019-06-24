$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/AddCustomer.feature");
formatter.feature({
  "name": "Adding customer functionality",
  "description": "  This is a add new customer into telecome",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user is in telecom home pages",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.the_user_is_in_telecom_home_pages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on add customer",
  "keyword": "And "
});
formatter.match({
  "location": "Step.the_user_click_on_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is filling the valid details",
  "keyword": "When "
});
formatter.match({
  "location": "Step.the_user_is_filling_the_valid_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Step.the_user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should display with customer id",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.the_user_should_display_with_customer_id()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/main/resources/Feature/AddTariffPlan.feature");
formatter.feature({
  "name": "Add Tariff Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add Tariff plan",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in telecom home page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user click on add tariff plan",
  "keyword": "And "
});
formatter.step({
  "name": "The user is filling the valid detail\"\u003cMR\u003e\",\"\u003cFLC\u003e\",\"\u003cFIN\u003e\",\"\u003cFSM\u003e\",\"\u003cLC\u003e\",\"\u003cIC\u003e\",\"\u003cSMS\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user click on submit buttons",
  "keyword": "And "
});
formatter.step({
  "name": "The user should display congratulations you added tariff successfully.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MR",
        "FLC",
        "FIN",
        "FSM",
        "LC",
        "IC",
        "SMS"
      ]
    },
    {
      "cells": [
        "100",
        "200",
        "300",
        "400",
        "590",
        "600",
        "700"
      ]
    },
    {
      "cells": [
        "200",
        "300",
        "400",
        "500",
        "690",
        "700",
        "701"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add Tariff plan",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in telecom home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariff.the_user_is_in_telecom_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on add tariff plan",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.the_user_click_on_add_tariff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is filling the valid detail\"100\",\"200\",\"300\",\"400\",\"590\",\"600\",\"700\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariff.the_user_is_filling_the_valid_detail(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on submit buttons",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.the_user_click_on_submit_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should display congratulations you added tariff successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariff.the_user_should_display_congratulations_you_added_tariff_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Tariff plan",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in telecom home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariff.the_user_is_in_telecom_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on add tariff plan",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.the_user_click_on_add_tariff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is filling the valid detail\"200\",\"300\",\"400\",\"500\",\"690\",\"700\",\"701\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariff.the_user_is_filling_the_valid_detail(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on submit buttons",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariff.the_user_click_on_submit_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should display congratulations you added tariff successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariff.the_user_should_display_congratulations_you_added_tariff_successfully()"
});
formatter.result({
  "status": "passed"
});
});