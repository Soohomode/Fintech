package com.zerobase.api.loan.request

class LoanRequestDto {
    data class LoanRequestInputDto(
        val userName: String, // 이름
        val userIncomeAmount: Long, // 소득
        var userRegistrationNumber: String // 주민번호
    ) {
        fun toUserInfoDto(userKey: String) =
            UserInfoDto(
                userKey, userName, userRegistrationNumber, userIncomeAmount
            )
    }

    data class LoanRequestResponseDto(
        val userKey: String
    )
}