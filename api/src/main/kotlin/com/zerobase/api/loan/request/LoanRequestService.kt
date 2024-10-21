package com.zerobase.api.loan.request

import com.zerobase.domain.domain.UserInfo

interface LoanRequestService {
    //
    fun loanRequestMain(
        loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): LoanRequestDto.LoanRequestResponseDto
    // 유저 정보 저장 메서드
    fun saveUserInfo(
        userInfoDto: UserInfoDto
    ): UserInfo
    // 대출 심사 메서드
    fun loanRequestReview(userKey: String)
}