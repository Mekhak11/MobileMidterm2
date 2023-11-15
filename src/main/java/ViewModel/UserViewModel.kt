package ViewModel
import Model.User
import Repositrory.DataLoaderRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {
    private val repository = DataLoaderRepository()
    private val _liveDataUsers = MutableLiveData<List<User>>()
    val liveDataUsers: LiveData<List<User>> = _liveDataUsers

    fun loadUsers() {
        viewModelScope.launch {
            _liveDataUsers.postValue(repository.loadUsers())
        }
    }

}