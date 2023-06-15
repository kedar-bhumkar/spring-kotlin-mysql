package com.digital.app.repo

import com.digital.app.dao.Resource
import org.springframework.data.repository.CrudRepository

interface ResourceRepository : CrudRepository<Resource, String> {


    fun findResourcesByType(type:String, defaultaccess:String):List<Resource>

    fun findResourcesBydefaultaccess(defaultaccess:String):List<Resource>

    fun findResourcesByName(name:String):List<Resource>

}

