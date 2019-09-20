package com.example.assignment_7.data.models

import com.example.assignment_7.network.dataagents.DataAgent
import com.example.assignment_7.network.dataagents.RetrofitDataAgentImpl

open class BaseModel {

    protected lateinit var dataAgent: DataAgent

    fun BaseModel() {
        dataAgent = RetrofitDataAgentImpl.getInstance()
    }
}