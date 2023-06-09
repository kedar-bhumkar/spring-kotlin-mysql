package com.digital.app.repo

import com.digital.app.dao.UserInfo
import org.springframework.data.repository.CrudRepository

interface UserInfoRepository : CrudRepository<UserInfo, String> {
    fun findByextid(extid:String):List<UserInfo>
}
