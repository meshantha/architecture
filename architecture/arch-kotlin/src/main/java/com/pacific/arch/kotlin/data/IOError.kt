package com.pacific.arch.kotlin.data

import android.annotation.TargetApi
import java.lang.RuntimeException

class IOError : RuntimeException {
    val code: Int

    constructor(code: Int) : super() {
        this.code = code
    }

    constructor(message: String?, code: Int) : super(message) {
        this.code = code
    }

    constructor(cause: Throwable?, code: Int) : super(cause) {
        this.code = code
    }

    constructor(message: String?, cause: Throwable?, code: Int) : super(message, cause) {
        this.code = code
    }

    @TargetApi(24)
    constructor(message: String?,
                cause: Throwable?,
                enableSuppression: Boolean,
                writableStackTrace: Boolean,
                code: Int) : super(message, cause, enableSuppression, writableStackTrace) {
        this.code = code
    }

    companion object {
        @JvmStatic
        fun isIOError(throwable: Throwable): Boolean {
            return throwable is IOError
        }

        @JvmStatic
        fun from(throwable: Throwable): IOError {
            return throwable as? IOError ?: IOError(throwable.message!!, throwable.cause!!, -1)
        }
    }
}