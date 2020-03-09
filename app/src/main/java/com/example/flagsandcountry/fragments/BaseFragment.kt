package com.example.flagsandcountry.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.example.flagsandcountry.activities.BaseActivity

abstract class BaseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    @LayoutRes
    abstract fun getLayoutId(): Int

    protected open fun init() {
    }

    protected fun getBaseActivity(): BaseActivity {
        return activity as BaseActivity
    }

    fun showToast(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun showToast(@StringRes msg: Int) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun showProgress() {
        getBaseActivity().showProgress()
    }

    fun hideProgress() {
        getBaseActivity().hideProgress()
    }
}