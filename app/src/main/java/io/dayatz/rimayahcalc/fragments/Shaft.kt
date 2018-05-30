package io.dayatz.rimayahcalc.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.dayatz.rimayahcalc.R
import kotlinx.android.synthetic.main.fragment_shaft.*

class Shaft: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_shaft, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_hitung.setOnClickListener {
            textview_result.text = "${this.calculateResult()} gram"
        }
    }

    fun calculateResult() : String {
        val actualLength = actual_length.text.toString().toFloat()
        val expectedLength = expected_length.text.toString().toFloat()
        val expectedWeight = expected_weight.text.toString().toFloat()
        val result = actualLength / expectedLength * expectedWeight
        return "%.2f".format(result)
    }
}