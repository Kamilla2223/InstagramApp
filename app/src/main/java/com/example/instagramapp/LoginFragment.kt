package com.example.instagramapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import com.example.instagramapp.databinding.FragmentLoginBinding

class LoginFragment:Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.password.doOnTextChanged { text, start, before, count ->
            if (text != null) {
                binding.btnLogin.isClickable = text.trim().length >= PASSWORD_MIN_CHARS
            }
        }

        binding.btnLogin.setOnClickListener {
            for (i in 0..parentFragmentManager.backStackEntryCount)
                parentFragmentManager.popBackStack()
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, AccountFragment())
                .addToBackStack("acc")
                .commit()
        }
    }

    companion object {
        const val PASSWORD_MIN_CHARS = 8
    }
}