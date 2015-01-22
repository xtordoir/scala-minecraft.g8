Scala-Minecraft Giter8 Template
===============================
This is a Giter8 template for making minecraft mods in Scala. It is a fork of https://github.com/shadaj/scala-minecraft.g8 targeting spigot (http://www.spigotmc.org/).

Prerequisites
-------------
* Minecraft :D
* giter8 (latest version) (https://github.com/n8han/giter8)
* sbt (latest version) (http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#installing-sbt)

Server set up (easy way)
------------------------

The target server is spigot, install and run instructions on 

    https://github.com/xtordoir/spigot


Using the template
------------------
* Create a template project. Execute

    g8 xtordoir/scala-minecraft

  and follow the prompts (for the first trial plugin you may just accept the defaults)
* Build the plugin. Execute

    sbt package
    
* Use the plugin.
  Copy the jar file generated in the build to the plugins folder of your server