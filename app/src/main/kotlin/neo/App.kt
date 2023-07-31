package neo

// import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener

class App : JavaPlugin(), Listener {
    // val greeting: String
    //     get() {
    //         return "Hello World!"
    //     }

    override fun onEnable() {
        logger.info("Hello, world!")
        server.pluginManager.registerEvents(this, this)
    }

    override fun onDisable() {
        logger.info("See you again, later!")
    }
}

// fun main() {
//     println(App().greeting)
// }
