package util

sealed class LCE {
    object Loading : LCE()
    object Content : LCE()
    class Error<Throwable> : LCE()
}