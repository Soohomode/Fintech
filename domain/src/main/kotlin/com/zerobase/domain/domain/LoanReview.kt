package com.zerobase.domain.domain

import javax.persistence.*

@Entity
@Table(name = "LOAN_REVIEW")
class LoanReview ( // 심사 테이블
    @Column(name = "usr_key")
    val userKey: String,

    @Column(name = "loan_lmt_amt") // 대출 한도 금액
    val loanLimitedAmount: Long,

    @Column(name = "loan_intrt") // 금리
    val loanInterest: Double
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}
