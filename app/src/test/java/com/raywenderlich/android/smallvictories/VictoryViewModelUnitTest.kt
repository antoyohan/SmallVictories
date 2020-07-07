package com.raywenderlich.android.smallvictories

import org.junit.Test

import org.junit.Assert.*

class VictoryViewModelUnitTest {

    @Test
    fun addNumbers() {
        var viewModel = VictoryViewModel()
        val res = viewModel.addNumbers(10, 15)

        assertEquals(15, res)
    }
}