$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ecomerce.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Ingresar login exitoso y fallido",
  "description": "",
  "id": "title-of-your-feature;ingresar-login-exitoso-y-fallido",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "ingresamos el usuario \u003cusuario\u003e y la contraseña \u003ccontraseña\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Ingresamos a la pagina principal",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;ingresar-login-exitoso-y-fallido;",
  "rows": [
    {
      "cells": [
        "usuario",
        "contraseña"
      ],
      "line": 10,
      "id": "title-of-your-feature;ingresar-login-exitoso-y-fallido;;1"
    },
    {
      "cells": [
        "\"standard_user\"",
        "\"secret_sauces\""
      ],
      "line": 11,
      "id": "title-of-your-feature;ingresar-login-exitoso-y-fallido;;2"
    },
    {
      "cells": [
        "\"standard_user\"",
        "\"secret_sauce\""
      ],
      "line": 12,
      "id": "title-of-your-feature;ingresar-login-exitoso-y-fallido;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Ingresar login exitoso y fallido",
  "description": "",
  "id": "title-of-your-feature;ingresar-login-exitoso-y-fallido;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "ingresamos el usuario \"standard_user\" y la contraseña \"secret_sauces\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Ingresamos a la pagina principal",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 23
    },
    {
      "val": "secret_sauces",
      "offset": 55
    }
  ],
  "location": "gherkin.ingresamos_el_usuario_y_la_contraseña(String,String)"
});
formatter.result({
  "duration": 303021300,
  "status": "passed"
});
formatter.match({
  "location": "gherkin.ingresamos_a_la_pagina_principal()"
});
formatter.result({
  "duration": 287500,
  "status": "passed"
});
formatter.after({
  "duration": 129400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Ingresar login exitoso y fallido",
  "description": "",
  "id": "title-of-your-feature;ingresar-login-exitoso-y-fallido;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "ingresamos el usuario \"standard_user\" y la contraseña \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Ingresamos a la pagina principal",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 23
    },
    {
      "val": "secret_sauce",
      "offset": 55
    }
  ],
  "location": "gherkin.ingresamos_el_usuario_y_la_contraseña(String,String)"
});
formatter.result({
  "duration": 427900,
  "status": "passed"
});
formatter.match({
  "location": "gherkin.ingresamos_a_la_pagina_principal()"
});
formatter.result({
  "duration": 225000,
  "status": "passed"
});
formatter.after({
  "duration": 60400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "agregar productos al carro",
  "description": "",
  "id": "title-of-your-feature;agregar-productos-al-carro",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "ingresamos el usuario \u003cusuario\u003e y la contraseña \u003ccontraseña\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Ingresamos a la pagina eccomerce y agregamos todos los productos al carro",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "ingresamos al carro de compras",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "ingresamos el nombre \u003cnombre\u003e, el ultimo nombre \u003cultimoNombre\u003e y el codigo postal \u003ccPostal\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "paganos los productos",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "reseteamos los datos del carro y nos deslogueamos",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;agregar-productos-al-carro;",
  "rows": [
    {
      "cells": [
        "usuario",
        "contraseña",
        "nombre",
        "ultimoNombre",
        "cPostal"
      ],
      "line": 25,
      "id": "title-of-your-feature;agregar-productos-al-carro;;1"
    },
    {
      "cells": [
        "\"standard_user\"",
        "\"secret_sauce\"",
        "\"Emerson\"",
        "\"Carlos\"",
        "\"8240000\""
      ],
      "line": 26,
      "id": "title-of-your-feature;agregar-productos-al-carro;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "agregar productos al carro",
  "description": "",
  "id": "title-of-your-feature;agregar-productos-al-carro;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "ingresamos el usuario \"standard_user\" y la contraseña \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Ingresamos a la pagina eccomerce y agregamos todos los productos al carro",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "ingresamos al carro de compras",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "ingresamos el nombre \"Emerson\", el ultimo nombre \"Carlos\" y el codigo postal \"8240000\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "paganos los productos",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "reseteamos los datos del carro y nos deslogueamos",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 23
    },
    {
      "val": "secret_sauce",
      "offset": 55
    }
  ],
  "location": "gherkin.ingresamos_el_usuario_y_la_contraseña(String,String)"
});
formatter.result({
  "duration": 823700,
  "status": "passed"
});
formatter.match({
  "location": "gherkin.ingresamos_a_la_pagina_eccomerce_y_agregamos_todos_los_productos_al_carro()"
});
formatter.result({
  "duration": 294000,
  "status": "passed"
});
formatter.match({
  "location": "gherkin.ingresamos_al_carro_de_compras()"
});
formatter.result({
  "duration": 1135400,
  "error_message": "java.lang.NullPointerException\r\n\tat pom.funcionesBasicas.clic(funcionesBasicas.java:20)\r\n\tat pom.productPage.cartProducts(productPage.java:49)\r\n\tat ejecuciones.gherkin.ingresamos_al_carro_de_compras(gherkin.java:27)\r\n\tat ✽.When ingresamos al carro de compras(ecomerce.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Emerson",
      "offset": 22
    },
    {
      "val": "Carlos",
      "offset": 50
    },
    {
      "val": "8240000",
      "offset": 78
    }
  ],
  "location": "gherkin.ingresamos_el_nombre_el_ultimo_nombre_y_el_codigo_postal(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "gherkin.paganos_los_productos()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "gherkin.reseteamos_los_datos_del_carro_y_nos_deslogueamos()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 90400,
  "status": "passed"
});
});