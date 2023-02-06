package com.id.myunittest.ui


import android.os.Bundle
import com.id.myunittest.R
import com.id.myunittest.data.CuboidModel

class MainViewModel(
    private val cuboidModel: CuboidModel
    ) {
    fun getCircumference() = cuboidModel.getCircumference()
    fun getSurfaceArea() = cuboidModel.getSurfaceArea()
    fun getVolume() = cuboidModel.getVolume()
    fun save(w: Double, l: Double, h: Double) {
        cuboidModel.save(w, l, h)
    }
}