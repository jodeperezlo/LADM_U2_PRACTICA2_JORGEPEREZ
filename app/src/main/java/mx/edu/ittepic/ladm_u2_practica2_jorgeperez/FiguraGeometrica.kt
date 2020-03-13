package mx.edu.ittepic.ladm_u2_practica2_jorgeperez

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 0
    var incY = 0
    var img : Bitmap ?= null;

    constructor(img : Bitmap, x:Int, y:Int, rapidez : Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.img = img
        this.ancho = img.width.toFloat()
        this.alto = img.height.toFloat()
        incX = rapidez
        incY = rapidez
    }

    fun pintar(c: Canvas, p: Paint) {
        c.drawBitmap(img!!, x, y, p)
    }

    fun rebote(ancho:Int, alto:Int) {
        x += incX
        if(x <= -100 || x >= ancho){
            incX *= -1
        }

        y += incY
        if(y <= -100 || y >= alto){
            incY *= -1
        }
    }
}