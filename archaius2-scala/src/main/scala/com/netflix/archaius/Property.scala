package com.netflix.archaius

import com.netflix.archaius.api.{Property => JavaProperty}

trait Property[T] {

  self: JavaProperty[T] =>

  def getOpt: Option[T] = Option(get)
}
