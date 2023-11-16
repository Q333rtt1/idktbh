package me.qurti.idktbh

import me.qurti.idktbh.listeners.JoinLeaveListener
import me.qurti.idktbh.listeners.ShearSheepListener
import me.qurti.idktbh.listeners.XPBottleBreakListener
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerBedLeaveEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(), Listener {
    override fun onDisable() {

    }

    override fun onEnable() {
        println("Plugin is enabled yippii")
        server.pluginManager.registerEvents(this, this)
        server.pluginManager.registerEvents(ShearSheepListener(), this)
        server.pluginManager.registerEvents(XPBottleBreakListener(), this)
        server.pluginManager.registerEvents(JoinLeaveListener(), this)
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent)  {
        val player = event.player
        println("A player has joined the server.")
    }
    @EventHandler
    fun onLeaveBed(event: PlayerBedLeaveEvent) {
        val player = event.player
        player.health = 0.0
        player.sendMessage("You left a bed! Die")
    }


}