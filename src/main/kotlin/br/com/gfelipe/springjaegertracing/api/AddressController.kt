package br.com.gfelipe.springjaegertracing.api

import br.com.gfelipe.springjaegertracing.service.AddressService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/addresses")
class AddressController(
    private val addressService: AddressService
) {

    val logger: Logger = LoggerFactory.getLogger(AddressController::class.java)

    @ResponseBody
    @GetMapping("/{zipCode}")
    fun findAddress(@PathVariable("zipCode") zipCode: String): Map<String, Any> {
        logger.info("[AddressController] Receiving request with zipCode {}", zipCode)
        return addressService.findAddressByZipCode(zipCode)
    }

}
