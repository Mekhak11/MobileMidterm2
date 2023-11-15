package Model

import com.google.gson.annotations.SerializedName

data class UsersResponse(
    val users: List<User>
)

data class User(
    @SerializedName("name") val name: String,
    @SerializedName("email") val email: String,
)