package com.digital.app.response

import com.digital.app.dao.Resource
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.annotations.SerializedName

data class ResourceDTO(val resource: Resource,   @param:JsonProperty("metadata") @SerializedName("metadata")   val documentMetadata:List<DocumentMetadata>? )
