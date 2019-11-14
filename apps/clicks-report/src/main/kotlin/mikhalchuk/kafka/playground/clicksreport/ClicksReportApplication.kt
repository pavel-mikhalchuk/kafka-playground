package mikhalchuk.kafka.playground.clicksreport

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClicksReportApplication

fun main(args: Array<String>) {
	runApplication<ClicksReportApplication>(*args)
}
