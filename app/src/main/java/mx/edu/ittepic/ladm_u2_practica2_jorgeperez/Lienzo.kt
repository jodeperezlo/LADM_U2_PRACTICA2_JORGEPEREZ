package mx.edu.ittepic.ladm_u2_practica2_jorgeperez

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

class Lienzo(p : MainActivity) : View(p) {
    var puntero = p

    var esfera1 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.esferauno), 200, 200, 8)
    var esfera2 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.esferados), 750, 1000,7)
    var esfera3 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.esferatres), 150, 600, 6)
    var esfera4 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.esferacuatro), 100, 200, 5)
    var esfera5 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.esferacinco), 500, 900, 4)
    var esfera6 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.esferaseis), 900, 400,3)
    var esfera7 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.esferasiete), 10, 1000, 2)


    var fondo = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.fondodbs), 0, 0, 0)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        fondo.pintar(canvas, paint)

        esfera1.pintar(canvas, paint)
        esfera2.pintar(canvas, paint)
        esfera3.pintar(canvas, paint)
        esfera4.pintar(canvas, paint)
        esfera5.pintar(canvas, paint)
        esfera6.pintar(canvas, paint)
        esfera7.pintar(canvas, paint)
    }

    fun movimientoEsfera(){
        esfera1.rebote(width, height)
        esfera2.rebote(width, height)
        esfera3.rebote(width, height)
        esfera4.rebote(width, height)
        esfera5.rebote(width, height)
        esfera6.rebote(width, height)
        esfera7.rebote(width, height)
        invalidate()
    }
}