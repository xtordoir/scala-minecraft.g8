package $package$

import $package$.ScalaPlugin

import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.Listener
import org.bukkit.event.EventHandler

import org.bukkit.command.Command
import org.bukkit.command.CommandSender

class $classname$ extends ScalaPlugin {
  override def onCommand(sender: CommandSender, cmd: Command, label: String, args: Array[String]): Boolean = {
  	true
  }

  def handleBlockPlacement = (event: BlockPlaceEvent) => {
    val player = event.getPlayer
    val block = event.getBlockPlaced

    val location = block.getLocation()
    player.sendMessage("You placed a " + block.getType + " at " + "(" + location.getBlockX + "," + location.getBlockY + "," + location.getBlockZ + ")")
  }

  override def onEnable() {
    getServer.getPluginManager.registerEvents(handleBlockPlacement, this);
  }
}