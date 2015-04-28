import play.api._
import play.api.mvc._
import play.api.mvc.Results._
import scala.concurrent.Future

object Global extends GlobalSettings {
  override def onStart(app: Application) {
    Logger.info("Application has started")
  }  
  
  override def onStop(app: Application) {
    Logger.info("Application shutdown...")
  }  

  // 404 - page not found error
  override def onHandlerNotFound(request: RequestHeader) = {
    Future.successful(NotFound(views.html.notFound(request.path)))
  }

  // 500 - internal server error
  override def onError(request: RequestHeader, throwable: Throwable) = {
    Future.successful(InternalServerError(views.html.errors(throwable)))
  }
}