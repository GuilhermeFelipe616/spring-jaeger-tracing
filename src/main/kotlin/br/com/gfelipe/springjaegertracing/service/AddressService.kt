package br.com.gfelipe.springjaegertracing.service

import br.com.gfelipe.springjaegertracing.integration.ViaCepAPI
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class AddressService(
    private val viaCepAPI: ViaCepAPI
) {

    val logger: Logger = LoggerFactory.getLogger(AddressService::class.java)

    fun findAddressByZipCode(zipCode: String): Map<String, Any> {
        val address = viaCepAPI.findAddressByZipCode(zipCode)
        logger.info("[AddressService] Address with ZipCode {}: {}", zipCode, address)
        return address
    }

}
