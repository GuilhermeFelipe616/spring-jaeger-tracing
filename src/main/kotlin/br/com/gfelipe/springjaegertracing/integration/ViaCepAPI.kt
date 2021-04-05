package br.com.gfelipe.springjaegertracing.integration

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@FeignClient("addressService", url = "http://viacep.com.br")
interface ViaCepAPI {

    @ResponseBody
    @GetMapping("/ws/{zipCode}/json/", consumes = ["application/json"])
    fun findAddressByZipCode(@PathVariable("zipCode") zipCode: String): Map<String, Any>

}
