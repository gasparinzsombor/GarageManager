package util

sealed class LCE {
    object Loading : LCE()
    object Content : LCE()
    data class Error<T: Throwable>(val error: T) : LCE()
}