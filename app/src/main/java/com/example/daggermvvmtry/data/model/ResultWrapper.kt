package com.example.daggermvvmtry.data.model

import com.google.gson.annotations.SerializedName

data class ResultWrapper<T>(

    var page: Int,
    var results: List<T>,
    @SerializedName("total_results")
    var totalResults: Int,
    @SerializedName("total_pages")
    var totalPages: Int

)