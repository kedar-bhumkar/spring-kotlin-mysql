package com.digital.app.exception

import com.digital.app.constants.AppConstants
import com.digital.app.response.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

data class AppException(override var message:String , var errorCode: Int, var errorMessage : String) : RuntimeException() {
    fun errResponse(): ResponseEntity<Any> {
        val res:ResponseEntity<Any>
        res = when(errorCode ) {
            500 -> ResponseEntity(ErrorResponse(errorCode, errorMessage, message), HttpStatus.INTERNAL_SERVER_ERROR)
            401 -> ResponseEntity(ErrorResponse(errorCode, errorMessage, message), HttpStatus.UNAUTHORIZED)
            400 -> ResponseEntity(ErrorResponse(errorCode, errorMessage, message), HttpStatus.BAD_REQUEST)
            else -> ResponseEntity(ErrorResponse(AppConstants.DEFAULT_ERR_CODE, AppConstants.DEFAULT_ERR_MESSAGE, AppConstants.DEFAULT_ERR_MESSAGE), HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return res
    }
}
