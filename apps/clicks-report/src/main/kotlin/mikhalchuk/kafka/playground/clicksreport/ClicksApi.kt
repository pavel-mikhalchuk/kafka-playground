package mikhalchuk.kafka.playground.clicksreport

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.ConcurrentHashMap

@RestController
class ClicksApi {

    val clicks = ConcurrentHashMap<String, Int>()

    @PostMapping("/clicks")
    fun registerClick(@RequestBody click: String) {
        val buttonId = click.split(" ")[1]
        clicks.compute(buttonId) { _, count -> if (count == null) 1 else count + 1 }
    }

    @GetMapping("/clicks")
    fun report(): Map<String, Int> = clicks
}