package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.ExecutionContext

@Singleton
class AppController @Inject()(val cc: ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc) {
  def index: Action[AnyContent] = {
    Action { request =>
      Ok("Hello!")
    }
  }

  def greet(name: String): Action[AnyContent] = {
    Action { request =>
      Ok(s"Hello $name!")
    }
  }
}
