package com.hofstadtchristopher.basal_o_mat.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "BasalRates")
data class BasalRate(
    @ColumnInfo(name = "00")
    var rate00: Int = 0,

    @ColumnInfo(name = "01")
    var rate01: Int = 0,

    @ColumnInfo(name = "02")
    var rate02: Int = 0,

    @ColumnInfo(name = "03")
    var rate03: Int = 0,

    @ColumnInfo(name = "04")
    var rate04: Int = 0,

    @ColumnInfo(name = "05")
    var rate05: Int = 0,

    @ColumnInfo(name = "06")
    var rate06: Int = 0,

    @ColumnInfo(name = "07")
    var rate07: Int = 0,

    @ColumnInfo(name = "08")
    var rate08: Int = 0,

    @ColumnInfo(name = "09")
    var rate09: Int = 0,

    @ColumnInfo(name = "10")
    var rate10: Int = 0,

    @ColumnInfo(name = "11")
    var rate11: Int = 0,

    @ColumnInfo(name = "12")
    var rate12: Int = 0,

    @ColumnInfo(name = "13")
    var rate13: Int = 0,

    @ColumnInfo(name = "14")
    var rate14: Int = 0,

    @ColumnInfo(name = "15")
    var rate15: Int = 0,

    @ColumnInfo(name = "16")
    var rate16: Int = 0,

    @ColumnInfo(name = "17")
    var rate17: Int = 0,

    @ColumnInfo(name = "18")
    var rate18: Int = 0,

    @ColumnInfo(name = "19")
    var rate19: Int = 0,

    @ColumnInfo(name = "20")
    var rate20: Int = 0,

    @ColumnInfo(name = "21")
    var rate21: Int = 0,

    @ColumnInfo(name = "22")
    var rate22: Int = 0,

    @ColumnInfo(name = "23")
    var rate23: Int = 0,

    @ColumnInfo(name = "Name")
    val name: String,

    @ColumnInfo(name = "Note")
    var note: String = ""
    ) {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    var id: Int = 0

    fun dayRate(): Int {
        return (rate00
                + rate01
                + rate02
                + rate03
                + rate04
                + rate05
                + rate06
                + rate07
                + rate08
                + rate09
                + rate10
                + rate11
                + rate12
                + rate13
                + rate14
                + rate15
                + rate16
                + rate17
                + rate18
                + rate19
                + rate20
                + rate21
                + rate22
                + rate23)
    }
}