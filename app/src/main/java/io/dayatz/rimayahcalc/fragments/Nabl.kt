package io.dayatz.rimayahcalc.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.dayatz.rimayahcalc.R
import kotlinx.android.synthetic.main.fragment_nabl.*

class Nabl: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_nabl, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_hitung_lbs.setOnClickListener {
            tv_8gpp.text = "${this.calculateResult(8)} g"
            tv_9gpp.text = "${this.calculateResult(9)} g"
            tv_10gpp.text = "${this.calculateResult(10)} g"
        }
    }

    fun calculateResult(gpp:Int) : String {
        val lbs = lbs.text.toString().toInt()
        val result = lbs * gpp * 0.06479891
        return "%.2f".format(result.toFloat())
    }
}