package de.markusressel.kodehighlighter.language.json.colorscheme

import android.graphics.Color
import android.text.style.ForegroundColorSpan
import de.markusressel.kodehighlighter.core.StyleFactory
import de.markusressel.kodehighlighter.core.SyntaxColorScheme
import de.markusressel.kodehighlighter.core.SyntaxHighlighterRule
import de.markusressel.kodehighlighter.language.json.rule.LanguageRule
import de.markusressel.kodehighlighter.language.json.rule.NumericRule
import de.markusressel.kodehighlighter.language.json.rule.StringRule
import java.util.Collections.emptySet

/**
 * A dark color scheme for java
 */
class DarkBackgroundColorScheme : SyntaxColorScheme {

    override fun getStyles(type: SyntaxHighlighterRule): Set<StyleFactory> {
        return when (type) {
            is StringRule -> {
                setOf({ ForegroundColorSpan(Color.parseColor("#6A8759")) })
            }
            is NumericRule -> {
                setOf({ ForegroundColorSpan(Color.parseColor("#7C4DFF")) })
            }
            is LanguageRule -> {
                setOf({ ForegroundColorSpan(Color.parseColor("#FF6D00")) })
            }
            else -> emptySet()
        }
    }

}