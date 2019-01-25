package de.markusressel.kodehighlighter.language.kotlin.colorscheme

import android.graphics.Color
import android.text.style.CharacterStyle
import android.text.style.ForegroundColorSpan
import de.markusressel.kodehighlighter.language.kotlin.rule.*
import de.markusressel.kodehighlighter.core.SyntaxColorScheme
import de.markusressel.kodehighlighter.core.SyntaxHighlighterRule
import java.util.*

/**
 * A dark color scheme for markdown text
 */
class DarkBackgroundColorScheme : SyntaxColorScheme {

    override fun getStyles(type: SyntaxHighlighterRule): Set<() -> CharacterStyle> {
        return when (type) {
            is ImportKeywordRule, is PackageKeywordRule, is ClassKeywordRule, is OpenKeywordRule, is ReturnKeywordRule, is FunctionKeywordRule, is VisibilityKeywordRule, is VarKeywordRule -> {
                setOf({ ForegroundColorSpan(Color.parseColor("#FF6D00")) })
            }
            is AnnotationRule -> {
                setOf({ ForegroundColorSpan(Color.parseColor("#FF6D00")) })
            }
            is CommentRule -> {
                setOf({ ForegroundColorSpan(Color.parseColor("#33691E")) })
            }
            is NumberRule -> {
                setOf({ ForegroundColorSpan(Color.parseColor("#01579B")) })
            }
            else -> Collections.emptySet()
        }
    }

}