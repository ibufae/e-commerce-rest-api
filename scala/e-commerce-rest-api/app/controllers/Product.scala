/**
 * e-commerce-rest-scala
 *
 * Copyright 2015 juanitodread
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package controllers

import play.api.mvc.Controller
import play.api.mvc.Action
import play.api.libs.json.Json

import models.{Product => PBean}

/**
 * RESTful service for products
 *
 * @author juanitodread
 * @version 1.0.0
 * @since   1.0.0
 * 
 * 	        Oct 25, 2015
 */
object Product extends Controller {

  def getAllProducts = Action { implicit request =>

    val defaultProduct = PBean( "1", "Scala book", 23.50 )
    Ok( Json.toJson( defaultProduct ) )
  }

}