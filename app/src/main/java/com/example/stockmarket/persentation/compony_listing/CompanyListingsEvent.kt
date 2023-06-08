package com.example.stockmarket.persentation.compony_listing

sealed class CompanyListingsEvent {
    object Refresh: CompanyListingsEvent()
    data class OnSearchQueryChange(val query: String): CompanyListingsEvent()
}
