package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.mvc._
import play.api.test._
import play.api.test.Helpers._
import scala.concurrent._

class AccountControllerSpec extends PlaySpec with GuiceOneAppPerSuite {
  val controller: AppController =
    app.injector.instanceOf[AppController]

  "index endpoint" should {
    "say hello" in {
      val result: Future[Result] =
        controller.index().apply(FakeRequest())

      status(result) must be(OK)
      contentType(result) must be(Some("text/plain"))
      contentAsString(result) must be("Hello!")
    }
  }

  "greet endpoint" should {
    "say hello and provide the name from the URL" in {
      val result: Future[Result] =
        controller.greet("world").apply(FakeRequest())

      status(result) must be(OK)
      contentType(result) must be(Some("text/plain"))
      contentAsString(result) must be("Hello world!")
    }
  }
}
