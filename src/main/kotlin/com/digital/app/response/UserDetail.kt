package com.digital.app.response

import com.digital.app.dao.UserInfo
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.annotations.SerializedName

data class UserDetail(var userInfo: UserInfo?=null, var roles:List<Role>?=null,@param:JsonProperty("resource") @SerializedName("resource") var resources:List<ResourceDTO>?=null)
