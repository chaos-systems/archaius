package com.netflix.archaius

import com.netflix.archaius.api.{Config => JavaConfig}

trait Config {

  self: JavaConfig =>

  def getLongOpt(key: String, defaultValue: Long = null): Option[Long] = Option(getLong(key, defaultValue))
}
