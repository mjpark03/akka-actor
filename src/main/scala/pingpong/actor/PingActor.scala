package pingpong.actor

import akka.actor.{Props, Actor}

/**
  * Created by Rachel on 2017. 3. 22..
  */
class PingActor extends Actor {
  val pong = context.actorOf(Props[PongActor], name = "pongactor")

  def receive = {
    case "start" =>
      println("Ping received start msg")
      pong ! "ping"
    case "pong" =>
      println("Ping received pong msg")
      pong ! "ping"
  }
}
