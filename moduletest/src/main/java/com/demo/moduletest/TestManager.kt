package com.demo.moduletest

import android.annotation.SuppressLint
import android.content.Context

class TestManager(context: Context?) {

    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var instance: TestManager? = null

        //-----------------------------------------------------------------------------------------------------------------|

        /**
         * This will return the instance of this class and provide a
         * context to this class.
         *
         * @param context [Context] of the host application
         * @return Instance of the [TestManager] class
         */
        @Synchronized
        @Throws(NullPointerException::class)
        fun getInstance(context: Context?): TestManager? {
            if (instance == null) {
                if (context == null) {
                    throw NullPointerException("Null")
                }
                instance = TestManager(context)
            }
            return instance
        }
    }


    fun add(a: Int?, b: Int?): Int? {
        return (a?.plus(b ?: 0)) ?: 0
    }

    fun subtract(a: Int?, b: Int?): Int? {
        return (a?.minus(b ?: 0)) ?: 0
    }

    fun multiple(a: Int?, b: Int?): Int? {
        return (a ?: 0 * (b ?: 0)) ?: 0
    }

}