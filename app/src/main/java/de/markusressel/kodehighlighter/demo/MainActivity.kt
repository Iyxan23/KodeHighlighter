package de.markusressel.kodehighlighter.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import de.markusressel.kodehighlighter.language.markdown.MarkdownSyntaxHighlighter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initTextViewSamples()
        initEditTextSample()
    }

    private fun initTextViewSamples() {
        val markdownText = "# Title\n\n## Subtitle\n\n```kotlin\nval sample = 5\n```"
        createSpannable(markdownText).apply {
            MarkdownSyntaxHighlighter().highlight(this)
            markdownLight.text = this
        }

        createSpannable(markdownText).apply {
            MarkdownSyntaxHighlighter().apply {
            }.highlight(this)
            markdownDark.text = this
        }
    }

    /**
     * Creates a Spannable from a text
     */
    private fun createSpannable(text: String): SpannableString {
        return SpannableString.valueOf(text)
    }

    private fun initEditTextSample() {
//        val javaHighlighter = JavaSyntaxHighlighter()
//        editText.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
//
//            override fun afterTextChanged(s: Editable?) {
//                s?.let {
//                    javaHighlighter.highlight(it)
//                }
//            }
//        })
//
//        val java = "class Test {\n\n  private final String text = \"Hallo!\";\n\n}"
//        editText.setText(java)
    }
}
