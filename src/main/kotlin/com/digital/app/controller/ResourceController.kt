package com.digital.app.controller

import com.digital.app.exception.AppException
import com.digital.app.response.ResourceDTO
import com.digital.app.service.ResourceService
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
@RestController
@CrossOrigin

class ResourceController(val resourceService: ResourceService) {
    @GetMapping("/docs")
    //fun index(@PathVariable id: String, @PathVariable type: String): ResponseEntity<Any> {
    fun index(@RequestParam name: String): ResponseEntity<Any> {
        val mapper = jacksonObjectMapper()
        var res: ResponseEntity<Any>

        print("Passed...  res type  $name")
        try {


            val resources = resourceService.findResourcesByName(name?:"APP")

            val resDTOs = mutableListOf<ResourceDTO>()

            resources.forEach { resDTOs.add(ResourceDTO(it, mapper.readValue(it.metadata.toString()))) }


            res = ResponseEntity(resDTOs, HttpStatus.OK)
        }catch(ex: AppException){
            res = ex.errResponse()
        }
        return res

    }
}