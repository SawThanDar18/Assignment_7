package com.example.assignment_7.data.models

import com.example.assignment_7.network.dataagents.RetrofitDataAgentImpl

open class BaseModel {
    protected val dataAgent = RetrofitDataAgentImpl
}