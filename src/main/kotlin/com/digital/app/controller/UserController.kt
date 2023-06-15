package com.digital.app.controller


import com.digital.app.exception.AppException
import com.digital.app.response.ResourceDTO
import com.digital.app.response.UserDetail
import com.digital.app.service.MessageService
import com.digital.app.service.ResourceService
import com.digital.app.service.UserInfoService
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
@RestController
@CrossOrigin

class UserController(val userInfoService: UserInfoService,  val resourceService: ResourceService, val service: MessageService) {


    @GetMapping("/user")
    //fun index(@PathVariable id: String, @PathVariable type: String): ResponseEntity<Any> {
    fun index(@RequestParam userId: String, @RequestParam(required = false)  cmpType: String?): ResponseEntity<Any> {
        val mapper = jacksonObjectMapper()
        var res:ResponseEntity<Any>
        val userDetail = UserDetail()
        print("Passed...  id $userId  and type is $cmpType")
        try {
            userDetail.userInfo = userInfoService.findUserByExtId(userId)[0]
            print("Response - $userDetail.userInfo ")


            userDetail.roles = mapper.readValue(userDetail.userInfo!!.metadata.toString())
            print("Roles - $userDetail.roles")

            val resources = resourceService.findResourcesByType(cmpType?:"APP", "public")

            val resDTOs = mutableListOf<ResourceDTO>()

            resources.forEach { resDTOs.add(ResourceDTO(it, mapper.readValue(it.metadata.toString()))) }


            userDetail.resources = resDTOs
            res = ResponseEntity(userDetail, HttpStatus.OK)
        }catch(ex:AppException){
            res = ex.errResponse()
        }
        return res

    }
}

