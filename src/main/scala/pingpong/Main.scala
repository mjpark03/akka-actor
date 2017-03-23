package pingpong

import akka.actor.{Props, ActorSystem}
import pingpong.actor.PingActor

/**
  * Created by Rachel on 2017. 3. 22..
  */
object Main extends App {

  val actorSystem = ActorSystem("PingPongSystem")
  val ping = actorSystem.actorOf(Props[PingActor], name = "pingactor")
  ping ! "start"
}
