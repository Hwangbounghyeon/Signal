package com.ongo.signal.data.model.login

import com.google.gson.annotations.SerializedName

data class IDCheckResponse(
    @SerializedName("duplicated")val duplicated: Boolean
)