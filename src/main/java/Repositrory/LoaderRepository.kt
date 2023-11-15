package Repositrory

import Model.User
import RetrofitService.RetrofitHelper
import RetrofitService.UserService


class DataLoaderRepository {
    suspend fun loadUsers(): List<User> {
        val apiService = RetrofitHelper.getRetrofit().create(UserService::class.java)
        return apiService.getUsers()
    }
}