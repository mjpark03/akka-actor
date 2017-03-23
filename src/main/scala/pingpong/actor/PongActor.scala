package pingpong.actor

import akka.actor.{Props, Actor}

/**
  * Created by Rachel on 2017. 3. 22..
  */
class PongActor extends Actor {
  val ping = context.actorOf(Props[PingActor], name = "pingactor")

  def receive = {
    case "ping" =>
      println("pong received ping msg")
      ping ! "pong"
  }
}
