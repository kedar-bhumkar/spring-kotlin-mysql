package com.digital.app.response

import com.digital.app.dao.UserInfo

data class UserDetail(var userInfo: UserInfo?=null, var roles:List<Role>?=null, var resources:List<ResourceDTO>?=null)
