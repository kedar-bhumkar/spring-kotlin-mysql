package com.digital.app.dao

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("USER_INFO")
data class UserInfo(@Id var userid: String, val extid: String ="", val firstname: String, val lastname: String,  @JsonIgnore  val metadata: String?=null)
